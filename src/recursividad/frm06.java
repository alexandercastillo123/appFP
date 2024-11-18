package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtBase, txtExponente;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm06 frame = new frm06();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm06() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtBase = new JTextField();
        txtBase.setBounds(150, 30, 100, 30);
        getContentPane().add(txtBase);

        txtExponente = new JTextField();
        txtExponente.setBounds(150, 70, 100, 30);
        getContentPane().add(txtExponente);

        JButton btnCalcular = new JButton("Calcular Potencia");
        btnCalcular.setBounds(30, 110, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 150, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    // Potencia
    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * potencia(base, exponente - 1);
    }

    protected void btnCalcular_actionPerformed() {
        int base = Integer.parseInt(txtBase.getText());
        int exponente = Integer.parseInt(txtExponente.getText());
        int resultado = potencia(base, exponente);
        lblResultado.setText(base + " elevado a " + exponente + " es: " + resultado);
    }
}
