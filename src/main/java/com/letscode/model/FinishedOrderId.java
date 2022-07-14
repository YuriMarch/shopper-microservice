package com.letscode.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class FinishedOrderId {

    @Id
    private String id = UUID.randomUUID().toString();

    private Shopper shopper;
}
