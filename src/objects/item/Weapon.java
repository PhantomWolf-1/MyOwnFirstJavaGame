package objects.item;

public class Weapon extends Item {

    private int attackValue;
    private int durability;

    private enum rarities {
        COMMON,
        RARE,
        LEGENDARY
    }

    private rarities rarity;

    public Weapon(String name, int itemID, int sellPrice, int buyPrice, String pathPNG, int attackValue, String rarity) {
        super(name, itemID, sellPrice, buyPrice, pathPNG);

        this.attackValue = attackValue;

       decideRarity(rarity);

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
        return super.getName()
//                +
//                " : \n" +
//                "attackValue=" + attackValue +
//                ", durability=" + durability +
//                ", rarity=" + rarity
                ;
    }


}
