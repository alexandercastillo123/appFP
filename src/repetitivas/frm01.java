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

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel lblDividendo, lblDivisor, lblCociente, lblResto;
    JTextField txtDividendo, txtDivisor, txtCociente, txtResto;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm01 frame = new frm01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        // Etiquetas
        lblDividendo = new JLabel("Dividendo:");
        lblDividendo.setBounds(50, 50, 80, 30);
        getContentPane().add(lblDividendo);

        lblDivisor = new JLabel("Divisor:");
        lblDivisor.setBounds(50, 90, 80, 30);
        getContentPane().add(lblDivisor);

        lblCociente = new JLabel("Cociente:");
        lblCociente.setBounds(50, 130, 80, 30);
        getContentPane().add(lblCociente);

        lblResto = new JLabel("Resto:");
        lblResto.setBounds(50, 170, 80, 30);
        getContentPane().add(lblResto);

        // Campos de texto
        txtDividendo = new JTextField();
        txtDividendo.setBounds(130, 50, 60, 30);
        txtDividendo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDividendo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDividendo);

        txtDivisor = new JTextField();
        txtDivisor.setBounds(130, 90, 60, 30);
        txtDivisor.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDivisor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisor);

        txtCociente = new JTextField();
        txtCociente.setBounds(130, 130, 60, 30);
        txtCociente.setFocusable(false);
        txtCociente.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCociente);

        txtResto = new JTextField();
        txtResto.setBounds(130, 170, 60, 30);
        txtResto.setFocusable(false);
        txtResto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtResto);

        // Botón Calcular
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 210, 100, 30);
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
            int dividendo = Integer.parseInt(txtDividendo.getText());
            int divisor = Integer.parseInt(txtDivisor.getText());

            // Validar que el divisor no sea 0
            if (divisor == 0) {
                txtCociente.setText("Error: Divisor 0");
                txtResto.setText("");
                return;
            }

            // Variables para el cociente y el resto
            int cociente = 0;
            int resto = dividendo;

            // Realizar restas sucesivas
            while (resto >= divisor) {
                resto -= divisor;
                cociente++;
            }

            // Mostrar los resultados
            txtCociente.setText(String.valueOf(cociente));
            txtResto.setText(String.valueOf(resto));

        } catch (NumberFormatException e) {
            txtCociente.setText("Entrada inválida");
            txtResto.setText("");
        }
    }
}
