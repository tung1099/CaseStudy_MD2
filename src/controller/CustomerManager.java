package controller;

import model.Customer;
import model.Product;
import storage.CustomerFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    ArrayList<Customer> customerArrayList = new ArrayList<>();

    public CustomerManager() {
    }

    public CustomerManager(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public Customer customerInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        String customerId = scanner.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng: ");
        String address = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        String numberPhone = scanner.nextLine();
        Customer customer = new Customer(customerId, name, address, numberPhone);
        return customer;
    }

    public void addCustomer()  throws IOException {
        Customer customer = customerInfo();
        customerArrayList.add(customer);
        CustomerFile.writeFile(customerArrayList);
    }

    public void editCustomerById(String id, Customer customer) throws  IOException{
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getCustomerId().equals(id)){
                customerArrayList.get(i).setCustomerId(customer.getCustomerId());
                customerArrayList.get(i).setName(customer.getName());
                customerArrayList.get(i).setAddress(customer.getAddress());
                customerArrayList.get(i).setNumberPhone(customer.getNumberPhone());
                CustomerFile.writeFile((customerArrayList));
            }
        }
    }

    public void deleteCustomer(int index) throws  IOException{
        customerArrayList.remove(index);
        CustomerFile.writeFile(customerArrayList);
    }

    public void displayCustomer(){
        for (Customer customer:customerArrayList
             ) {
            System.out.println(customer);
        }
    }
}
