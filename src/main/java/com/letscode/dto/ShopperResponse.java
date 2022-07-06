package com.letscode.dto;

import com.letscode.model.Shopper;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString
public class ShopperResponse {

    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String cpf;

    public ShopperResponse(Shopper shopper){
        this.setId(shopper.getId());
        this.setName(shopper.getName());
        this.setEmail(shopper.getEmail());
        this.setPhoneNumber(shopper.getPhoneNumber());
        this.setCpf(shopper.getCpf());
    }

    public static ShopperResponse fromShopper(Shopper shopper) {
    }
}
