package it.epicode.u5_w3_d5.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserLoginDTO {

    @Email(message = "Inserire l'email")
    @NotBlank
    private String email;

    @NotBlank(message = "Inserire la password")
    private String password;

    public CharSequence getPassword() {
        return password;
    }
}
