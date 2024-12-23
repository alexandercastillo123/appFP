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

public class frm01 extends JFrame {

    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtImporte, txtDescuento, txttotal;
    JLabel lblImporte, lblDescuento, lblTotal;


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

        JLabel lblCantidad = new JLabel("Cantidad de Unidades :");
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

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30,190, 220, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());

        double i1=27*cantidad;
        double i2=25*cantidad;
        double i3=23*cantidad;

        double d1=((i3/100)*15);
        double d2=((i1/100)*5);
        Double d3=((i2/100)*5);

        double t1=i1-d2;
        double t2=i2-d3;
        double t3=i3-d1;

        if (0<cantidad&&cantidad<26)txtImporte.setText(""+i1);
        if (25<cantidad&&cantidad<51)txtImporte.setText(""+i2);
        if (50<cantidad)txtImporte.setText(""+i3);

        if (0<cantidad&&cantidad<26)txtDescuento.setText(""+d2);
        if (25<cantidad&&cantidad<51)txtDescuento.setText(""+d3);
        if (50<cantidad)txtDescuento.setText(""+d1);

        if (0<cantidad&&cantidad<26)txttotal.setText(""+t1);
        if (25<cantidad&&cantidad<51)txttotal.setText(""+t2);
        if (50<cantidad)txttotal.setText(""+t3);

    }
}
