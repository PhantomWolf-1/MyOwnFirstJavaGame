package dataStore;

import objects.item.Item;
import objects.item.Weapon;

import java.util.ArrayList;

public class Inventory {

    private Item weaponInUse;
    private ArrayList<Item> items;


    public Inventory() {
        this.weaponInUse = new Weapon("my dick", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary");
        this.items = new ArrayList<>();

        this.items.add(new Weapon("legendary sword", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));
        this.items.add(new Weapon("wooden", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));
        this.items.add(new Weapon("stone", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));
        this.items.add(new Weapon("iron", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));
        this.items.add(new Weapon("diamond", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));
        this.items.add(new Weapon("netherite", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));
        this.items.add(new Weapon("dragon", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));
        this.items.add(new Weapon("fffff", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary"));

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

    public ArrayList<Item> allItems(){
        return this.items;
    }

}
