package screens;

import dataStore.Data;
import objects.Player;
import objects.classChoiceStats;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ActionHandler implements ActionListener {

private Data data;


//    public ActionHandler(Frame frame, Pane pane){
//
//        this.frame = frame;
//        this.pane = pane;
//    }

        public ActionHandler(Data data) {

            this.data = data;
        }


    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();


        switch(command){

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
                data.getFrame().setFrame(data.getPane().gameScreen());
                break;

            case "selectMage":
                data.getPlayer().setName(data.getPane().getTextName());
                data.getPlayer().setStatsMage(data.getStats());
                data.getFrame().setFrame(data.getPane().gameScreen());
                break;


                //------------------------------------------------------------------------------------
                //this is the button control for the main buttons of the game

            case "town":
                data.getStageOne().direction(command);
                break;
            case "dungeon":
                data.getStageOne().direction(command);
                break;
            case "shop":
                data.getStageOne().direction(command);
                try {
                    data.setProfilePic(new ImageIcon(ImageIO.read(new File("./src/resource/mage1.png"))));
                    data.getLabelPic().setIcon(this.data.getProfilePic());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                break;
        }


    }
}
