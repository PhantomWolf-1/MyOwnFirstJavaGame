package objects.item;

public class Sword extends Item {

    private int attackValue;
    private int durability;

    private enum rarities {
        COMMON,
        RARE,
        LEGENDARY
    }

    private rarities rarity;

    public Sword(String name, int itemID, int sellPrice, int buyPrice, String pathPNG, int attackValue, String rarity) {
        super(name, itemID, sellPrice, buyPrice, pathPNG);

        this.attackValue = attackValue;

        switch (rarity) {
            case "common":
                this.rarity = rarities.COMMON;
                this.durability = 15;
                break;
            case "rare":
                this.rarity = rarities.RARE;
                this.durability = 25;
                break;
            case "legendary":
                this.rarity = rarities.LEGENDARY;
                this.durability = 40;
                break;
        }

    }


    public void lowersDurability() {
        this.durability--;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "attackValue=" + attackValue +
                ", durability=" + durability +
                ", rarity=" + rarity +
                '}';
    }
}
