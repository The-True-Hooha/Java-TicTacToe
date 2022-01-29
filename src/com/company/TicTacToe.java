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

        //a for loop that iterates through the button
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV BOLI", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        //adds to the frame calling from the JFrame function
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);

        //calling the firsTurn method
        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1Turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1Turn = false;
                        textField.setText("O turn");
                        checkResult();
                    }
                }
                else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(0x1313A9));
                        buttons[i].setText("O");
                        player1Turn = true;
                        textField.setText("X turn");
                        checkResult();
                    }
                }
            }

        }
    }

    //a new method that tells who turn it is to play
    public void firstTurn () {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (random.nextInt(2) ==0 ) {
            player1Turn = true;
            textField.setText("X Turn");
        } else {
            player1Turn = false;
            textField.setText("O Turn");
        }
    }

    //method to see if anyone has won
    public void checkResult () {
        //check to see if X wins
        if (
                (buttons[0].getText() == "X") &&
                        (buttons[1].getText() == "X") &&
                        (buttons[2]).getText() == "X" &&
                        (buttons[3]).getText() == "X"
                        ) {
            xWins(0, 1, 2);
        } if (
                (buttons [3].getText() == "X") &&
                        (buttons [4].getText() == "X") &&
                        (buttons [5].getText() == "X")
        ){
            xWins(3, 4, 5);
        } if (
                (buttons [6].getText() == "X") &&
                        (buttons [7].getText() == "X") &&
                        (buttons [8].getText() == "X")
        ){
            xWins(6, 7, 8);
        } if (
                (buttons [0].getText() == "X") &&
                        (buttons [3].getText() == "X") &&
                        (buttons [6].getText() == "X")
        ){
            xWins(0, 3, 6);
        } if (
                (buttons [1].getText() == "X") &&
                        (buttons [4].getText() == "X") &&
                        (buttons [7].getText() == "X")
        ){
            xWins(1, 4, 7);
        } if (
                (buttons [2].getText() == "X") &&
                        (buttons [5].getText() == "X") &&
                        (buttons [8].getText() == "X")
        ){
            xWins(2, 5, 8);
        } if (
                (buttons [0].getText() == "X") &&
                        (buttons [4].getText() == "X") &&
                        (buttons [8].getText() == "X")
        ){
            xWins(0, 4, 8);
        } if (
                (buttons [2].getText() == "X") &&
                        (buttons [4].getText() == "X") &&
                        (buttons [6].getText() == "X")
        ){
            xWins(2, 4, 6);
        }
        if (
                (buttons[0].getText() == "O") &&
                        (buttons[1].getText() == "O") &&
                        (buttons[2]).getText() == "O" &&
                        (buttons[3]).getText() == "O"
        ) {
            oWins(0, 1, 2);
        } if (
                (buttons [3].getText() == "O") &&
                        (buttons [4].getText() == "O") &&
                        (buttons [5].getText() == "O")
        ){
            oWins(3, 4, 5);
        } if (
                (buttons [6].getText() == "O") &&
                        (buttons [7].getText() == "O") &&
                        (buttons [8].getText() == "O")
        ){
            oWins(6, 7, 8);
        } if (
                (buttons [0].getText() == "O") &&
                        (buttons [3].getText() == "O") &&
                        (buttons [6].getText() == "O")
        ){
            oWins(0, 3, 6);
        } if (
                (buttons [1].getText() == "O") &&
                        (buttons [4].getText() == "O") &&
                        (buttons [7].getText() == "O")
        ){
            oWins(1, 4, 7);
        } if (
                (buttons [2].getText() == "O") &&
                        (buttons [5].getText() == "O") &&
                        (buttons [8].getText() == "O")
        ){
            oWins(2, 5, 8);
        } if (
                (buttons [0].getText() == "O") &&
                        (buttons [4].getText() == "O") &&
                        (buttons [8].getText() == "O")
        ){
            oWins(0, 4, 8);
        } if (
                (buttons [2].getText() == "O") &&
                        (buttons [4].getText() == "O") &&
                        (buttons [6].getText() == "O")
        ){
            oWins(2, 4, 6);
        }

    }

    //method to check if X or O wins
    public void xWins (int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textField.setText("X wins the game");
    }

    public void oWins (int a, int b, int c) {

        for (int i = 0; i < 9; i++) {
        }
        textField.setText("O wins the game");
    }
}
