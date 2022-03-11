package controller;

import model.Customer;
import model.Product;
import storage.CustomerFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    List<Customer> customerList = CustomerFile.readFile();

    public Customer customerInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID khách hàng: ");
        String customerId = scanner.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập địa chỉ khách hàng: ");
        String address = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        String numberPhone = scanner.nextLine();
        Customer customer = new Customer(customerId, name, address, numberPhone);
        return customer;
    }

    public void addCustomer()  throws IOException {
        Customer customer = customerInfo();
        customerList.add(customer);
        CustomerFile.writeFile(customerList);
    }

    public void editCustomerById(String id, Customer customer) throws  IOException{
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(id)){
                customerList.get(i).setCustomerId(customer.getCustomerId());
                customerList.get(i).setName(customer.getName());
                customerList.get(i).setAddress(customer.getAddress());
                customerList.get(i).setNumberPhone(customer.getNumberPhone());
                CustomerFile.writeFile((customerList));
            }
        }
    }

    public void deleteCustomerById(String id) throws  IOException{
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId().equals(id)){
                customerList.remove(i);
            }
            CustomerFile.writeFile(customerList);
        }
    }

    public void displayCustomer(){
        for (Customer customer:customerList
             ) {
            System.out.println(customer);
        }
    }
    public CustomerManager() {
    }

    public CustomerManager(List<Customer> customerList) {
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "CustomerManager{" +
                "customerList=" + customerList +
                '}';
    }
}
