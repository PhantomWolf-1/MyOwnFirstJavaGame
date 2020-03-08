package objects;

import dataStore.Data;
import dataStore.Inventory;
import objects.item.Weapon;

import java.util.Scanner;

public class Player {

    private Inventory inventory;

    private String name;
    private int lvl;
    private int money;

    private int exp;
    private int expNeeded;
    private int health;
    private int maxHealth;
    private int attack;
    private double critChance;
    private double blockChance;


    public Player(Data data) {
        this.inventory = new Inventory(data);

        this.name = "";
        this.health = 0;
        this.maxHealth = 0;
        this.attack = 0;
        this.critChance = 0;
        this.blockChance = 0;

        this.lvl = 1;
        this.exp = 0;
        this.expNeeded = 10;

        this.money = 0;
    }



    public void attackUP() {
        setAttack(this.attack + 2);

    }
    public void healthUP() {
        setHealth(this.health + 2);
        setMaxHealth(this.maxHealth + 2);
    }
    public void blockChanceUP() {
        setBlockChance(this.blockChance + 2);
    }
    public void critChanceUP(){

        setCritChance(this.critChance + 2);
    }

    public void expUP(int EXP){
        int rest = 0;

        this.exp = this.exp + EXP;

        if(this.exp >= this.expNeeded){
            rest = this.exp - this.expNeeded;
            this.exp = 0 + rest;
            this.expNeeded = this.expNeeded + 10;
            this.lvl++;
            lvlUP();
        }

    }

    public void lvlUP(){

        while (true) {
            System.out.println("What do you want to upgrade?");
            System.out.println("type 1 for max health");
            System.out.println("Type 2 for attack");
            System.out.println("Type 3 for defense");
            //hier de critchance
            Scanner scanner = new Scanner(System.in);
            int typeUpgrade = Integer.parseInt(scanner.nextLine());

            if (typeUpgrade == 1) {
                healthUP();
                break;
            } else if (typeUpgrade == 2) {
                attackUP();
                break;

            } else if (typeUpgrade == 3) {
                blockChanceUP();
                break;

            } else if (typeUpgrade == 4){
                critChanceUP();
                break;

            } else{
                System.out.println("Entered a wrong option");
            }
            System.out.println("------------------------------------------------------");
        }

        this.health = this.maxHealth;

    }


    public void setStatsKnight(classChoiceStats stats){

        stats.setKnight(this);
    }
    public void setStatsArcher(classChoiceStats stats){

        stats.setArcher(this);
    }
    public void setStatsMage(classChoiceStats stats){

        stats.setMage(this);
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String geName(){
        return this.name;
    }


    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExpNeeded() {
        return expNeeded;
    }

    public void setExpNeeded(int expNeeded) {
        this.expNeeded = expNeeded;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    public double getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(double blockChance) {
        this.blockChance = blockChance;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setAttackWithWeapon(Weapon weapon){
        this.attack += weapon.getAttackValue();
    }

      public void lowerAttackWithWeapon(Weapon weapon){
        this.attack -= weapon.getAttackValue();
    }



    // ------------------------- de stats voor de classes ----------------------------------------------------------




    @Override
    public String toString() {
        return "Stats: \n" +
                "\n" +
                this.name + "\n"+
                "money: " + " \n" +
                this.money + " credits" + " \n" +
                "\n" +

                "\n" +
                "lvl = " + lvl + "\n"+
                "health = " + health + "\n"+
                "attack = " + attack + "\n"+
                "critChance = " + (critChance * 100) + "% \n"+
                "blockChance = " + (blockChance * 100) + "% \n"+
                "exp = " + exp + "\n"+
                "expNeeded = " + expNeeded + "\n"
                ;
    }

}
