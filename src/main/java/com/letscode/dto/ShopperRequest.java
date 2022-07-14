package com.letscode.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter @Setter
@NoArgsConstructor
@ToString
@Entity
public class ShopperRequest {

    @NotEmpty
    private String name;

    @NotEmpty
    @Email(message = "Invalid email")
    private String email;

    @NotEmpty
    private String password;

    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phoneNumber;

    @NotEmpty
    private String cpf;
}
