package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtLimite;
    JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm10 frame = new frm10();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtLimite = new JTextField();
        txtLimite.setBounds(150, 30, 100, 30);
        getContentPane().add(txtLimite);

        JButton btnCalcular = new JButton("Contar Pares");
        btnCalcular.setBounds(30, 70, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 110, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    // Contar Pares en un Arreglo
    public static int contarPares(int[] arreglo, int index) {
        if (index == arreglo.length) return 0;
        int contar = (arreglo[index] % 2 == 0) ? 1 : 0;
        return contar + contarPares(arreglo, index + 1);
    }

    protected void btnCalcular_actionPerformed() {
        int limite = Integer.parseInt(txtLimite.getText());
        int[] arreglo = new int[limite];
        for (int i = 0; i < limite; i++) {
            arreglo[i] = i + 1; // Llenamos el arreglo con los números 1 a N
        }
        int resultado = contarPares(arreglo, 0);
        lblResultado.setText("Cantidad de números pares: " + resultado);
    }
}
