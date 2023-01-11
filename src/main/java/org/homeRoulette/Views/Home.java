package org.homeRoulette.Views;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Home extends JFrame {
    private JPanel panel;
    private JLabel title;
    private ArrayList<JTextField> players;
    public Home (){
        this.panel = new JPanel();
        this.title = new JLabel();
        this.players = new ArrayList<>();
        initialConfiguration();
    }

    private void initialConfiguration(){
        this.setVisible(true);
        this.setSize(650,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Game");
        configurationPanel();
        configurationTitle();
        configurationJTextsPlayers();
        useComponents();
    }

    private void configurationPanel(){
        this.panel.setBackground(Color.decode("#C5EFF9"));
        this.panel.setLayout(null);
        this.panel.setSize(650,500);

    }
    private void configurationTitle(){
        this.title.setText("Home_Roulette");
        this.title.setForeground(Color.BLACK);
        Font font = this.title.getFont().deriveFont(Font.ITALIC,40);
        this.title.setFont(font);
        this.title.setSize(500,50);
        this.title.setLocation(200,20);
    }
    private void configurationJTextsPlayers(){
        JTextField player1 = new JTextField();
        player1.setToolTipText("Ingrese su nombre");
        player1.setBounds(50,100,200,30);
        JTextField player2 = new JTextField();
        player2.setToolTipText("Ingrese su nombre");
        player2.setBounds(350,100,200,30);
        this.players.add(player1);
        this.players.add(player2);
    }

    private  void useComponents(){
        this.add(panel);
        this.panel.add(title);
        for(JTextField player : players){
            this.panel.add(player);
        }
    }
}
