package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm19 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtvendido, txtcomision, txtsbt, txtdescuento, txtsnt;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblvendido = new JLabel("Total vendido :");
		lblvendido.setBounds(50, 50, 80, 30);
		getContentPane().add(lblvendido);

		JLabel lblcomision = new JLabel("Comision :");
		lblcomision.setBounds(50, 90, 80, 30);
		getContentPane().add(lblcomision);

		JLabel lblsbt = new JLabel("Sueldo bruto :");
		lblsbt.setBounds(50, 130, 80, 30);
		getContentPane().add(lblsbt);

		JLabel lbldescuento = new JLabel("Descuento :");
		lbldescuento.setBounds(50, 170, 80, 30);
		getContentPane().add(lbldescuento);

		JLabel lblsnt = new JLabel("Sueldo neto :");
		lblsnt.setBounds(50, 210, 80, 30);
		getContentPane().add(lblsnt);

		txtvendido = new JTextField();
		txtvendido.setBounds(130, 50, 60, 30);
		txtvendido.setHorizontalAlignment(SwingConstants.RIGHT);
		txtvendido.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtvendido);

		txtcomision = new JTextField();
		txtcomision.setBounds(130, 90, 60, 30);
		txtcomision.setFocusable(false);
		txtcomision.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcomision.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcomision);
		
		txtsbt = new JTextField();
		txtsbt.setBounds(130, 130, 60, 30);
		txtsbt.setFocusable(false);
		txtsbt.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsbt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsbt);

		txtdescuento = new JTextField();
		txtdescuento.setBounds(130, 170, 60, 30);
		txtdescuento.setFocusable(false);
		txtdescuento.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdescuento.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtdescuento);

		txtsnt = new JTextField();
		txtsnt.setBounds(130, 210, 60, 30);
		txtsnt.setFocusable(false);
		txtsnt.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsnt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsnt);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 280, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int vendido = Integer.parseInt(txtvendido.getText());

		double comision = (vendido/100)*9;
		double sbt = 500 + comision;
		double descuento = (sbt/100)*11;
		double snt = sbt - descuento;

		DecimalFormat df = new DecimalFormat("###.00");
		txtcomision.setText( df.format(comision));
		txtsbt.setText( df.format(sbt));
		txtdescuento.setText( df.format(descuento));
		txtsnt.setText( df.format(snt));

	} 
}