package edu.lldpractice.singletondesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private static CartManager instance;
    List<String> items = new ArrayList<>();

    private CartManager(){
    }

    public static CartManager getInstance(){
        if(instance == null){
            synchronized (CartManager.class) {
                if(instance == null){
                    instance = new CartManager();
                }
            }
        }
        return instance;
    }

    public void addItem(String item){
        items.add(item);
    }

    public void removeItem(String item){
        items.remove(item);
    }

    public List<String> getItems(){
        return items;
    }

    public void clearCart(){
        items.clear();
    }
}
