package com.letscode.service;

import com.letscode.dto.ShopperRequest;
import com.letscode.dto.ShopperResponse;
import com.letscode.model.Shopper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ShopperService {
    Mono<Shopper> createShopper(ShopperRequest shopperRequest);
    Flux<Shopper> findAllShoppers();
    Mono<Shopper> findById(String id);
    Mono<Shopper> updateShopper(String id, ShopperRequest shopperRequest);
    Mono<Void> deleteById(String id);
}
