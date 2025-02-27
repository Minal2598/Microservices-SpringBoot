package net.javaguides.banking.service;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.entity.Account;
import net.javaguides.banking.mapper.AccountMapper;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long accountId);

    List<AccountDto> getAllAccount();

    //AccountDto updateAccount(Long id, AccountDto accountDto);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    void deleteAccount(Long accountId);
}
