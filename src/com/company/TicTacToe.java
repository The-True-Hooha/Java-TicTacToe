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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

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
