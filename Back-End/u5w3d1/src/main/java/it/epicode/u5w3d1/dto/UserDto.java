package it.epicode.u5w3d1.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {

    private String name;
    private String surname;
    @Email(message = "Email non valida")
    @NotBlank
    private String email;
    @NotBlank(message = "password non valida")
    private String password;
}
