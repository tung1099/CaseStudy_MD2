package Client;

import view.CustomerView;
import view.ProductView;
import view.ShoppingCartView;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("----------MENU-----------");
            System.out.println("1. Quản lý sản phẩm");
            System.out.println("2. Quản lý khách hàng");
            System.out.println("3. Quản lý giỏ hàng");
            System.out.println("4. Quản lý hóa đơn");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    try {
                        ProductView.displayProductView();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        CustomerView.displayCustomerView();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        ShoppingCartView.displayShoppingCartView();
                    } catch (IOException e){
                        e.printStackTrace();
                }
                case 4:
            }
        }
    }
}
