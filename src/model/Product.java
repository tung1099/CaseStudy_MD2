package model;

import java.io.Serializable;

public class Product implements Serializable, Comparable<Product> {
    private String id;
    private String name;
    private String gender;
    private String color;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String id, String name, String gender,  String color, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "[Product || " + "ID: " + id +
                "-Tên sản phẩm: " + name +
                "-Giới tính: " + gender +
                "-Màu sắc: " + color +
                "-Giá tiền: " + price +
                "-Số lượng: " + quantity +
                "]";
    }

    @Override
    public int compareTo(Product o) {
        return  price - o.price;
    }
}
