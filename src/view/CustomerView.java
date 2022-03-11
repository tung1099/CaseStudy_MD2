package view;

import controller.CustomerManager;
import model.Customer;
import model.Product;
import storage.CustomerFile;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    public static void displayCustomerView() throws IOException{
        List<Customer> customerList = null;
        customerList = CustomerFile.readFile();
        CustomerManager customerManager = new CustomerManager(customerList);

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("..................................");
            System.out.println("QUẢN LÝ KHÁCH HÀNG");
            System.out.println("1. Thêm khách hàng ");
            System.out.println("2. Sửa thông tin khách hàng");
            System.out.println("3. Xóa thông tin khách hàng ");
            System.out.println("4. Hiển thị toàn bộ thông tin khách hàng");
            System.out.println("0. Quay lại");
            choice = scanner.nextInt();

            Scanner sc = new Scanner(System.in);
            switch (choice){
                case 1:
                    customerManager.addCustomer();
                    break;
                case 2:
                    System.out.println("Danh sách khách hàng hiện tại");
                    for (Customer customer:customerList
                         ) {
                        System.out.println(customer);
                    }
                    System.out.print("Nhập ID khách hàng muốn sửa: ");
                    String id = sc.nextLine();
                    System.out.println("Nhập lại thông tin khách hàng");
                    Customer customer = customerManager.customerInfo();
                    try {
                        customerManager.editCustomerById(id, customer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Danh sách khách hàng hiện tại");
                    for (Customer customers :customerList
                    ) {
                        System.out.println(customers );
                    }
                    System.out.print("Nhập ID khách hàng muốn xóa: ");
                    id = sc.nextLine();
                    try {
                        customerManager.deleteCustomerById(id);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    customerManager.displayCustomer();
                    break;
            }
        }
    }
}
