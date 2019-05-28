package com.gos.demo.seller;

public class Order {
    private Seller seller;
    private long id;
    private String item;

    public Order(Seller seller, long id, String item) {
        this.seller = seller;
        this.id = id;
        this.item = item;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}