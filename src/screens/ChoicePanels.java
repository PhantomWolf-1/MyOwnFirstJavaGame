package screens;

import dataStore.Data;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ChoicePanels {


    private JTextArea textAreaKnight = new JTextArea();
    private JTextArea textAreaArcher = new JTextArea();
    private JTextArea textAreaMage = new JTextArea();


    public ChoicePanels(){
    }


    public JPanel classKnight(ActionHandler handler){
        JPanel knight = new JPanel();
        knight.setLayout(null);
        knight.setBounds(0,0,1000, 150);
        knight.setBackground(Color.red.darker().darker().darker());

        this.textAreaKnight.setEditable(false);
        this.textAreaKnight.setBounds(300,10,300, 130);
        this.textAreaKnight.setBackground(Color.red.darker().darker().darker());
        this.textAreaKnight.setForeground(Color.white);


        try {
            JLabel picture = new JLabel(new ImageIcon(ImageIO.read(new File("./src/resource/knight1.png"))));
            picture.setBounds(50, 0 , 158, 155);
            knight.add(picture);
        } catch (IOException e) {
            e.printStackTrace();
        }


        this.textAreaKnight.setText(
                "KNIGHT, stats: \n" +
                        " \t Health : 10 \n" +
                        "\t Attack : 5 \n" +
                        "\t Block chance : 25 % \n" +
                        "\t Critical hit chance : 10 % \n"
        );


        Font textKnight = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 20);
        this.textAreaKnight.setFont(textKnight);

        JButton selectKnight = new JButton("SELECT");
        selectKnight.setBounds(820,40,160,80);
        selectKnight.setActionCommand("selectKnight");
        selectKnight.addActionListener(handler);

        knight.add(selectKnight);
        knight.add(this.textAreaKnight);

        return knight;
    }

    public JPanel classArcher(ActionHandler handler){
        JPanel archer = new JPanel();
        archer.setLayout(null);
        archer.setBounds(0,0,1000, 150);
        archer.setBackground(Color.green.darker().darker().darker());

        this.textAreaArcher.setBounds(300, 10, 300, 130);
        this.textAreaArcher.setBackground(Color.green.darker().darker().darker());
        this.textAreaArcher.setForeground(Color.white);
        this.textAreaArcher.setEditable(false);

        try {
            JLabel picture = new JLabel(new ImageIcon(ImageIO.read(new File("./src/resource/archer1.png"))));
            picture.setBounds(30, -20 , 180, 180);
            archer.add(picture);
        } catch (IOException e) {
            e.printStackTrace();
        }



        this.textAreaArcher.setText(
                "ARCHER, stats: \n" +
                        "\t Health : 6 \n" +
                        "\t Attack : 5 \n" +
                        "\t Block chance : 33 % \n" +
                        "\t Critical hit chance : 20 % \n"
        );

        Font textArcher = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 20);
        this.textAreaArcher.setFont(textArcher);

        JButton selectArcher = new JButton("SELECT");
        selectArcher.setBounds(820,40,160,80);
        selectArcher.setActionCommand("selectArcher");
        selectArcher.addActionListener(handler);

        archer.add(selectArcher);
        archer.add(this.textAreaArcher);

        return archer;
    }

    public JPanel classMage(ActionHandler handler){

        JPanel mage = new JPanel();
        mage.setLayout(null);
        mage.setBounds(0,0,1000,150);
        mage.setBackground(Color.blue.darker().darker().darker());

        this.textAreaMage.setBounds(300, 10, 300, 130);
        this.textAreaMage.setBackground(Color.blue.darker().darker().darker());
        this.textAreaMage.setForeground(Color.white);
        this.textAreaMage.setEditable(false);

        try {
            JLabel picture = new JLabel(new ImageIcon(ImageIO.read(new File("./src/resource/mage1.png"))));
            picture.setBounds(50, 0 , 158, 155);
            mage.add(picture);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.textAreaMage.setText(
                " MAGE, stats: \n" +
                        "\t Health : 8 \n" +
                        "\t Attack : 7 \n" +
                        "\t Block chance : 10 % \n" +
                        "\t Critical hit chance : 20 % \n"
        );

        Font textMage = new Font("New Times Roman", Font.PLAIN | Font.BOLD, 20);
        this.textAreaMage.setFont(textMage);

        JButton selectMage = new JButton("SELECT");
        selectMage.setBounds(820, 40, 160, 80);
        selectMage.setActionCommand("selectMage");
        selectMage.addActionListener(handler);

        mage.add(selectMage);
        mage.add(this.textAreaMage);

        return mage;
    }

}
