package model;

import java.util.ArrayList;

public class ShoppingCart extends Customer{
    private boolean isPaid;

    public ShoppingCart() {
    }

    public ShoppingCart(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public ShoppingCart(String customerId, String name, String address, String numberPhone, boolean isPaid) {
        super(customerId, name, address, numberPhone);
        this.isPaid = isPaid;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "isPaid=" + isPaid +
                '}';
    }
}
