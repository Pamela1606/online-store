package com.online.store.service.itemSale;

import com.online.store.models.ItemSale;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemSaleConverter {

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Convert ItemSaleDto to ItemSale
     *
     * @param itemSaleDto a ItemSaleDto
     * @return a ItemSale entity
     */
    public ItemSale toModel(ItemSaleDto itemSaleDto) {
        return modelMapper.map(itemSaleDto, ItemSale.class);
    }

    /**
     * Convert ItemSale to ItemSaleDto
     *
     * @param itemSale a ItemSale
     * @return a ItemSaleDto entity
     */
    public ItemSaleDto toDto(ItemSale itemSale) {
        return modelMapper.map(itemSale, ItemSaleDto.class);
    }
}
