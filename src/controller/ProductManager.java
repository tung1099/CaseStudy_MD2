package controller;

import model.Product;
import storage.ProductFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
         List<Product> productList = ProductFile.readFile();

         public  Product productInfo(){
             Scanner scanner = new Scanner(System.in);
             System.out.println("Nhập Id sản phẩm: ");
             String id = scanner.nextLine();
             System.out.println("Nhập tên sản phẩm: ");
             String name = scanner.nextLine();
             System.out.println("Giới tính: ");
             String gender = scanner.nextLine();
             System.out.println("Màu sắc: ");
             String color = scanner.nextLine();
             System.out.println("Giá sản phẩm; ");
             int price = scanner.nextInt();
             System.out.println("Số lượng: ");
             int quantity = scanner.nextInt();
             Product product = new Product(id, name, gender, color, price, quantity);
             return product;
         }
         public void addProduct() throws IOException{
             Product product = productInfo();
             productList.add(product);
             ProductFile.writeFile(productList);
         }
         public void displayProduct() throws  IOException{
             for (Product product: productList
                  ) {
                 System.out.println(product);
             }
         }
         public void editProductById(String id, Product product) throws  IOException{
             for (int i = 0; i < productList.size(); i++) {
                 if (productList.get(i).getId().equals(id)){
                     productList.get(i).setId(product.getId());
                     productList.get(i).setName(product.getName());
                     productList.get(i).setGender(product.getGender());
                     productList.get(i).setColor(product.getColor());
                     productList.get(i).setPrice(product.getPrice());
                     productList.get(i).setQuantity(product.getQuantity());
                 }
             }
         }
         public void deleteProductById(String id) throws  IOException{
             for (int i = 0; i < productList.size(); i++) {
                 if (productList.get(i).getId().equals(id)){
                     productList.remove(i);
                 }
                 ProductFile.writeFile(productList);
             }
         }
         public  void sortProductByPrice() {
             Collections.sort(productList);
             System.out.println("Danh sách sản phẩm sắp xếp theo giá tiền: ");
             for (Product product: productList
                  ) {
                 System.out.println(product);
             }
         }

    public ProductManager() {
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "productList=" + productList +
                '}';
    }
}
