package com.online.store.bootsptrap;

import com.online.store.repository.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private BrandRepository brandRepository;
    private CategoryRepository categoryRepository;
    private CapacityRepository capacityRepository;
    private ItemRepository itemRepository;
    private CustomerRepository customerRepository;
    private InventoryRepository inventoryRepository;
    private InventoryStateRepository inventoryStateRepository;
    private ItemImageRepository itemImageRepository;
    private ModelItemRepository modelItemRepository;
    private SaleRepository saleRepository;
    private ItemSaleRepository itemSaleRepository;

    public DevBootstrap(BrandRepository brandRepository, CategoryRepository categoryRepository, CapacityRepository capacityRepository,
                        ItemRepository itemRepository, CustomerRepository customerRepository,
                        InventoryRepository inventoryRepository, InventoryStateRepository inventoryStateRepository, ItemImageRepository itemImageRepository,
                        ModelItemRepository modelItemRepository, SaleRepository saleRepository, ItemSaleRepository itemSaleRepository) {
        this.brandRepository = brandRepository;
        this.categoryRepository = categoryRepository;
        this.capacityRepository = capacityRepository;
        this.itemRepository = itemRepository;
        this.customerRepository = customerRepository;
        this.inventoryRepository = inventoryRepository;
        this.inventoryStateRepository = inventoryStateRepository;
        this.itemImageRepository = itemImageRepository;
        this.modelItemRepository = modelItemRepository;
        this.saleRepository = saleRepository;
        this.itemSaleRepository = itemSaleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

    }


}
