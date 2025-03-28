import javax.swing.*;

public class CalculadoraBasesFinal {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Calculadora de Bases");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        // Panel para entradas
JPanel inputPanel = new JPanel();
inputPanel.setLayout(new GridLayout(3, 2, 5, 5));

// Componentes
JLabel numLabel = new JLabel("Número a convertir:");
JTextField numField = new JTextField();
JLabel baseOrigenLabel = new JLabel("Base de origen (2-36):");
JTextField baseOrigenField = new JTextField();
JLabel baseDestinoLabel = new JLabel("Base destino (2-36):");
JTextField baseDestinoField = new JTextField();

// Agregar componentes al panel
inputPanel.add(numLabel);
inputPanel.add(numField);
inputPanel.add(baseOrigenLabel);
inputPanel.add(baseOrigenField);
inputPanel.add(baseDestinoLabel);
inputPanel.add(baseDestinoField);

frame.add(inputPanel);

JPanel resultPanel = new JPanel();
resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));

// Botón de conversión
JButton convertirBtn = new JButton("Convertir");

// Área de resultado
JLabel resultadoLabel = new JLabel(" ");
resultadoLabel.setFont(new Font("Arial", Font.BOLD, 14));

resultPanel.add(convertirBtn);
resultPanel.add(Box.createVerticalStrut(10)); // Espacio
resultPanel.add(resultadoLabel);

frame.add(resultPanel);
private static class ConversorBases {
    public static String convertir(String numero, int baseOrigen, int baseDestino) {
        try {
            // Convertir a decimal primero
            long decimal = Long.parseLong(numero, baseOrigen);
            
            // Convertir de decimal a base destino
            return Long.toString(decimal, baseDestino).toUpperCase();
        } catch (NumberFormatException e) {
            return "Error: Verifica los datos";
        }
    }
}
        frame.setVisible(true);
    }
}