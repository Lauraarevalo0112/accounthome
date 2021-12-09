package com.home.account_ms.controllers;


import com.home.account_ms.exceptions.AccountNotFoundExceptions;
import com.home.account_ms.models.Account;
import com.home.account_ms.models.Transaction;
import com.home.account_ms.repositories.AccountRepository;
import com.home.account_ms.repositories.TransactionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@RestController
public class TransactionController {
    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;
    public TransactionController(AccountRepository accountRepository,
                                 TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }
    @PostMapping("/transactions")
    Transaction newTransaction(@RequestBody Transaction transaction){
        Account accountOrigin =
                accountRepository.findById(transaction.getUsernameOrigin()).orElse(null);

        if (accountOrigin == null)
            throw new AccountNotFoundExceptions("No se encontró una cuenta con el username:" + transaction.getUsernameOrigin());


        transaction.setDate(new Date());
        return transactionRepository.save(transaction);
    }
    @GetMapping("/transactions/{username}")
    List<Transaction> userTransaction(@PathVariable String username){
        Account userAccount = accountRepository.findById(username).orElse(null);
        if (userAccount == null)

        throw new AccountNotFoundExceptions("No se encontro una cuenta con el username:" + username);
                List<Transaction> transactionsOrigin =
                        transactionRepository.findByUsernameOrigin(username);

        List<Transaction> transactions = transactionRepository.findByUsernameOrigin(username);
            return transactions;
    }
}
