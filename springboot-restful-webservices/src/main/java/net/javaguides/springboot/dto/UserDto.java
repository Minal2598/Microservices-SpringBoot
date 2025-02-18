package net.javaguides.springboot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long userId;

    // Client has requirement -> User first Name should not be null or empty
    @NotEmpty(message = "User first Name should not be null or empty")
    private String firstName;

    // Client has requirement -> User Last Name should not be null or empty
    @NotEmpty(message = "User Last Name should not be null or empty")
    private String lastName;

    // Client has requirement -> Email Address should not be null or empty
    // Email Address should be valid
    @NotEmpty(message = " Email Address should not be null or empty")
    @Email(message = "Email Address should be valid")
    private String email;
}
