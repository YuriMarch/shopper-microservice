package com.letscode.service.impl;

import com.letscode.dto.ShopperRequest;
import com.letscode.model.Shopper;
import com.letscode.repository.ShopperRepository;
import com.letscode.service.ShopperService;
import com.letscode.validators.ShopperValidators;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ShopperServiceImpl implements ShopperService {

    private final ShopperRepository shopperRepository;
    private final ShopperValidators shopperValidators;

    @Override
    public Mono<Shopper> createShopper(ShopperRequest shopperRequest) {
        Shopper shopper = Shopper.fromRequest(shopperRequest);
        return shopperRepository.save(shopper);
    }

    @Override
    public Mono<Shopper> findById(String id) {
        return shopperRepository.findById(id);
    }

    @Override
    public Flux<Shopper> findAllShoppers() {
        return shopperRepository.findAll();
    }

    @Override
    public Mono<Shopper> updateShopper(String id, ShopperRequest shopperRequest) {
        Shopper shopper = shopperRepository.findById(id).block();
        assert shopper != null;
        shopper.setName(shopperRequest.getName());
        shopper.setEmail(shopperRequest.getEmail());
        shopper.setPassword(shopperRequest.getPassword());
        val validationErrors = shopperValidators.validateShopper(shopper);
        if (!validationErrors.isEmpty()) {
            return Mono.error(new IllegalArgumentException(String.join(", ", validationErrors)));
        }
        shopperRepository.save(shopper);
        return Mono.just(shopper);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return shopperRepository.deleteById(id);
    }
}
