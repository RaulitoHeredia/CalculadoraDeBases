package CalculadoraBases.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import CalculadoraBases.logic.BaseConverter;

public class ResultPanel extends JPanel {
    private final JLabel resultLabel;  
    private final InputPanel inputPanel;  

    public ResultPanel(InputPanel inputPanel) {
        this.inputPanel = inputPanel;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JButton convertButton = createConvertButton();
        this.resultLabel = createResultLabel();
        
        configureButtonAction(convertButton);
        
        add(convertButton);
        add(Box.createVerticalStrut(20));
        add(resultLabel);
    }

    private JButton createConvertButton() {
        JButton button = new JButton("CONVERTIR");
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        return button;
    }

    private JLabel createResultLabel() {
        JLabel label = new JLabel(" ", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 28));
        label.setForeground(new Color(0, 100, 0));
        label.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        return label;
    }

    private void configureButtonAction(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performConversion();
            }
        });
    }

    private void performConversion() {
        try {
            String number = inputPanel.numberField.getText().toUpperCase();
            String fromBaseText = inputPanel.fromBaseField.getText();
            String toBaseText = inputPanel.toBaseField.getText();

            if (number.isEmpty() || fromBaseText.isEmpty() || toBaseText.isEmpty()) {
                resultLabel.setText("COMPLETE TODOS LOS CAMPOS");
                return;
            }

            int fromBase = Integer.parseInt(fromBaseText);
            int toBase = Integer.parseInt(toBaseText);

            if (fromBase < 2 || fromBase > 36 || toBase < 2 || toBase > 36) {
                resultLabel.setText("BASES DEBEN SER 2-36");
                return;
            }

            String result = BaseConverter.convert(number, fromBase, toBase);
            resultLabel.setText(number + " (base " + fromBase + ") = " + result + " (base " + toBase + ")");
            
        } catch (NumberFormatException ex) {
            resultLabel.setText("ENTRADA INVÁLIDA");
        } catch (Exception ex) {
            resultLabel.setText("ERROR EN CONVERSIÓN");
        }
    }
}