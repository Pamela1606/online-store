package com.online.store.service.inventory;

import com.online.store.service.BaseDto;

public class InventoryDto extends BaseDto {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
