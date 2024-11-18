package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm13 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNumero;
    private JLabel lblResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm13 frame = new frm13();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Numero de 3 cifras:");
        lblNumero.setBounds(70, 30, 200, 30);
        getContentPane().add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(70, 60, 100, 30);
        getContentPane().add(txtNumero);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(70, 100, 100, 30);
        getContentPane().add(btnVerificar);

        lblResultado = new JLabel("");
        lblResultado.setBounds(20, 140, 250, 30);
        getContentPane().add(lblResultado);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnVerificar_actionPerformed();
            }
        });
    }

    protected void btnVerificar_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        
        
        if (numero < 100 || numero > 999) {
            lblResultado.setText("Ingresar número de tres cifras.");
            return;
        }

       
        int centena = numero / 100;
        int decena = (numero / 10) % 10;
        int unidad = numero % 10;

        if (centena + 1 == decena && decena + 1 == unidad)
            {
                lblResultado.setText("Las cifras son consecutivas en orden ascendente.");
            }
            // Verificar si son consecutivas en orden descendente
            else if (centena - 1 == decena && decena - 1 == unidad)
            {
                lblResultado.setText("Las cifras son consecutivas en orden descendente.");
            }
            else
            {
                lblResultado.setText("Las cifras no son consecutivas.");
            }
    }
}
