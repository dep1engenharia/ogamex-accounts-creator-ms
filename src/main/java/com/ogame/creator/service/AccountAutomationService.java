package com.ogame.creator.service;

import com.ogame.creator.dto.AccountDTO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AccountAutomationService {


    private final String password = "ogame2025";

    public List<AccountDTO> createAccounts(int count, String ip) {
        List<AccountDTO> createdAccounts = new ArrayList<>();
        String url = "http://" + ip + "/login";
        for (int i = 0; i < count; i++) {
            // System.setProperty("webdriver.gecko.driver", "geckodriver/geckodriver.exe");

            WebDriver driver = new FirefoxDriver(getFirefoxOptions());

            try {
                driver.get(url);
                Thread.sleep(1000);

                String email = generateRandomEmail();

                driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
                driver.findElement(By.xpath("//*[@id=\"regSubmit\"]")).click();

                Thread.sleep(2000);

                try {
                    driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/ul/li[8]/a")).click();
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println("Não foi possível fazer logout. Talvez o registo tenha falhado para o email: " + email);
                }

                createdAccounts.add(new AccountDTO(email, password));
                System.out.println("Conta criada: " + email);

            } catch (Exception e) {
                System.out.println("Erro ao criar conta: " + e.getMessage());
            } finally {
                driver.quit();
            }
        }

        return createdAccounts;
    }

    private FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("-headless"); // correr sem UI
        options.addArguments("--no-sandbox"); // essencial em container
        options.addArguments("--disable-dev-shm-usage"); // previne falhas com memória partilhada
        options.addArguments("--disable-gpu"); // remove aceleração gráfica
        options.addArguments("--ignore-certificate-errors");
        return options;
    }

    private String generateRandomEmail() {
        String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        return uuid + "@gmail.com";
    }
}