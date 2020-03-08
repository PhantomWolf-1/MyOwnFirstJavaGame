package objects.item;

import javax.swing.*;

public class UsableItem extends Item {


    public UsableItem(String name, int itemID, int sellPrice, int buyPrice, ImageIcon icon) {
        super(name, itemID, sellPrice, buyPrice, icon);
    }

    @Override
    public void decideRarity(String rarity) {

    }


    @Override
    public String toString() {
        return super.toString();
    }
}
