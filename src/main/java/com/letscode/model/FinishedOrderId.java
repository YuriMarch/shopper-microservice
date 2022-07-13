package com.letscode.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class FinishedOrderId {

    @Id
    private String id;

    private Shopper shopper;
}
