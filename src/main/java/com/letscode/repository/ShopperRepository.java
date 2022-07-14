package com.letscode.repository;

import com.letscode.model.Shopper;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ShopperRepository extends ReactiveCrudRepository<Shopper, String> {
}
