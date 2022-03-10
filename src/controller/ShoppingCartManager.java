package controller;

import model.ShoppingCart;
import storage.ShoppingCartFile;

import java.util.List;

public class ShoppingCartManager {
    List<ShoppingCart> shoppingCartList = ShoppingCartFile.readFile();

}
