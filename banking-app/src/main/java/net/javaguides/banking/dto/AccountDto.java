package net.javaguides.banking.dto;

import lombok.*;

//@Data   // lombok automatically generate Getter Setter
/*
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;

}
*/

public record AccountDto(Long id,
                         String accountHolderName,
                         double balance){

}
