package org.homeRoulette.Views;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Game extends JFrame{
    private final int WIDTH;
    private final int HEIGHT;
    private JPanel panel;
    private JLabel title;
    private ArrayList<JLabel> labelsPlayers;
    private String[] playersNames;
    public Game(String[] playersNames){
        this.WIDTH = 800;
        this.HEIGHT = 500;
        this.panel = new JPanel();
        this.playersNames = playersNames;
        this.labelsPlayers = new ArrayList<>();
        this.title = new JLabel("");
        initialConfiguration();
    }
    private void initialConfiguration(){
        this.setVisible(true);
        this.setSize(WIDTH,HEIGHT);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Game");
        configurationPanel();
        configurationTitle();
        configurationJLabelsPlayers();
        useComponents();
        this.repaint();
    }
    private void configurationPanel(){
        this.panel.setBackground(Color.decode("#A8A4A4"));
        this.panel.setLayout(null);
        this.panel.setSize(WIDTH,HEIGHT);

    }
    private void configurationTitle(){
        this.title.setText("Good Luck!!!");
        this.title.setForeground(Color.BLACK);
        Font font = this.title.getFont().deriveFont(Font.ITALIC,30);
        this.title.setFont(font);
        this.title.setSize(500,50);
        this.title.setLocation(300,400);
    }
    private void configurationJLabelsPlayers(){
        JLabel labelPlayer1 = new JLabel("Player1: " + playersNames[0]);
        JLabel labelPlayer2 = new JLabel("Player2: " + playersNames[1]);
        labelPlayer1.setLocation(100,40);
        labelPlayer2.setLocation(450,40);
        labelPlayer1.setSize(200,30);
        labelPlayer2.setSize(200,30);
        this.labelsPlayers.add(labelPlayer1);
        this.labelsPlayers.add(labelPlayer2);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(250,150,280,280);

    }

    private void useComponents(){
        this.add(panel);
        this.panel.add(title);
        for(JLabel labelPlayer : labelsPlayers){
            this.panel.add(labelPlayer);
        }
    }
}
