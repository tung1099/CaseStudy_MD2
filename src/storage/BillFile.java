package storage;

import model.Bill;
import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BillFile {
    public static void writeFile(List<Bill> billList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos=null;
        try {
            fos = new FileOutputStream("bill.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(billList);
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
    public static List<Bill> readFile(){
        File file = new  File("bill.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<Bill> billList = (List<Bill>) result;
            ois.close();
            fis.close();
            return billList;
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
