package screens;

import dataStore.Data;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class Pane extends Container {

    private JTextField textFieldName = new JTextField();


    private Data data;


    public Pane(Data data) {

        this.data = data;
        setVisible(true);

    }


    public Container setStartScreen() {

        removeAll();

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1600, 950);
        panel.setBackground(Color.black);
        panel.setLayout(null);


        JLabel startLabel = new JLabel();
        startLabel.setText("A Text Based Game");
        startLabel.setBounds(400, 150, 800, 100);
        startLabel.setForeground(Color.white);
        Font startLabelFont = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 80);
        startLabel.setFont(startLabelFont);


        JButton startButton = new JButton("START");
        startButton.setBounds(650, 500, 300, 100);
        startButton.setBackground(Color.white);
        Font startButtonFont = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 50);
        startButton.setFont(startButtonFont);
        startButton.setActionCommand("start");
        startButton.addActionListener(this.data.getHandler());


        JButton loadButton = new JButton("LOAD");
        loadButton.setBounds(650, 620, 300, 100);
        loadButton.setBackground(Color.white);
        Font loadButtonFont = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 50);
        loadButton.setFont(loadButtonFont);
        loadButton.setActionCommand("load");
        loadButton.addActionListener(this.data.getHandler());

        JLabel created = new JLabel("Created by Lars Rook");
        created.setBounds(10, 875, 300, 50);
        created.setForeground(Color.white);

        panel.add(startLabel);
        panel.add(startButton);
        panel.add(loadButton);
        panel.add(created);

        add(panel);

        return this;
    }


    public Container setChoiceScreen() {

        removeAll();

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1600, 950);
        panel.setBackground(Color.black);
        panel.setLayout(null);


        JLabel nameLabel = new JLabel("Nickname: ");
        nameLabel.setBounds(30, 0, 300, 50);
        nameLabel.setForeground(Color.white);
        Font labelName = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 45);
        nameLabel.setFont(labelName);

        this.textFieldName.setBounds(30, 80, 300, 60);
        Font nameField = new Font("namefield", Font.PLAIN | Font.BOLD, 35);
        this.textFieldName.setFont(nameField);
        this.textFieldName.setDocument(new TextLimiter(15));

        JLabel classLabel = new JLabel("Choose a class:");
        classLabel.setBounds(30, 230, 500, 50);
        classLabel.setForeground(Color.white);
        Font labelClass = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 40);
        classLabel.setFont(labelClass);


        JPanel classes = new JPanel(new GridLayout(3, 1, 0, 10));
        classes.setBounds(30, 300, 1000, 500);
        classes.setBackground(Color.black);



        //the panels for the classes, the choice between three classes.
        classes.add(this.data.getChoicePanels().classKnight(this.data.getHandler()));
        classes.add(this.data.getChoicePanels().classArcher(this.data.getHandler()));
        classes.add(this.data.getChoicePanels().classMage(this.data.getHandler()));



        panel.add(nameLabel);
        panel.add(this.textFieldName);
        panel.add(classLabel);
        panel.add(classes);

        add(panel);
        return this;
    }


    public Container gameScreen() {
        removeAll();

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1600, 950);
        panel.setBackground(Color.black);
        panel.setLayout(null);

        Font buttonFont = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 15);
        Font textAreaFont = new Font("", Font.PLAIN, 18);
        Border border = BorderFactory.createLineBorder(Color.white);

        this.data.getMainTextGame().setBounds(60, 30, 1110, 450);
        this.data.getMainTextGame().setBackground(Color.black);
        this.data.getMainTextGame().setForeground(Color.white);
        this.data.getMainTextGame().setEditable(false);
        this.data.getMainTextGame().setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        this.data.getMainTextGame().setLineWrap(true);
        this.data.getMainTextGame().setFont(textAreaFont);
        this.data.getMainTextGame().setText("The first stage, this is where your adventure will begin! but first, there is a little tutorial to get to know the game. After that you can begin your adventure");

        this.data.getPlayerChoiceOptionInGame().setBounds(60, 500, 1110, 230);
        this.data.getPlayerChoiceOptionInGame().setBackground(Color.black);
        this.data.getPlayerChoiceOptionInGame().setForeground(Color.white);
        this.data.getPlayerChoiceOptionInGame().setEditable(false);
        this.data.getPlayerChoiceOptionInGame().setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        this.data.getPlayerChoiceOptionInGame().setLineWrap(true);


        JPanel statsPanel = new JPanel();
        statsPanel.setBounds(1200, 30, 300, 700);
        statsPanel.setBackground(Color.black);
        statsPanel.setLayout(null);
        statsPanel.setBorder(BorderFactory.createCompoundBorder(border,
                BorderFactory.createEmptyBorder(10,  10, 10, 10)));

        this.data.getPlayerStatsMainGame().setBounds(10, 200, 280, 350);
        this.data.getPlayerStatsMainGame().setBackground(Color.black);
        this.data.getPlayerStatsMainGame().setForeground(Color.white);
        this.data.getPlayerStatsMainGame().setEditable(false);
        this.data.getPlayerStatsMainGame().setFont(textAreaFont);
        this.data.getPlayerStatsMainGame().setText(this.data.getPlayer().toString());

        this.data.getLabelPic().setBounds(0, 0 , 200, 200);
        this.data.getInventoryButton().setBounds(50, 570, 200, 100);
        this.data.getInventoryButton().setText("INVENTORY");
        this.data.getInventoryButton().setActionCommand("inventory");
        this.data.getInventoryButton().addActionListener(this.data.getHandler());
        this.data.getInventoryButton().setFont(buttonFont);

        statsPanel.add(this.data.getLabelPic());
        statsPanel.add(this.data.getPlayerStatsMainGame());
        statsPanel.add(this.data.getInventoryButton());



        this.data.getChoice1().setText("BEGIN");
        this.data.getChoice1().setBounds(60, 780, 210, 110);
        this.data.getChoice1().setBackground(Color.white);
        this.data.getChoice1().setFont(buttonFont);
        this.data.getChoice1().setActionCommand("town");
        this.data.getChoice1().addActionListener(this.data.getHandler());

        this.data.getChoice2().setText("");
        this.data.getChoice2().setBounds(353, 780, 210, 110);
        this.data.getChoice2().setBackground(Color.white);
        this.data.getChoice2().setFont(buttonFont);
        this.data.getChoice2().setActionCommand("begin");
        this.data.getChoice2().addActionListener(this.data.getHandler());

        this.data.getChoice3().setText("");
        this.data.getChoice3().setBounds(656, 780, 210, 110);
        this.data.getChoice3().setBackground(Color.white);
        this.data.getChoice3().setFont(buttonFont);
        this.data.getChoice3().setActionCommand("begin");
        this.data.getChoice3().addActionListener(this.data.getHandler());

        this.data.getChoice4().setText("");
        this.data.getChoice4().setBounds(960, 780, 210, 110);
        this.data.getChoice4().setBackground(Color.white);
        this.data.getChoice4().setFont(buttonFont);
        this.data.getChoice4().setActionCommand("begin");
        this.data.getChoice4().addActionListener(this.data.getHandler());

        panel.add(statsPanel);
        panel.add(this.data.getMainTextGame());
        panel.add(this.data.getPlayerChoiceOptionInGame());
       // panel.add(this.data.getPlayerStatsMainGame());
        panel.add(this.data.getChoice1());
        panel.add(this.data.getChoice2());
        panel.add(this.data.getChoice3());
        panel.add(this.data.getChoice4());


        add(panel);
        return this;
    }


    public Container inventoryScreen(){
        removeAll();

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 300);
        panel.setBackground(Color.black);
        panel.setLayout(null);

        JButton button = new JButton("hello");
        button.setBounds(100,100,100,50);
        button.setActionCommand("test");
        button.addActionListener(this.data.getHandler());

        panel.add(button);



        add(panel);
        return this;
    }


    public String getTextName() {

        if (this.textFieldName.getText().isEmpty()) {
            return "*no name*";
        } else {
            return this.textFieldName.getText();
        }

    }


}
