package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm02 frame = new frm02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Calcular Fibonacci");
        btnCalcular.setBounds(30, 70, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 110, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    // Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int resultado = fibonacci(numero);
        lblResultado.setText("Fibonacci en la posición " + numero + " es: " + resultado);
    }
}
