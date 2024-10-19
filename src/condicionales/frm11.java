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

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtcifras, txtsigno;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcifras = new JLabel("Número :");
		lblcifras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcifras);

		JLabel lbltotalsuma = new JLabel("Signo :");
		lbltotalsuma.setBounds(50, 90, 80, 30);
		getContentPane().add(lbltotalsuma);

		txtcifras = new JTextField();
		txtcifras.setBounds(130, 50, 60, 30);
		txtcifras.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcifras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcifras);
		
		txtsigno = new JTextField();
		txtsigno.setBounds(130, 90, 60, 30);
		txtsigno.setFocusable(false);
		txtsigno.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsigno.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsigno);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtcifras.getText() );
		
		//if (numero > 0) txtsigno.setText("Positivo");
		//else if (numero == 0) txtsigno.setText("Cero");
		//else txtsigno.setText("Negativo");
		
		txtsigno.setText( numero > 0 ? "Positivo" : numero < 0 ? "Negativo" : "Cero");
	} 
}