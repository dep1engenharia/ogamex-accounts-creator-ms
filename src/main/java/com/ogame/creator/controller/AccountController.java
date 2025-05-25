package com.ogame.creator.controller;

import com.ogame.creator.dto.AccountDTO;
import com.ogame.creator.service.AccountAutomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountAutomationService automationService;

    @PostMapping("/generate")
    @ResponseStatus(HttpStatus.CREATED) // Define status 201 Created
    public List<AccountDTO> generateAccounts(
            @RequestParam(defaultValue = "1") int count,
            @RequestParam String ip) {

        return automationService.createAccounts(count, ip);
    }
}
