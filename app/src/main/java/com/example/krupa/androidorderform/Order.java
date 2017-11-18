package com.example.krupa.androidorderform;

/**
 * Created by krupa on 11/17/2017.
 */

public class Order {
    private int quantity;
    private double totalPrice;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0){
        this.quantity = quantity;
        setTotalPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = this.quantity * ItemPrice.coffeePrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
