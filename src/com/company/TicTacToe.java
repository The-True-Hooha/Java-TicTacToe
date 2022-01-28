package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//implemet method for the action listener
public class TicTacToe implements ActionListener {

    //instance of the random class
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1Turn;


    TicTacToe() {

        //sets the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //JLable textField area
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 55, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TIC-TAC-TOE");
        textField.setOpaque(true);

        //titlePanel area
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);
        titlePanel.add(titlePanel);

        //the button panel
        buttonPanel.setLayout(new GridLayout());
        buttonPanel.setBackground(new Color(150, 150, 150));


        //adds to the frame calling from the JFrame function
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //a new method that tells who turn it is to play

    public void firstTurn () {

    }

    //method to see if anyone has won
    public void CheckResult () {

    }

    //method to check if X or O wins
    public void xWins (int a, int b, int c) {

    }

    public void oWins (int a, int b, int c) {

    }
}
