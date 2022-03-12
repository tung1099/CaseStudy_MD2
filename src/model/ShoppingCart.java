package model;

import java.io.Serializable;
import java.util.ArrayList;

public class ShoppingCart implements Serializable {
    Customer customer;
    ArrayList<Product> productArrayList;
    private boolean isPaid;

    public ShoppingCart() {
    }

    public ShoppingCart(Customer customer, ArrayList<Product> productArrayList, boolean isPaid) {
        this.customer = customer;
        this.productArrayList = productArrayList;
        this.isPaid = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
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
                "customer=" + customer +
                ", productArrayList=" + productArrayList +
                ", isPaid=" + isPaid +
                '}';
    }
}



