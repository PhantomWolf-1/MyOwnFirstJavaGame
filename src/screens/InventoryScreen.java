package screens;

import dataStore.Data;
import objects.item.Item;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InventoryScreen extends JPanel{

    private Data data;

    public InventoryScreen(Data data) {
        this.data = data;
    }

    public Container screen(){

        Container inventory = new Container();

        setBounds(0, 0, 1000, 650);
        setBackground(Color.black);
        setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 250, 400);



       DefaultListModel<Item> listModel = new DefaultListModel<>();

        for(Item item : this.data.getPlayer().getInventory().allItems()){

            listModel.addElement(item);
        }
        JList<Item> storage = new JList<>(listModel);
        storage.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        storage.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        storage.setVisibleRowCount(-1);

//        JScrollPane listScroller = new JScrollPane(storage);
//        listScroller.setPreferredSize(new Dimension(50, 100));
//        listScroller.setAlignmentX(RIGHT_ALIGNMENT);

//        storage.setBounds(10, 10, 700,100);


        JButton button = new JButton("hello");
        button.setBounds(500, 500 ,100,50);
        button.setActionCommand("test");
        button.addActionListener(this.data.getHandler());

        scrollPane.setViewportView(storage);


        add(scrollPane);
        add(button);
        inventory.add(this);

        return inventory;
    }

    public void paint(Graphics graphics){

        try {
            BufferedImage image = ImageIO.read(new File("./src/resource/inventory_Background.jpg"));
            graphics.drawImage(image, 0, 0,null);
            setOpaque(false);
            super.paint(graphics);
            setOpaque(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
