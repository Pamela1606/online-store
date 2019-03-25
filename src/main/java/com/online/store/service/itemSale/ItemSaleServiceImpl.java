package com.online.store.service.itemSale;

import com.online.store.models.ItemSale;
import com.online.store.repository.ItemSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.Optional;

@Service
public class ItemSaleServiceImpl implements ItemSaleService {

    @Autowired
    private ItemSaleRepository itemSaleRepository;

    @Autowired
    private ItemSaleConverter itemSaleConverter;

    @Override
    public Page<ItemSaleDto> findAll(Pageable pageable) {
        return itemSaleRepository.findAll(pageable).map(itemSaleConverter::toDto);
    }

    @Override
    public ItemSaleDto createEntity(ItemSaleDto itemSaleDto) {
        ItemSale itemSale = itemSaleRepository.save(itemSaleConverter.toModel(itemSaleDto));
        return itemSaleConverter.toDto(itemSale);
    }

    @Override
    public ItemSaleDto updateEntity(ItemSaleDto itemSaleDto) {
        Optional<ItemSale> saleDetailOptional = itemSaleRepository.findById(itemSaleDto.getId());
        if (!saleDetailOptional.isPresent()) {
            throw new InvalidParameterException(String.format("The ItemSale with %d not exist.", itemSaleDto.getId()));
        }
        itemSaleRepository.save(itemSaleConverter.toModel(itemSaleDto));
        return itemSaleDto;
    }

    @Override
    public ItemSaleDto deleteEntity(Long id) {
        Optional<ItemSale> saleDetailOptional = itemSaleRepository.findById(id);
        if (!saleDetailOptional.isPresent()) {
            throw new InvalidParameterException(String.format("The ItemSale with %d not exist.", id));
        }
        itemSaleRepository.delete(saleDetailOptional.get());
        return itemSaleConverter.toDto(saleDetailOptional.get());
    }
}
