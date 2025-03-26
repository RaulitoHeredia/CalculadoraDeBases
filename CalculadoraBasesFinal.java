import javax.swing.*;

public class CalculadoraBasesFinal {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Calculadora de Bases");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        
        // Aquí irán los demás componentes...
        
        frame.setVisible(true);
    }
}