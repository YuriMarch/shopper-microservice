package com.letscode.service;

import com.letscode.dto.ShopperRequest;
import com.letscode.dto.ShopperResponse;
import com.letscode.model.Shopper;

import java.util.List;

public interface ShopperService {
    ShopperResponse createShopper(ShopperRequest shopperRequest);

    List<Shopper> findAllShoppers();

    Shopper findById(String id);

    ShopperResponse updateShopper(String id, ShopperRequest shopperRequest);
}
