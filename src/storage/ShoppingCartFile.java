package storage;

import model.Product;
import model.ShoppingCart;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartFile {
    public static void writeFile(List<ShoppingCart> shoppingCartList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos=null;
        try {
            fos = new FileOutputStream("shoppingCart.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(shoppingCartList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            oos.close();
            fos.close();
        }
    }
    public static List<ShoppingCart> readFile(){
        File file = new  File("shoppingCart.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<ShoppingCart> shoppingCartList  = (List<ShoppingCart>) result;
            ois.close();
            fis.close();
            return shoppingCartList ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
