package model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String customerId;
    private String name;
    private String address;
    private String numberPhone;

    public Customer() {
    }

    public Customer(String customerId, String name, String address, String numberPhone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String  toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
