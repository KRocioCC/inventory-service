package com.ecommerce.inventory_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryResponseDTO {

    private String id;
    private String sku;
    private Integer quantity;
    private boolean inStock; //campo que calculara para el Frontend


}
