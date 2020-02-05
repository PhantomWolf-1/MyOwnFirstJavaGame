package story;

import dataStore.Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StageOne implements Stage {

    private Data data;
    private boolean firstTimeTown;

    public StageOne(Data data) {

        this.data = data;
        this.firstTimeTown = true;

    }


    @Override
    public void direction(String goToWhere) {

        switch (goToWhere) {

            case "town":
                if (this.firstTimeTown) {
                    townFirstTime();
                } else {
                    town();
                }
                break;

            case "dungeon":
                dungeon();
                break;

            case "shop":
                shop();
                break;

        }
    }


    @Override
    public void townFirstTime() {

        this.firstTimeTown = false;
        this.data.clearButtons();

        this.data.getMainTextGame().setText("Hello new one, welcome to this town. this town is the central of the first stage");
        this.data.getChoice1().setActionCommand("dungeon");
        this.data.getChoice1().setText( "DUNGEON" );

        this.data.getChoice2().setText("SHOP");
        this.data.getChoice2().setActionCommand("shop");
    }

    @Override
    public void town() {

        this.data.clearButtons();

        this.data.getMainTextGame().setText("welcome back in town");
        this.data.getChoice1().setActionCommand("dungeon");
        this.data.getChoice1().setText("DUNGEON");

        this.data.getChoice2().setText("SHOP");
        this.data.getChoice2().setActionCommand("shop");
    }

    @Override
    public void dungeon() {

        this.data.clearButtons();

        this.data.getMainTextGame().setText("your in a dungeon now");
        this.data.getChoice1().setActionCommand("town");
        this.data.getChoice1().setText("TOWN");
    }

    @Override
    public void shop() {

        this.data.clearButtons();

        this.data.getMainTextGame().setText(
                "Welcome to my shop. Are you looking for something?\n" +
                "These are the items in my shop:\n"
        );
        this.data.getChoice4().setText("BACK TO TOWN");
        this.data.getChoice4().setActionCommand("town");


    }

}
