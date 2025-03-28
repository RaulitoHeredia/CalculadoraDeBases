package CalculadoraBases.gui;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    public JTextField numberField;
    public JTextField fromBaseField;
    public JTextField toBaseField;

    public InputPanel() {
        setLayout(new GridLayout(3, 2, 5, 5));
        
        numberField = new JTextField();
        fromBaseField = new JTextField();
        toBaseField = new JTextField();

        add(new JLabel("Número:"));
        add(numberField);
        add(new JLabel("Base origen:"));
        add(fromBaseField);
        add(new JLabel("Base destino:"));
        add(toBaseField);
    }
}