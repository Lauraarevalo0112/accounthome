package com.home.account_ms.controllers;

import com.home.account_ms.exceptions.AccountNotFoundExceptions;
import com.home.account_ms.models.Account;
import com.home.account_ms.repositories.AccountRepository;
import org.springframework.web.bind.annotation.*;
@RestController
public class AccountController {
    private final AccountRepository accountRepository;
    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @GetMapping("/accounts/{username}")
    Account getAccount(@PathVariable String username){
        return accountRepository.findById(username)
                .orElseThrow(() -> new AccountNotFoundExceptions("No se encontro una cuenta con el username asociado a la empresa Home: " + username));
    }
    @PostMapping("/accounts")
    Account newAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }
}
