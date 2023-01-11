package org.homeRoulette.Views;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home (){
        this.panel =new JPanel();
        this.title = new JLabel();
        initialConfiguration();
    }
    private JPanel panel;
    private JLabel title;
    private void initialConfiguration(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Game");
        configurationPanel();
        configurationTitle();
        useComponents();
    }

    private void configurationPanel(){
        this.panel.setBackground(Color.decode("#C5EFF9"));
        this.panel.setSize(500,500);
    }
    private void configurationTitle(){
        this.title.setText("Home_Roulette");
        this.title.setForeground(Color.BLACK    );
        Font font = this.title.getFont().deriveFont(Font.ITALIC,40);
        this.title.setFont(font);
    }

    private  void useComponents(){
        this.add(panel);
        this.panel.add(title);
    }
}
