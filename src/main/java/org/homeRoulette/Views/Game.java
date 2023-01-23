package org.homeRoulette.Views;

import javax.swing.*;
import java.util.Arrays;

public class Game extends JFrame{
    private final int WIDTH;
    private final int HEIGHT;
    private String[] playersNames;
    public Game(String... playersNames){
        this.WIDTH = 650;
        this.HEIGHT = 500;
        this.playersNames = playersNames;
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
        Arrays.stream(this.playersNames).forEach(System.out::println);
    }
}
