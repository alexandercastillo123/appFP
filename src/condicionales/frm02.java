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

public class frm02 extends JFrame {

    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtImporte, txtDescuento, txttotal, txtcara;
    JLabel lblImporte, lblDescuento, lblTotal, lblcara;


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
        setBounds(0, 0, 300, 320);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad :");
        lblCantidad.setBounds(30, 30, 150, 30);
        getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(165, 30, 100, 30);
		txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCantidad.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtCantidad);

        lblImporte = new JLabel("Importe :");
        lblImporte.setBounds(30, 70, 300, 30);
        getContentPane().add(lblImporte);

		txtImporte = new JTextField();
        txtImporte.setBounds(165, 70, 100, 30);
        txtImporte.setFocusable(false);
		txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
		txtImporte.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtImporte);

        lblDescuento = new JLabel("Descuento :");
        lblDescuento.setBounds(30, 110, 300, 30);
        getContentPane().add(lblDescuento);
		
		txtDescuento = new JTextField();
        txtDescuento.setBounds(165, 110, 100, 30);
        txtDescuento.setFocusable(false);
		txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDescuento);

        lblTotal = new JLabel("Total a Pagar :");
        lblTotal.setBounds(30, 150, 300, 30);
        getContentPane().add(lblTotal);

		txttotal = new JTextField();
        txttotal.setBounds(165, 150, 100, 30);
        txttotal.setFocusable(false);
		txttotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txttotal.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txttotal);

        lblcara = new JLabel("Carmelos :");
        lblcara.setBounds(30, 190, 300, 30);
        getContentPane().add(lblcara);

		txtcara = new JTextField();
        txtcara.setBounds(165, 190, 100, 30);
        txtcara.setFocusable(false);
		txtcara.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcara.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtcara);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30,230, 220, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());

        double i=20*cantidad;

        double d1=((i/100)*12);
        double d2=((i/100)*14);
        double d3=((i/100)*16);

        double t1=i-d1;
        double t2=i-d2;
        double t3=i-d3;

        if (0<i)txtImporte.setText(""+i);

        if (i<501)txtDescuento.setText(""+d1);
        if (500<i&&i<701)txtDescuento.setText(""+d2);
        if (700<i)txtDescuento.setText(""+d3);

        if (i<501)txttotal.setText(""+t1);
        if (500<i&&i<701)txttotal.setText(""+t2);
        if (700<i)txttotal.setText(""+t3);

        if (0<cantidad&& cantidad<51)txtcara.setText("5");
        if (50<cantidad&& cantidad<101)txtcara.setText("10");
        if (100<cantidad)txtcara.setText("15");

    }
}
