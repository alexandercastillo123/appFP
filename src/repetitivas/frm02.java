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

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel lblNumero1, lblNumero2, lblResultado;
    JTextField txtNumero1, txtNumero2, txtResultado;

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
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        // Etiquetas
        lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 50, 80, 30);
        getContentPane().add(lblNumero1);

        lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 90, 80, 30);
        getContentPane().add(lblNumero2);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 130, 80, 30);
        getContentPane().add(lblResultado);

        // Campos de texto
        txtNumero1 = new JTextField();
        txtNumero1.setBounds(130, 50, 60, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(130, 90, 60, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

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
            int num1 = Integer.parseInt(txtNumero1.getText());
            int num2 = Integer.parseInt(txtNumero2.getText());
            int resultado = 0;

            // Validar si uno de los números es negativo y proceder con la multiplicación
            int absNum2 = Math.abs(num2); // Usar el valor absoluto de num2
            boolean isNegativeResult = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);

            // Realizar la multiplicación con sumas sucesivas
            for (int i = 0; i < absNum2; i++) {
                resultado += num1; // Sumar num1, num2 veces
            }

            // Si el resultado debe ser negativo, hacerlo
            if (isNegativeResult) {
                resultado = -resultado;
            }

            // Mostrar el resultado
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            txtResultado.setText("Entrada inválida");
        }
    }
}
