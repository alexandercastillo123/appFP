package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCadena;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm04 frame = new frm04();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtCadena = new JTextField();
        txtCadena.setBounds(150, 30, 100, 30);
        getContentPane().add(txtCadena);

        JButton btnCalcular = new JButton("Reversa de Cadena");
        btnCalcular.setBounds(30, 70, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 110, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    // Reversa de una Cadena
    public static String reversa(String str) {
        if (str.isEmpty()) return str;
        return reversa(str.substring(1)) + str.charAt(0);
    }

    protected void btnCalcular_actionPerformed() {
        String cadena = txtCadena.getText();
        String resultado = reversa(cadena);
        lblResultado.setText("Cadena en reversa es: " + resultado);
    }
}
