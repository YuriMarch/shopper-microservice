package com.letscode.repository;

import com.letscode.model.Shopper;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ShopperRepository extends ReactiveCrudRepository<Shopper, String> {
    Mono<Shopper> findFirstByCpf(String cpf);
}
