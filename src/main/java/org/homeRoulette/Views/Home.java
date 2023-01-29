package org.homeRoulette.Views;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Home extends JFrame {

    private final int WIDTH;
    private final int HEIGHT;
    private JPanel panel;
    private JLabel title;
    private JButton playGame;
    private ArrayList<JTextField> players;
    private ArrayList<JLabel> labelsPlayers;
    public Home (){
        this.panel = new JPanel();
        this.title = new JLabel();
        this.players = new ArrayList<>();
        this.labelsPlayers = new ArrayList<>();
        this.WIDTH = 650;
        this.HEIGHT = 500;
        this.playGame = new JButton("Iniciar a jugar");
        initialConfiguration();
    }

    private void initialConfiguration(){
        this.setVisible(true);
        this.setSize(WIDTH,HEIGHT);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Home");
        configurationPanel();
        configurationTitle();
        configurationJLabelsPlayers();
        configurationJTextsPlayers();
        configurationPlayGame();
        useComponents();
        addEvents();
        this.repaint();
    }

    private void configurationPanel(){
        this.panel.setBackground(Color.decode("#C5EFF9"));
        this.panel.setLayout(null);
        this.panel.setSize(WIDTH,HEIGHT);

    }
    private void configurationTitle(){
        this.title.setText("Home_Roulette");
        this.title.setForeground(Color.BLACK);
        Font font = this.title.getFont().deriveFont(Font.ITALIC,40);
        this.title.setFont(font);
        this.title.setSize(500,50);
        this.title.setLocation(180,30);
    }
    private void configurationJLabelsPlayers(){
        JLabel labelPlayer1 = new JLabel("Player1");
        JLabel labelPlayer2 = new JLabel("Player2");
        labelPlayer1.setLocation(50,150);
        labelPlayer2.setLocation(350,150);
        labelPlayer1.setSize(200,30);
        labelPlayer2.setSize(200,30);
        this.labelsPlayers.add(labelPlayer1);
        this.labelsPlayers.add(labelPlayer2);
    }
    private void configurationJTextsPlayers(){
        JTextField player1 = new JTextField();
        player1.setToolTipText("Ingrese su nombre");
        player1.setBounds(50,180,250,50);
        JTextField player2 = new JTextField();
        player2.setToolTipText("Ingrese su nombre");
        player2.setBounds(350,180,250,50);
        this.players.add(player1);
        this.players.add(player2);
    }
    private void configurationPlayGame(){
        this.playGame.setBackground(Color.ORANGE);
        this.playGame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.playGame.setBounds(220,350,200,60);
    }
    private void addEvents(){
        this.playGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                try {
                    String[] playersNames = players.
                            stream()
                            .map(JTextComponent::getText)
                            .toArray(String[]::new);
                    validateName(playersNames[0]);
                    validateName(playersNames[1]);
                    new Game(playersNames);
                    dispose();
                }catch (IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }
    private void validateName(String name) throws IllegalArgumentException{
        if(name.trim().isEmpty())
            throw new IllegalArgumentException("Name not valid");
    }
    private  void useComponents(){
        this.add(panel);
        this.panel.add(title);
        int i = 0;
        for(JTextField player : players){
            this.panel.add(this.labelsPlayers.get(i));
            this.panel.add(player);
            i++;
        }
        this.panel.add(playGame);
    }

}
