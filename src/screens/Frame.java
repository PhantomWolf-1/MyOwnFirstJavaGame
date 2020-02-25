package screens;

import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {

    public Frame(int x, int y, int width, int height, boolean mainFrame) {

        if (mainFrame) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else{
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }

        setBounds(x, y, width, height);
        setLayout(null);
        setResizable(false);

    }


    public void setFrame(Container con) {

        setContentPane(con);

    }

    public void setFrameVisible() {

        setVisible(true);
    }

}
