package objects.item;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public abstract class Item {

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

    public ImageIcon getPng() {

        ImageIcon image = null;

        try {
            image = new ImageIcon(ImageIO.read(new File(this.PNG)));


        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (image == null) {
            return new ImageIcon();
        } else {
            return image;
        }
    }

    public abstract void decideRarity(String rarity);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getPNG() {
        return PNG;
    }

    public void setPNG(String PNG) {
        this.PNG = PNG;
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
