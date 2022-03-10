package storage;

import model.Customer;
import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerFile {
    public static void writeFile(List<Customer> customerList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos=null;
        try {
            fos = new FileOutputStream("customer.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(customerList);
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
    public static List<Customer> readFile(){
        File file = new  File("customer.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<Customer> customerList = (List<Customer>) result;
            ois.close();
            fis.close();
            return customerList;
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
