package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNumeroTarjeta;
    private JTextField txtMontoCompra;
    private JLabel lblResultado, lblResultado1, lblResultado2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm14 frame = new frm14();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 320);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroTarjeta = new JLabel("Número de tarjeta :");
        lblNumeroTarjeta.setBounds(30, 30, 150, 30);
        getContentPane().add(lblNumeroTarjeta);

        txtNumeroTarjeta = new JTextField();
        txtNumeroTarjeta.setBounds(150, 30, 150, 30);
        getContentPane().add(txtNumeroTarjeta);

        JLabel lblMontoCompra = new JLabel("Monto de la compra :");
        lblMontoCompra.setBounds(30, 70, 150, 30);
        getContentPane().add(lblMontoCompra);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(150, 70, 150, 30);
        getContentPane().add(txtMontoCompra);

        JButton btnCalcular = new JButton("Calcular Descuento");
        btnCalcular.setBounds(80, 230, 180, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("");
        lblResultado.setBounds(30, 110, 300, 30);
        getContentPane().add(lblResultado);

        lblResultado1 = new JLabel("");
        lblResultado1.setBounds(30, 150, 300, 30);
        getContentPane().add(lblResultado1);

        lblResultado2 = new JLabel("");
        lblResultado2.setBounds(30, 190, 300, 30);
        getContentPane().add(lblResultado2);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int numeroTarjeta = Integer.parseInt(txtNumeroTarjeta.getText());
        double montoCompra = Double.parseDouble(txtMontoCompra.getText());
        double descuento;

       
        if (numeroTarjeta >= 100 && numeroTarjeta % 2 == 0) {
            descuento = 0.15; 
        } else {
            descuento = 0.05; 
        }

        double montoDescuento = montoCompra * descuento;
        lblResultado.setText("Número de tarjeta: " + numeroTarjeta);
                             
        lblResultado1.setText("Monto de compra: S/. " + montoCompra);

        lblResultado2.setText("Descuento: S/. " + montoDescuento);
    }
}
