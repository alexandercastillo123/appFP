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

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel lblNumero, lblResultado;
    JTextField txtNumero, txtResultado;

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
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        // Etiquetas
        lblNumero = new JLabel("Número:");
        lblNumero.setBounds(50, 50, 80, 30);
        getContentPane().add(lblNumero);

        lblResultado = new JLabel("Divisores:");
        lblResultado.setBounds(50, 130, 80, 30);
        getContentPane().add(lblResultado);

        // Campo de texto
        txtNumero = new JTextField();
        txtNumero.setBounds(130, 50, 60, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero);

        txtResultado = new JTextField();
        txtResultado.setBounds(130, 130, 60, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtResultado);

        // Botón Calcular
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 170, 100, 30);
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
            int numero = Integer.parseInt(txtNumero.getText());
            int contador = 0;

            // Buscar divisores del número
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contador++;
                }
            }

            // Mostrar la cantidad de divisores
            txtResultado.setText(String.valueOf(contador));
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }
}
