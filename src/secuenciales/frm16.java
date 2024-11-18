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

public class frm16 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txthoras, txtsbc, txtsbt, txtsnt;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblhoras = new JLabel("Total horas :");
		lblhoras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblhoras);

		JLabel lblsbc = new JLabel("Sueldo basico :");
		lblsbc.setBounds(50, 90, 80, 30);
		getContentPane().add(lblsbc);

		JLabel lblsbt = new JLabel("Sueldo bruto :");
		lblsbt.setBounds(50, 130, 80, 30);
		getContentPane().add(lblsbt);

		JLabel lblsnt = new JLabel("Sueldo neto :");
		lblsnt.setBounds(50, 170, 80, 30);
		getContentPane().add(lblsnt);

		txthoras = new JTextField();
		txthoras.setBounds(130, 50, 60, 30);
		txthoras.setHorizontalAlignment(SwingConstants.RIGHT);
		txthoras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txthoras);

		txtsbc = new JTextField();
		txtsbc.setBounds(130, 90, 60, 30);
		txtsbc.setFocusable(false);
		txtsbc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsbc.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsbc);
		
		txtsbt = new JTextField();
		txtsbt.setBounds(130, 130, 60, 30);
		txtsbt.setFocusable(false);
		txtsbt.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsbt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsbt);

		txtsnt = new JTextField();
		txtsnt.setBounds(130, 170, 60, 30);
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
		int horas = Integer.parseInt(txthoras.getText());

		double sbc = horas * 5.34;
		double sbt = sbc + (sbc/100) * 20;
		double snt = sbt - (sbt/100) * 10;

		DecimalFormat df = new DecimalFormat("###.00");
		txtsbc.setText( df.format(sbc));
		txtsbt.setText( df.format(sbt));
		txtsnt.setText( df.format(snt));

	} 
}