package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtMontoVendido;
    private JTextField txtCategoria;
    private JLabel lblResultado1, lblResultado2, lblResultado3, lblResultado4;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm15 frame = new frm15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto vendido:");
        lblMontoVendido.setBounds(30, 30, 150, 30);
        getContentPane().add(lblMontoVendido);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(150, 30, 150, 30);
        getContentPane().add(txtMontoVendido);

        JLabel lblCategoria = new JLabel("Categoría (1, 2, 3):");
        lblCategoria.setBounds(30, 70, 150, 30);
        getContentPane().add(lblCategoria);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(150, 70, 150, 30);
        getContentPane().add(txtCategoria);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 280, 180, 30);
        getContentPane().add(btnCalcular);

        lblResultado1 = new JLabel("");
        lblResultado1.setBounds(30, 120, 300, 60);
        getContentPane().add(lblResultado1);

        lblResultado2 = new JLabel("");
        lblResultado2.setBounds(30, 160, 300, 60);
        getContentPane().add(lblResultado2);

        lblResultado3 = new JLabel("");
        lblResultado3.setBounds(30, 200, 300, 60);
        getContentPane().add(lblResultado3);

        lblResultado4 = new JLabel("");
        lblResultado4.setBounds(30, 240, 300, 60);
        getContentPane().add(lblResultado4);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        double sueldoBasico = 250.0;
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        int categoria = Integer.parseInt(txtCategoria.getText());
        double porcentajeComision = 0.0;

      
        switch (categoria) {
            case 1:
                porcentajeComision = 0.05; // 5%
                break;
            case 2:
                porcentajeComision = 0.10; // 10%
                break;
            case 3:
                porcentajeComision = 0.15; // 15%
                break;
            default:
                lblResultado1.setText("Categoría inválida. Debe ser 1, 2 o 3.");
                return;
        }

       
        double comision = montoVendido * porcentajeComision;

       
        double sueldoBruto = sueldoBasico + comision;

        
        double descuento;
        if (sueldoBruto > 3500) {
            descuento = sueldoBruto * 0.15; // 15%
        } else {
            descuento = sueldoBruto * 0.08; // 8%
        }

        
        double sueldoNeto = sueldoBruto - descuento;

       
        lblResultado1.setText(String.format("Sueldo Bruto: S/. %.2f",
                sueldoBruto));
        lblResultado2.setText(String.format("Comisión: S/. %.2f",
                 comision));
        lblResultado3.setText(String.format("Descuento: S/. %.2f",
                 descuento));
        lblResultado4.setText(String.format("Sueldo Neto: S/. %.2f",
                sueldoNeto));
    }
}
