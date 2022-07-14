package com.letscode.controller;

import com.letscode.dto.ShopperRequest;
import com.letscode.model.Shopper;
import com.letscode.service.ShopperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shopper")
public class ShopperController {

    private final ShopperService shopperService;

    @PostMapping
    public Mono<Shopper> createShopper(@RequestBody ShopperRequest shopperRequest) {
        return shopperService.createShopper(shopperRequest);
    }

    @GetMapping
    public Flux<Shopper> findAllShoppers() {
        return shopperService.findAllShoppers();
    }

    @GetMapping("/{id}")
    public Mono<Shopper> findShopperById(@PathVariable String id) {
        return shopperService.findById(id);
    }

    @PutMapping("/{id}")
    public Mono<Shopper> updateShopper(@PathVariable String id, @RequestBody ShopperRequest shopperRequest) {
        return shopperService.updateShopper(id, shopperRequest);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteShopperById(@PathVariable String id) {
        return shopperService.deleteById(id);
    }
}
