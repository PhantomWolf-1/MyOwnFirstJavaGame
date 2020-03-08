package objects.item;

import javax.swing.*;

public class Weapon extends Item {

    private int attackValue;
    private int durability;


    private enum rarities {
        COMMON,
        RARE,
        LEGENDARY
    }

    private rarities rarity;

    public Weapon(String name, int itemID, int sellPrice, int buyPrice, int attackValue, String rarity, ImageIcon icon) {
        super(name, itemID, sellPrice, buyPrice, icon);

        this.attackValue = attackValue;

        decideRarity(rarity);

    }


    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void lowersDurability() {
        this.durability--;
    }

    public rarities getRarity() {
        return rarity;
    }

    @Override
    public void decideRarity(String rarity) {

        switch (rarity) {
            case "common":
                this.rarity = rarities.COMMON;
                this.durability = 8;
                break;
            case "rare":
                this.rarity = rarities.RARE;
                this.durability = 15;
                break;
            case "legendary":
                this.rarity = rarities.LEGENDARY;
                this.durability = 25;
                break;
        }
    }

    @Override
    public String toString() {
        return super.getName();

    }

    public String viewWeaponInformation(){

        return super.getName() +
                " : \n" +
                "attackValue: " + attackValue + "\n" +
                "durability: " + durability + "\n" +
                "rarity: " + rarity + "\n" +
                "sell price: " + super.getSellPrice() + "\n" +
                super.getBuyPrice()
                ;
    }


}
