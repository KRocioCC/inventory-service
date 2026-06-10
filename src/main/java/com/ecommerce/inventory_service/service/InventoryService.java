package com.ecommerce.inventory_service.service;

import com.ecommerce.inventory_service.dto.InventoryRequestDTO;
import com.ecommerce.inventory_service.dto.InventoryResponseDTO;
import java.util.List;

public interface InventoryService {
    //Método para verificar si un producto está en stock
    boolean isInStock(String sku, Integer quantity);
    InventoryResponseDTO createInventory(InventoryRequestDTO inventoryRequest);
    List<InventoryResponseDTO> getAllInventory();
    InventoryResponseDTO updateInventory(Long id, InventoryRequestDTO inventoryRequest);
    void deleteInventory(Long id);
}