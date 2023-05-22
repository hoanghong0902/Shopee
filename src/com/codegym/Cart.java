package com.codegym;

public class Cart {
    private int id;
    private int customer_id;

    public Cart() {
    }

    public Cart(int id, int customer_id) {
        this.id = id;
        this.customer_id = customer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
