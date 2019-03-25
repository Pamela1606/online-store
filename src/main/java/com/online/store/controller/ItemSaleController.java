package com.online.store.controller;

import com.online.store.service.itemSale.ItemSaleDto;
import com.online.store.service.itemSale.ItemSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1/itemSales")
public class ItemSaleController {

    @Autowired
    private ItemSaleService itemSaleService;

    @GetMapping
    public ResponseEntity<Object> getItemSales(Pageable pageable) {
        return new ResponseEntity<>(itemSaleService.findAll(pageable).getContent(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createItemSale(@RequestBody ItemSaleDto itemSaleDto) {
        return ResponseEntity.ok(itemSaleService.createEntity(itemSaleDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateItemSale(@PathVariable(value = "id") Long id, @RequestBody ItemSaleDto itemSaleDto) {
        return ResponseEntity.ok(itemSaleService.updateEntity(itemSaleDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteItemSale(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(itemSaleService.deleteEntity(id));
    }
}
