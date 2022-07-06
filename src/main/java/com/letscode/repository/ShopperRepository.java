package com.letscode.repository;

import com.letscode.model.Shopper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ShopperRepository {
    Mono<Shopper> save(Shopper shopper);

    Mono<Shopper> findById(String id);

    Flux<Shopper> findAll();

    Mono<Void> deleteById(String id);
}
