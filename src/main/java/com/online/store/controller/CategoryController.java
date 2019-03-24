package com.online.store.controller;

import com.online.store.service.brand.BrandDto;
import com.online.store.service.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "v1/brands")
public class CategoryController {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public ResponseEntity<Object> getBrands(Pageable pageable) {
        return new ResponseEntity<>(brandService.findAll(pageable).getContent(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createBrand(@RequestBody BrandDto brandDto) {
        return ResponseEntity.ok(brandService.createEntity(brandDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateBrand(@PathVariable(value = "id") Long id, @RequestBody BrandDto brandDto) {
        return ResponseEntity.ok(brandService.updateEntity(brandDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteBrand(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(brandService.deleteEntity(id));
    }
}
