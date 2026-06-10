package com.ecommerce.inventory_service.mapper;

import com.ecommerce.inventory_service.dto.InventoryRequestDTO;
import com.ecommerce.inventory_service.dto.InventoryResponseDTO;
import com.ecommerce.inventory_service.model.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface InventoryMapper {

    Inventory toModel(InventoryRequestDTO requestDTO);

    //si tengo el campo mayo a 0 pone el campo inStock en true, si no lo pone en false
    @Mapping(target = "inStock", expression = "java(inventory.getQuantity() > 0)")

    InventoryResponseDTO toInventoryResponseDTO(Inventory inventory);


}
