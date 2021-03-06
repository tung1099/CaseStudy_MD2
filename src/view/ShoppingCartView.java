package view;

import controller.ShoppingCartManager;
import model.Product;
import storage.CustomerFile;
import storage.ProductFile;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartView {

    public static void displayShoppingCartView() throws IOException{
       ShoppingCartManager shoppingCartManager = new ShoppingCartManager();

       Scanner scanner = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
       int choice = -1;
       while (choice != 0){
           System.out.println("------------------------------");
           System.out.println("QUẢN LÝ GIỎ HÀNG");
           System.out.println("1. Thêm sản phẩm vào giỏ hàng");
           System.out.println("2. Xóa giỏ hàng");
           System.out.println("3. Hiển thị toàn bộ thông tin giỏ hàng");
           System.out.println("0. Quay lại");
           System.out.print("Nhập lựa chọn: ");
           choice = scanner.nextInt();

           switch (choice){
               case 1:
                   System.out.println("Danh sách sản phẩm hiện tại: ");
                   System.out.println(ProductFile.readFile() );
                   System.out.println("Danh sách khách hàng hiện tại; ");
                   System.out.println(CustomerFile.readFile());
                   System.out.print("Nhập ID khách hàng: ");
                   String customerId = sc.nextLine();
                   System.out.print("Nhập ID sản phẩm: ");
                   String productId = sc.nextLine();
                   System.out.print("Nhập số lượng: ");
                   int quantity = sc.nextInt();
                   shoppingCartManager.addShoppingCart(customerId, productId, quantity);
                   break;
               case 2:
                   System.out.println("Danh sách giỏ hàng hiện tại");
                   shoppingCartManager.displayShoppingCart();
                   System.out.print("Nhập mã khách hàng: ");
                   String id = sc.nextLine();
                   try {
                       shoppingCartManager.deleteShoppingCartByCustomerId(id);
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   break;
               case 3:
                   shoppingCartManager.displayShoppingCart();
                   break;
           }
       }
   }
}
