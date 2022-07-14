package com.letscode.validators;

import com.letscode.dto.ShopperRequest;
import com.letscode.model.Shopper;
import com.letscode.repository.ShopperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopperValidators {

    private final ShopperRepository shopperRepository;

    public List<String> validateShopper(Shopper shopper) {

        List<String> validationErrors = new ArrayList<>();

        if (!StringUtils.hasText(shopper.getName())) {
            validationErrors.add("Name is required");
        }

        if (!StringUtils.hasText(shopper.getEmail())) {
            validationErrors.add("Email is required");
        }

        if (!StringUtils.hasText(shopper.getPassword())) {
            validationErrors.add("Password is required");
        }

        if (!StringUtils.hasText(shopper.getCpf())) {
            validationErrors.add("CPF is required");
        }

        if (shopperRepository.findById(shopper.getId()).block() == null) {
            validationErrors.add("Shopper does not exist");
        }

        return validationErrors;
    }
}
