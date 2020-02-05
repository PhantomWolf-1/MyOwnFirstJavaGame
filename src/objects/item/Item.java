package objects.item;

public class Item {

    private String name;
    private int itemID;
    private int sellPrice;
    private int buyPrice;

    private String PNG;


    public Item(String name, int itemID, int sellPrice, int buyPrice, String path) {
        this.name = name;
        this.itemID = itemID;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;

        this.PNG = path;
    }

    public String getPngPath() {

        return this.PNG;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", itemID=" + itemID +
                ", sellPrice=" + sellPrice +
                ", buyPrice=" + buyPrice +
                ", PNG='" + PNG + '\'' +
                '}';
    }
}
