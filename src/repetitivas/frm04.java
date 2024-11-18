package repetitivas;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel lblNumero, lblMultiplo, lblResultado;
    JTextField txtNumero, txtMultiplo, txtResultado;

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

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        // Etiquetas
        lblNumero = new JLabel("Número (n):");
        lblNumero.setBounds(50, 50, 80, 30);
        getContentPane().add(lblNumero);

        lblMultiplo = new JLabel("Múltiplos (m):");
        lblMultiplo.setBounds(50, 90, 100, 30);
        getContentPane().add(lblMultiplo);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 170, 80, 30);
        getContentPane().add(lblResultado);

        // Campos de texto
        txtNumero = new JTextField();
        txtNumero.setBounds(130, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtMultiplo = new JTextField();
        txtMultiplo.setBounds(130, 90, 60, 30);
        txtMultiplo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMultiplo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtMultiplo);

        txtResultado = new JTextField();
        txtResultado.setBounds(130, 170, 100, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.LEFT);
        getContentPane().add(txtResultado);

        // Botón Calcular
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 220, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        try {
            // Obtener los valores ingresados
            int numero = Integer.parseInt(txtNumero.getText());
            int m = Integer.parseInt(txtMultiplo.getText());

            StringBuilder resultado = new StringBuilder();

            // Calcular los m múltiplos de n
            for (int i = 1; i <= m; i++) {
                resultado.append(numero * i).append(" ");
            }

            // Mostrar los múltiplos en el campo de texto
            txtResultado.setText(resultado.toString().trim());

        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }
}
