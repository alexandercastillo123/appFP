package condicionales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txta, txtb, txtc;
    private JLabel lblanalizis;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm20 frame = new frm20();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lbla = new JLabel("Primer Número :");
        lbla.setBounds(50, 30, 100, 30);
        getContentPane().add(lbla);

        txta = new JTextField();
        txta.setBounds(180, 30, 50, 30);
        txta.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txta);

        JLabel lblb = new JLabel("Segundo Número :");
        lblb.setBounds(50, 80, 100, 30);
        getContentPane().add(lblb);

        txtb = new JTextField();
        txtb.setBounds(180, 80, 50, 30);
        txtb.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtb);

        JLabel lblc = new JLabel("Tercer Número :");
        lblc.setBounds(50, 130, 100, 30);
        getContentPane().add(lblc);

        txtc = new JTextField();
        txtc.setBounds(180, 130, 50, 30);
        txtc.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtc);

        JButton btnVerificar = new JButton("Analizar");
        btnVerificar.setBounds(80, 220, 180, 30);
        getContentPane().add(btnVerificar);

        lblanalizis = new JLabel("");
        lblanalizis.setBounds(50, 165, 300, 50);
        getContentPane().add(lblanalizis);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnVerificar_actionPerformed();
            }
        });
    }

    protected void btnVerificar_actionPerformed() {
        int a = Integer.parseInt(txta.getText());
        int b = Integer.parseInt(txtb.getText());
        int c = Integer.parseInt(txtc.getText());
        String resultado;

        if (a < b && b < c) {
            resultado = "Orden ascendente.";
        } else if (a > b && b > c) {
            resultado = "Orden descendente.";
        } else {
            resultado = "En desorden.";
        }

        
        lblanalizis.setText(resultado);
    }
}
