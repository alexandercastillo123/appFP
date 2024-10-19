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

public class frm17 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtDonacion, txtCntsld, txtCmdift, txtEscift, txtAslanc;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm17 frame = new frm17();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm17() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblDonacion = new JLabel("Donacion");
		lblDonacion.setBounds(50, 50, 80, 30);
		getContentPane().add(lblDonacion);

		JLabel lblCntsld = new JLabel("Centro de salud");
		lblCntsld.setBounds(50, 90, 80, 30);
		getContentPane().add(lblCntsld);

		JLabel lblCmdift = new JLabel("Comedor infantil");
		lblCmdift.setBounds(50, 130, 80, 30);
		getContentPane().add(lblCmdift);

		JLabel lblEscift = new JLabel("Escuela infantil");
		lblEscift.setBounds(50, 170, 80, 30);
		getContentPane().add(lblEscift);

		JLabel lblAslanc = new JLabel("Asilo de ancianos");
		lblAslanc.setBounds(50, 210, 80, 30);
		getContentPane().add(lblAslanc);

		txtDonacion = new JTextField();
		txtDonacion.setBounds(130, 50, 60, 30);
		txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDonacion.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDonacion);

		txtCntsld = new JTextField();
		txtCntsld.setBounds(130, 90, 60, 30);
		txtCntsld.setFocusable(false);
		txtCntsld.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCntsld.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCntsld);
		
		txtCmdift = new JTextField();
		txtCmdift.setBounds(130, 130, 60, 30);
		txtCmdift.setFocusable(false);
		txtCmdift.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCmdift.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtCmdift);

		txtEscift = new JTextField();
		txtEscift.setBounds(130, 170, 60, 30);
		txtEscift.setFocusable(false);
		txtEscift.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEscift.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtEscift);

		txtAslanc = new JTextField();
		txtAslanc.setBounds(130, 210, 60, 30);
		txtAslanc.setFocusable(false);
		txtAslanc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAslanc.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtAslanc);

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
		int Donacion = Integer.parseInt(txtDonacion.getText());

		double salud = (Donacion/100)*25;
		double comedor = (Donacion/100)*35;
		double escuela = (Donacion/100)*25;
		double asilo = (Donacion/100)*15;

		DecimalFormat df = new DecimalFormat("###.00");
		txtCntsld.setText( df.format(salud));
		txtCmdift.setText( df.format(comedor));
		txtEscift.setText( df.format(escuela));
		txtAslanc.setText( df.format(asilo));

	} 
}