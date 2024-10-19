package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtcifras, txtinvertir;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcifras = new JLabel("Número :");
		lblcifras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcifras);

		JLabel lbltotalsuma = new JLabel("Invertido :");
		lbltotalsuma.setBounds(50, 90, 80, 30);
		getContentPane().add(lbltotalsuma);

		txtcifras = new JTextField();
		txtcifras.setBounds(130, 50, 60, 30);
		txtcifras.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcifras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcifras);
		
		txtinvertir = new JTextField();
		txtinvertir.setBounds(130, 90, 60, 30);
		txtinvertir.setFocusable(false);
		txtinvertir.setHorizontalAlignment(SwingConstants.RIGHT);
		txtinvertir.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtinvertir);

		JButton btnInvertir = new JButton("Invertir");
		btnInvertir.setBounds(100, 150, 100, 30);
		btnInvertir.setMnemonic('a');
		getContentPane().add(btnInvertir);
		
		btnInvertir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt(txtcifras.getText() );
		
		int c1 = numero /1000; numero %= 1000;
		int c2 = numero /100; numero %= 100;
		int c3 = numero /10;		
		int c4 = numero % 10;
		int d1 = c4*1000;
		int d2 = c3*100;
		int d3 = c2*10;
		int d4 = c1;
		
		txtinvertir.setText("" + (d1+d2+d3+d4));
	} 
}