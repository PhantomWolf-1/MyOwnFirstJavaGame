package screens;

import dataStore.Data;

import javax.swing.*;
import java.awt.*;

public class InventoryScreen {

    private Data data;

    public InventoryScreen(Data data) {
        this.data = data;
    }

    public Container screen(){

        Container inventory = new Container();
        JPanel panel = new JPanel();

        panel.setBounds(0, 0, 1000, 650);
        panel.setBackground(Color.black);
        panel.setLayout(null);

        JButton button = new JButton("hello");
        button.setBounds(100,100,100,50);
        button.setActionCommand("test");
        button.addActionListener(this.data.getHandler());

        panel.add(button);
        inventory.add(panel);

        return inventory;
    }

}
