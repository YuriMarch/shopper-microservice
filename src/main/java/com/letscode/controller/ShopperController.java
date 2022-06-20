package com.letscode.controller;

import com.letscode.dto.ShopperRequest;
import com.letscode.dto.ShopperResponse;
import com.letscode.model.Shopper;
import com.letscode.service.ShopperService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shopper")
public class ShopperController {

    private final ShopperService shopperService;

    @PostMapping
    public ShopperResponse createShopper(@RequestBody ShopperRequest shopperRequest) {
        return shopperService.createShopper(shopperRequest);
    }

    @GetMapping
    public List<Shopper> findAllShoppers() {
        return shopperService.findAllShoppers();
    }

    @GetMapping("/{id}")
    public Shopper findShopperById(@PathVariable String id) {
        return shopperService.findById(id);
    }

    @PutMapping("/{id}")
    public ShopperResponse updateShopper(@PathVariable String id, @RequestBody ShopperRequest shopperRequest) {
        return shopperService.updateShopper(id, shopperRequest);
    }
}
