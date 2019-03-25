package com.online.store.models;

import javax.persistence.*;

@Entity
public class ItemSale extends ModelBase {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sale")
    private Sale sale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_item")
    private Item item;

    public Sale getSale() { return sale; }

    public void setSale(Sale sale) { this.sale = sale; }

    public Item getItem() { return item; }

    public void setItem(Item item) { this.item = item; }


}
