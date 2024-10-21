package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtNumeroIntermedio;
    JLabel lblNumeroIntermedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm07 frame = new frm07();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("1er numero :");
        lblNumero1.setBounds(30, 30, 80, 30);
        getContentPane().add(lblNumero1);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(120, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero1.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero1);

        JLabel lblNumero2 = new JLabel("2do numero :");
        lblNumero2.setBounds(30, 70, 80, 30);
        getContentPane().add(lblNumero2);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(120, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero2.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero2);

        JLabel lblNumero3 = new JLabel("3er numero :");
        lblNumero3.setBounds(30, 110, 80, 30);
        getContentPane().add(lblNumero3);

        txtNumero3 = new JTextField();
        txtNumero3.setBounds(120, 110, 100, 30);
        txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumero3.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumero3);

        JButton btnCalcular = new JButton("Intermedio");
        btnCalcular.setBounds(30, 190, 200, 30);
        getContentPane().add(btnCalcular);

        lblNumeroIntermedio = new JLabel("Número Intermedio :");
        lblNumeroIntermedio.setBounds(30, 150, 200, 30);
        getContentPane().add(lblNumeroIntermedio);

        txtNumeroIntermedio = new JTextField();
        txtNumeroIntermedio.setBounds(120, 150, 100, 30);
        txtNumeroIntermedio.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNumeroIntermedio.setFocusable(false);
		txtNumeroIntermedio.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtNumeroIntermedio);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int num1 = Integer.parseInt(txtNumero1.getText());
        int num2 = Integer.parseInt(txtNumero2.getText());
        int num3 = Integer.parseInt(txtNumero3.getText());

        int intermedio;

        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            intermedio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            intermedio = num2;
        } else {
            intermedio = num3;
        }

        txtNumeroIntermedio.setText("" + intermedio);
    }
}
