package screens;

import dataStore.Data;

import javax.swing.*;
import java.awt.*;

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

       /*
       this.textAreaKnight.setForeground(Color.white);
       dit even na vragen waarom het niet werkt, is het omdat het een textField is?
        */



        this.textAreaKnight.setText(
                        "Health : 10 \n" +
                        "Attack : 5 \n" +
                        "Block chance : 25 % \n" +
                        "Critical hit chance : 10 % \n"
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

        this.textAreaArcher.setText(
                "Health : 6 \n" +
                        "Attack : 5 \n" +
                        "Block chance : 33 % \n" +
                        "Critical hit chance : 20 % \n"
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

        this.textAreaMage.setText(
                "Health : 8 \n" +
                        "Attack : 7 \n" +
                        "Block chance : 10 % \n" +
                        "Critical hit chance : 20 % \n"
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
