package com.ogame.creator.dto;

public class AccountDTO {
    private String email;
    private String password;

    public AccountDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
