package com.ecommerce.inventory_service.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryRequestDTO {
    @NotBlank(message = "sku is required")
    String sku;

    @NotNull(message = "quantity is required")
    @Min(value = 0, message = "Quantity must be non-negative")
    Integer quantity;
}
