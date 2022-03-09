package model;

public class Product {
    private String id;
    private String name;
    private String gender;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String id, String name, String gender, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
