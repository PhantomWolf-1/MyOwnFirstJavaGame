package dataStore;

import objects.item.Item;
import java.util.ArrayList;

public class Inventory {

    private Item weaponInUse;
    private ArrayList<Item> items;


    public Inventory() {
        this.weaponInUse = new Item("legendary sword", 1, 5000, 10000, "./src/resource/LG_sword1.png");
        this.items = new ArrayList<>();
    }


    public void addItem(Item item){
        this.items.add(item);
    }


    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void setWeaponInUse(Item weapon){
        this.weaponInUse = weapon;
    }

    public Item getWeaponInUse(){
        return this.weaponInUse;
    }

}
