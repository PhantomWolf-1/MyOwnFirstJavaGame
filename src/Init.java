import dataStore.Data;
import objects.Player;
import objects.classChoiceStats;
import screens.ActionHandler;
import screens.ChoicePanels;
import screens.Frame;
import screens.Pane;
import story.StageOne;

import javax.swing.*;


public class Init {

    public static Data buildData() {

        Data data = new Data();

        frame(data);
        pane(data);
        handler(data);
        player(data);
        stats(data);
        choicePanels(data);

        mainTextArea(data);
        choiceOptionInGame(data);
        playerStats(data);

        button1(data);
        button2(data);
        button3(data);
        button4(data);
        inventoryButton(data);
        inventoryScreen(data);


        profilePic(data);
        picLabel(data);
        itemPic(data);
        labelItemPic(data);

        stageOne(data);

        return data;
    }


    private static void frame(Data data) {
        data.setFrame(new Frame(150, 50, 1600, 950, true));
    }

    private static void pane(Data data) {
        data.setPane(new Pane(data));
    }

    private static void handler(Data data) {
        data.setHandler(new ActionHandler(data));
    }

    private static void player(Data data) {
        data.setPlayer(new Player());
    }

    private static void stats(Data data) { data.setStats(new classChoiceStats()); }

    private static void choicePanels(Data data) {
        data.setChoicePanels(new ChoicePanels());
    }

    private static void mainTextArea(Data data) {
        data.setMainTextGame(new JTextArea());
    }

    private static void choiceOptionInGame(Data data){ data.setPlayerChoiceOptionInGame(new JTextArea());}

    private static void playerStats(Data data) {
        data.setPlayerStatsMainGame(new JTextArea());
    }

    private static void button1(Data data) {
        data.setChoice1(new JButton());
    }

    private static void button2(Data data) {
        data.setChoice2(new JButton());
    }

    private static void button3(Data data) {
        data.setChoice3(new JButton());
    }

    private static void button4(Data data) {
        data.setChoice4(new JButton());
    }

    private static void inventoryButton(Data data){ data.setInventoryButton(new JButton()); }

    private static void inventoryScreen(Data data){ data.setInventoryScreen(new Frame(300, 200, 500, 300, false));}

    private static void profilePic(Data data) {
        data.setProfilePic(new ImageIcon());
    }

    private static void picLabel(Data data) {
        data.setLabelPic(new JLabel());
    }

    private static void itemPic(Data data){ data.setItemPic(new ImageIcon());}

    private static void labelItemPic(Data data){ data.setLabelItemPic(new JLabel());}

    private static void stageOne(Data data) {
        data.setStageOne(new StageOne(data));
    }


}
