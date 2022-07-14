package com.letscode.model;

import com.letscode.dto.ShopperRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.UUID;

@Getter @Setter
@NoArgsConstructor
@ToString
public class Shopper {

    @Id
    private String id;

    @NotNull
    private String name;

    @NotNull
    private String cpf;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

    @NotNull
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phoneNumber;

    private List<OrderId> orderIds;

    private List<FinishedOrderId> finishedOrderIds;

    public static Shopper fromRequest(ShopperRequest shopperRequest) {
        Shopper shopper = new Shopper();
        shopper.setId(UUID.randomUUID().toString());
        shopper.setName(shopperRequest.getName());
        shopper.setCpf(shopperRequest.getCpf());
        shopper.setEmail(shopperRequest.getEmail());
        shopper.setPassword(shopperRequest.getPassword());
        shopper.setPhoneNumber(shopperRequest.getPhoneNumber());
        return shopper;
    }
}
