package objects.item;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

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

    public ImageIcon getPngPath() {

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
