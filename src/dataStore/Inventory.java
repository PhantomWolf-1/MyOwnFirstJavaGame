package dataStore;

import objects.item.Item;
import objects.item.UsableItem;
import objects.item.Weapon;

import javax.swing.*;
import java.util.ArrayList;

public class Inventory {

    private Data data;
    private Weapon weaponInUse;
    private ArrayList<Weapon> weapons;
    private ArrayList<UsableItem> items;


    public Inventory(Data data) {
     //   this.weaponInUse = new Weapon("my dick", 1, 1000000, 5000000, "./src/resource/LG_sword1.png", 9000, "legendary");
        this.data = data;
        this.weapons = new ArrayList<>();
        this.items = new ArrayList<>();


            this.weapons.add(new Weapon("rapier",1, 5, 15, 10, "rare", new ImageIcon(data.getAllSpritesKnight().getCommonSprites()[1])));
            this.weapons.add(new Weapon("dragon sword", 2, 15, 30, 20, "rare", new ImageIcon(data.getAllSpritesKnight().getRareSprites()[0])));
            this.weapons.add(new Weapon("health sword", 3, 50, 100, 35, "legendary", new ImageIcon(data.getAllSpritesKnight().getLegendarySprites()[0])));

        /**
         * TO DO:
         * images goed proberen te scalen, ze staan nog niet goed!!!
         */

    }


    public void addWeaponToInventory(Weapon item){
        this.weapons.add(item);
    }

    public void removeWeaponFromInventory(Weapon item){
        this.weapons.remove(item);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Weapon> getAllWeapons(){
        return this.weapons;
    }


    public void addItemToInventory(UsableItem item){
        this.items.add(item);
    }

    public void removeItemFromInventory(UsableItem item){
        this.items.remove(item);
    }

    public ArrayList<UsableItem> getItems() {
        return items;
    }

    public void setWeaponInUse(Weapon weapon){
        this.weaponInUse = weapon;
    }

    public Weapon getWeaponInUse(){
        return this.weaponInUse;
    }



}
