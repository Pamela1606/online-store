package com.online.store.service.capacity;

import com.online.store.models.Capacity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CapacityConverter {

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Convert CategoryDto to Capacity
     *
     * @param capacityDto a CategoryDto
     * @return a Brand entity
     */
    public Capacity toModel(CapacityDto capacityDto) {
        return modelMapper.map(capacityDto, Capacity.class);
    }

    /**
     * Convert Capacity to CategoryDto
     *
     * @param capacity a Capacity
     * @return a CategoryDto entity
     */
    public CapacityDto toDto(Capacity capacity) {
        return modelMapper.map(capacity, CapacityDto.class);
    }
}
