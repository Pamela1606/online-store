package com.online.store.models;

import javax.persistence.*;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Item extends ModelBase {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_brand")
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_model_item")
    private ModelItem modelItem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_capacity")
    private Capacity capacity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item", cascade = CascadeType.ALL)
    private Set<ItemImage> itemImages;


    private String name;

    private String description;

    private Double price;

    private Double tax;

    private Double importPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() { return price; }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) { this.tax = tax; }

    public Double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Double importPrice) {
        this.importPrice = importPrice;
    }

    public Brand getBrand() { return brand; }

    public void setBrand(Brand brand) { this.brand = brand; }

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }

    public ModelItem getModelItem() { return modelItem; }

    public void setModelItem(ModelItem modelItem) { this.modelItem = modelItem; }

    public Capacity getCapacity() { return capacity; }

    public void setCapacity(Capacity capacity) { this.capacity = capacity; }

    public Set<ItemImage> getItemImages() { return itemImages; }

    public void setItemImages(Set<ItemImage> itemImages) { this.itemImages = itemImages; }
}
