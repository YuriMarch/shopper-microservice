package com.letscode.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString
public class ShopperRequest {

    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String cpf;
}
