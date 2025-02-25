package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
       description = "UserDto Model Information "
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long userId;

    @Schema(
            description = "User First Name"
    )
    // Client has requirement -> User first Name should not be null or empty
    @NotEmpty(message = "User first Name should not be null or empty")
    private String firstName;

    @Schema(
            description = "User Last Name"
    )
    // Client has requirement -> User Last Name should not be null or empty
    @NotEmpty(message = "User Last Name should not be null or empty")
    private String lastName;

    @Schema(
            description = "User Email Address"
    )
    // Client has requirement -> Email Address should not be null or empty
    // Email Address should be valid
    @NotEmpty(message = " Email Address should not be null or empty")
    @Email(message = "Email Address should be valid")
    private String email;
}
