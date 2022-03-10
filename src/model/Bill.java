package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Bill implements Serializable {
    Customer customer;
    ArrayList<ShoppingCart> shoppingCartArrayList;
    private double totalMoney;

    public Bill() {
    }

    public Bill(Customer customer, ArrayList<ShoppingCart> shoppingCartArrayList, double totalMoney) {
        this.customer = customer;
        this.shoppingCartArrayList = shoppingCartArrayList;
        this.totalMoney = totalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<ShoppingCart> getShoppingCartArrayList() {
        return shoppingCartArrayList;
    }

    public void setShoppingCartArrayList(ArrayList<ShoppingCart> shoppingCartArrayList) {
        this.shoppingCartArrayList = shoppingCartArrayList;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", shoppingCartArrayList=" + shoppingCartArrayList +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
