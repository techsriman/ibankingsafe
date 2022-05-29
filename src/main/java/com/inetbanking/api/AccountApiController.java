package com.inetbanking.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountApiController {
    @Value("${db.username}")
    private String dbUsername;
    @Value("${db.password}")
    private String dbPassword;

    @GetMapping(value = "/{accountNo}/balance", produces = { MediaType.TEXT_PLAIN_VALUE })
    public String getBalance(@PathVariable("accountNo") String accountNo) {
        return "username: " + dbUsername + " password : " + dbPassword;
    }
}
