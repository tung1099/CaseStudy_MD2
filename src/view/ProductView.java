package view;

import controller.CustomerManager;
import controller.ProductManager;
import model.Product;
import storage.ProductFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductView {
    public static void displayProductView() throws IOException {
        List<Product> productList = null;
        productList = ProductFile.readFile();
        ProductManager productManager = new ProductManager(productList);

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("..................................");
            System.out.println("QUẢN LÝ SẢN PHẨM");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm ");
            System.out.println("4. Sắp xếp sản phẩm theo giá tiền");
            System.out.println("5. Hiển thị toàn bộ sản phẩm");
            System.out.println("0. Quay lại");
            choice = scanner.nextInt();

            Scanner sc = new Scanner(System.in);
            switch (choice){
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.println("Danh sách sản phẩm hiện tại");
                    for (Product p : productList
                    ) {
                        System.out.println(p);
                    }
                    System.out.println("Nhập ID phẩm muốn sửa: ");
                    String id = sc.nextLine();
                    Product product = productManager.productInfo();
                    try {
                        productManager.editProductById(id, product);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Danh sách sản phẩm hiện tại");
                    for (Product p : productList
                    ) {
                        System.out.println(p);
                    }
                    System.out.println("Nhập ID phẩm muốn xóa: ");
                    id = sc.nextLine();
                    try {
                        productManager.deleteProductById(id);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    productManager.sortProductByPrice();
                    break;
                case 5:
                    productManager.displayProduct();
                    break;
            }
        }
    }
}
