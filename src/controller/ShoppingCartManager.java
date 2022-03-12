package controller;

import model.Customer;
import model.Product;
import model.ShoppingCart;
import storage.CustomerFile;
import storage.ProductFile;
import storage.ShoppingCartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartManager {
    List<ShoppingCart> shoppingCartList = ShoppingCartFile.readFile();
    List<Product> newtList = new ArrayList<>();
    List<Product> productList = ProductFile.readFile();
    List<Customer> customerList = CustomerFile.readFile();

    public void addShoppingCart(String customerId, String productId, int quantity) throws IOException{
        Customer customer = new Customer();
        Product product;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(productId)){
                Product product1 = productList.get(i);
                product = new Product(product1.getId(), product1.getName(), product1.getGender(),
                        product1.getColor(), product1.getPrice(), product1.getQuantity());
                newtList.add(product);
                product1.setQuantity(product1.getQuantity() - quantity);
                ProductFile.writeFile(productList);
            }
        }
    }
    public void deleteShoppingCartByCustomerId(String customerId) throws IOException{
        for (int i = 0; i < shoppingCartList.size(); i++) {
            if (shoppingCartList.get(i).getCustomer().getCustomerId().equals(customerId)){
                shoppingCartList.remove(i);
            }
        }
        ShoppingCartFile.writeFile(shoppingCartList);
    }
    public void displayShoppingCart(){
        for (ShoppingCart sp : shoppingCartList
             ) {
            System.out.println(sp);
        }
    }

    public ShoppingCartManager() {
    }

    public ShoppingCartManager(List<ShoppingCart> shoppingCartList, List<Product> newtList,
                               List<Product> productList, List<Customer> customerList) {
        this.shoppingCartList = shoppingCartList;
        this.newtList = newtList;
        this.productList = productList;
        this.customerList = customerList;
    }

    public List<ShoppingCart> getShoppingCartList() {
        return shoppingCartList;
    }

    public void setShoppingCartList(List<ShoppingCart> shoppingCartList) {
        this.shoppingCartList = shoppingCartList;
    }

    public List<Product> getNewtList() {
        return newtList;
    }

    public void setNewtList(List<Product> newtList) {
        this.newtList = newtList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "ShoppingCartManager{" +
                "shoppingCartList=" + shoppingCartList +
                ", newtList=" + newtList +
                ", productList=" + productList +
                ", customerList=" + customerList +
                '}';
    }
}
