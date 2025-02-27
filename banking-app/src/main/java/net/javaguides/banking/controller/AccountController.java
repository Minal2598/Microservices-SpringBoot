package net.javaguides.banking.controller;

import lombok.AllArgsConstructor;
import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/accounts")
public class AccountController {

    private AccountService accountService;

    // Build Add Account REST API
    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto){
        AccountDto savedAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    // Build get Account by Id REST API
    @GetMapping("{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable("id") Long accountId){
        AccountDto account = accountService.getAccountById(accountId);
        return new ResponseEntity<>(account,HttpStatus.OK);
    }

    // Build get all Account REST API
    @GetMapping
    public ResponseEntity <List<AccountDto>> getAllAccount(){
         List<AccountDto> accounts = accountService.getAllAccount();
         return new ResponseEntity<>(accounts,HttpStatus.OK);
    }

    // Build Update Account REST API
//    @PutMapping("{id}")
//    public ResponseEntity<AccountDto> updateAccount(@PathVariable("id") Long accountId,
//                                                    @RequestBody AccountDto accountDto){
//        AccountDto updatedAccount = accountService.updateAccount(accountId,accountDto);
//        return new ResponseEntity<>(updatedAccount,HttpStatus.OK);
//    }

    // Deposit REST API
    @PutMapping("{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
                                              @RequestBody Map<String, Double> request){
       Double amount = request.get("amount");
       AccountDto accountDto = accountService.deposit(id,amount);
       return new ResponseEntity<>(accountDto,HttpStatus.OK);
    }

    // withdraw REST API
    @PutMapping("{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
                                               @RequestBody Map<String, Double> request){
        double amount = request.get("amount");
        AccountDto accountDto = accountService.withdraw(id,amount);
        return new ResponseEntity<>(accountDto, HttpStatus.OK);
    }

    // Build Delete Account REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable("id") Long accountId){
        accountService.deleteAccount(accountId);
        return new ResponseEntity<>("Account Successfully Deleted!!",HttpStatus.OK);
    }
}
