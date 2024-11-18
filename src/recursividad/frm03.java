package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm03 frame = new frm03();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtNumero = new JTextField();
        txtNumero.setBounds(150, 30, 100, 30);
        getContentPane().add(txtNumero);

        JButton btnCalcular = new JButton("Sumar Números Naturales");
        btnCalcular.setBounds(30, 70, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 110, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    // Suma de Números Naturales
    public static int sumaNaturales(int n) {
        if (n == 0) return 0;
        return n + sumaNaturales(n - 1);
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int resultado = sumaNaturales(numero);
        lblResultado.setText("Suma de los primeros " + numero + " números naturales es: " + resultado);
    }
}
