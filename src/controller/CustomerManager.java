package controller;

import model.Customer;
import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    ArrayList<Customer> customerArrayList = new ArrayList<>();

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

    public void addCustomer()  {
        Customer customer = customerInfo();
        customerArrayList.add(customer);
    }

    public void editCustomerById(String id, Customer customer) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getCustomerId().equals(id)){
                customerArrayList.get(i).setCustomerId(customer.getCustomerId());
                customerArrayList.get(i).setName(customer.getName());
                customerArrayList.get(i).setAddress(customer.getAddress());
                customerArrayList.get(i).setNumberPhone(customer.getNumberPhone());
            }
        }
    }

    public void deleteCustomer(int index){
        customerArrayList.remove(index);
    }

    public void displayCustomer(){
        for (Customer customer:customerArrayList
             ) {
            System.out.println(customer);
        }
    }
}
