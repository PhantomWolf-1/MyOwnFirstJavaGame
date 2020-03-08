package screens;

import dataStore.Data;
import dataStore.Updatable;
import objects.item.AllGameItems;
import objects.item.Item;
import objects.item.UsableItem;
import objects.item.Weapon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InventoryScreen extends JPanel {

    private Data data;

    private Weapon PreviousweaponSelected;
    private Weapon CurrentweaponSelected;
    private UsableItem usableItemSelected;

    public InventoryScreen(Data data) {
        this.data = data;
        this.PreviousweaponSelected = null;
        this.CurrentweaponSelected = null;
        this.usableItemSelected = null;
    }

    public Container screen() {

        Container inventory = new Container();

        setBounds(0, 0, 1000, 650);
        setBackground(Color.black);
        setLayout(null);


        JTextArea itemInformation = new JTextArea();
        itemInformation.setBounds(600, 50, 300, 500);
        itemInformation.setOpaque(true);

        JScrollPane weapons = new JScrollPane();
        weapons.setBounds(10, 50, 250, 400);
        JList<Weapon> weaponsInventory = getWeaponList();
        weapons.add(weaponsInventory);
        weapons.setViewportView(weaponsInventory);
        weaponsInventory.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (!weaponsInventory.isSelectionEmpty()) {
                    itemInformation.setText(weaponsInventory.getSelectedValue().viewWeaponInformation());
                    CurrentweaponSelected = weaponsInventory.getSelectedValue();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        JScrollPane items = new JScrollPane();
        items.setBounds(280, 50, 250, 400);
        JList<UsableItem> itemsInventory = getUsableItemList();
        items.add(itemsInventory);
        items.setViewportView(itemsInventory);
        items.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (!itemsInventory.isSelectionEmpty()) {
                    itemInformation.setText(itemsInventory.getSelectedValue().toString());
                    usableItemSelected = itemsInventory.getSelectedValue();

                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        JLabel nameWeaponList = new JLabel("WEAPONS: ");
        nameWeaponList.setBounds(10, 35, 80, 10);

        JLabel nameItemList = new JLabel("ITEMS: ");
        nameItemList.setBounds(280, 35, 80, 10);


        JButton button = new JButton("DONE");
        button.setBounds(855, 540, 120, 60);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (CurrentweaponSelected != null) {
                    data.setItemPic(CurrentweaponSelected.getIcon());
                    data.getLabelItemPic().setIcon(data.getItemPic());
                    data.getPlayer().setAttackWithWeapon(CurrentweaponSelected);
                }
                if(PreviousweaponSelected != null){
                    data.getPlayer().lowerAttackWithWeapon(PreviousweaponSelected);
                }

                PreviousweaponSelected = CurrentweaponSelected;

                data.getPlayerStatsMainGame().setText(data.getPlayer().toString());
                data.getFrame().setEnabled(true);
                data.getInventoryScreen().dispose();


            }
        });


        add(itemInformation);
        add(weapons);
        add(items);
        add(nameWeaponList);
        add(nameItemList);
        add(button);
        inventory.add(this);

        return inventory;
    }


    public JList<Weapon> getWeaponList() {


        DefaultListModel<Weapon> weaponsFromInventory = new DefaultListModel<>();
        for (Weapon item : this.data.getPlayer().getInventory().getAllWeapons()) {

            weaponsFromInventory.addElement(item);
        }

        JList<Weapon> fromInventory = new JList<>(weaponsFromInventory);
        fromInventory.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        fromInventory.setLayoutOrientation(JList.VERTICAL);
        fromInventory.setVisibleRowCount(-1);

        return fromInventory;
    }


    public JList<UsableItem> getUsableItemList() {


        DefaultListModel<UsableItem> itemsFromInventory = new DefaultListModel<>();
        for (UsableItem item : this.data.getPlayer().getInventory().getItems()) {

            itemsFromInventory.addElement(item);
        }

        JList<UsableItem> fromInventory = new JList<>(itemsFromInventory);
        fromInventory.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        fromInventory.setLayoutOrientation(JList.VERTICAL);
        fromInventory.setVisibleRowCount(-1);

        return fromInventory;
    }


    public void paint(Graphics graphics) {

        try {
            BufferedImage image = ImageIO.read(new File("./src/resource/inventory_Background.jpg"));
            graphics.drawImage(image, 0, 0, null);
            setOpaque(false);
            super.paint(graphics);
            setOpaque(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
