package screens;

import dataStore.Data;
import objects.Player;
import objects.classChoiceStats;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ActionHandler implements ActionListener {

    private Data data;
    private InventoryScreen inventoryScreen;


//    public ActionHandler(Frame frame, Pane pane){
//
//        this.frame = frame;
//        this.pane = pane;
//    }

    public ActionHandler(Data data) {

        this.data = data;
        this.inventoryScreen = new InventoryScreen(data);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();


        switch (command) {

            case "start":
                data.getFrame().setFrame(data.getPane().setChoiceScreen());
                break;

            case "load":
                System.out.println("loading...");
                break;

            case "selectKnight":
                data.getPlayer().setName(data.getPane().getTextName());
                data.getPlayer().setStatsKnight(data.getStats());
                try {
                    data.setProfilePic(new ImageIcon(ImageIO.read(new File("./src/resource/Knight1.png"))));
                    data.getLabelPic().setIcon(this.data.getProfilePic());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                data.getFrame().setFrame(data.getPane().gameScreen());
                break;

            case "selectArcher":
                data.getPlayer().setName(data.getPane().getTextName());
                data.getPlayer().setStatsArcher(data.getStats());
                try {
                    data.setProfilePic(new ImageIcon(ImageIO.read(new File("./src/resource/archer1.png"))));
                    data.getLabelPic().setIcon(this.data.getProfilePic());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                data.getFrame().setFrame(data.getPane().gameScreen());
                break;

            case "selectMage":
                data.getPlayer().setName(data.getPane().getTextName());
                data.getPlayer().setStatsMage(data.getStats());
                try {
                    data.setProfilePic(new ImageIcon(ImageIO.read(new File("./src/resource/mage1.png"))));
                    data.getLabelPic().setIcon(this.data.getProfilePic());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                data.getFrame().setFrame(data.getPane().gameScreen());
                break;


            //------------------------------------------------------------------------------------
            //this is the button control for the main buttons of the game
            /**

             TO DO:
             let the dialog work with some changes for the main screen.
             And make a update function for al the data that is printed in the main frame.
             case "inventory":
             data.getInventoryScreen().setFrame(this.data.getPane().inventoryScreen());
             data.getInventoryScreen().setFrameVisible();
             break;
             case "test":
             JDialog dialog = new JDialog(data.getFrame(), "Inventory", true);
             dialog.setBackground(Color.blue);
             dialog.pack();
             dialog.setLocationRelativeTo(null);
             dialog.setVisible(true);
             break;
             **/

            case "inventory":
                this.data.getInventoryScreen().setFrame(this.inventoryScreen.screen());
                this.data.getFrame().setEnabled(false);
                this.data.getInventoryScreen().setFrameVisible();
                break;

            case "test":
                this.data.getPlayer().attackUP();
                this.data.getPlayerStatsMainGame().setText(data.getPlayer().toString());
                this.data.getFrame().setEnabled(true);
                this.data.getInventoryScreen().dispose();

               break;
            case "town":
                data.getStageOne().direction(command);
                break;
            case "dungeon":
                data.getStageOne().direction(command);
                break;
            case "shop":
                data.getStageOne().direction(command);
                break;
        }


    }
}
