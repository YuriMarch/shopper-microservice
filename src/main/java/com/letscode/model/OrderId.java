package com.letscode.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@Getter @Setter
@NoArgsConstructor
public class OrderId {

    @Id
    private String id;

    private Shopper shopper;
}
