package view;

import java.io.IOException;
import java.util.Scanner;

public class ShoppingCartView {
    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int choice = -1;
            while (choice != 0 ){
                System.out.println("__________MENU___________");
                System.out.println("1. Quản lý sản phẩm");
                System.out.println("2. Thông tin khách hàng");
                System.out.println("3. Giỏ hàng");
                System.out.println("0. Exit");
                System.out.println("Lựa chọn; ");
                choice  = scanner.nextInt();
                switch (choice) {
                    case 1:
                        try {
                            ProductView.displayProductView();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
        }
    }
}
