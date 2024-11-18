package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtPalabra;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm05 frame = new frm05();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm05() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtPalabra = new JTextField();
        txtPalabra.setBounds(150, 30, 100, 30);
        getContentPane().add(txtPalabra);

        JButton btnCalcular = new JButton("Comprobar Palíndromo");
        btnCalcular.setBounds(30, 70, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 110, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    // Comprobación de Palíndromos
    public static boolean esPalindromo(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return esPalindromo(str.substring(1, str.length() - 1));
    }

    protected void btnCalcular_actionPerformed() {
        String palabra = txtPalabra.getText();
        boolean resultado = esPalindromo(palabra);
        lblResultado.setText("¿Es palíndromo? " + resultado);
    }
}
