package CalculadoraBases.gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Calculadora de Bases --- Raulito");
        setSize(600, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        
        JLabel titleLabel = new JLabel("CONVERSOR DE BASES NUMÉRICAS", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(0, 0, 139)); 
        add(titleLabel);
        add(Box.createVerticalStrut(15));
        
        InputPanel inputPanel = new InputPanel();
        ResultPanel resultPanel = new ResultPanel(inputPanel);
        
        add(inputPanel);
        add(Box.createVerticalStrut(15));
        add(resultPanel);
        
        
        setLocationRelativeTo(null);
    }
}