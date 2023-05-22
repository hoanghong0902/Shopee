package com.codegym;

public class Cart_line {
    private int id;
    private int product_id;
    private int cart_id;
    private long totalPrice;
    public Cart_line() {
    }

    public Cart_line(int id, int product_id, int cart_id, long totalPrice) {
        this.id = id;
        this.product_id = product_id;
        this.cart_id = cart_id;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
