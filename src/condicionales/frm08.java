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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtexa, txtpro;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblexa = new JLabel("Examenes aprobados :");
		lblexa.setBounds(50, 50, 80, 30);
		getContentPane().add(lblexa);

		JLabel lblpro = new JLabel("Propina total :");
		lblpro.setBounds(50, 90, 80, 30);
		getContentPane().add(lblpro);
		
		txtexa = new JTextField();
		txtexa.setBounds(130, 50, 60, 30);
		txtexa.setHorizontalAlignment(SwingConstants.RIGHT);
		txtexa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtexa);
		
		txtpro = new JTextField();
		txtpro.setBounds(130, 90, 60, 30);
		txtpro.setFocusable(false);
		txtpro.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpro.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpro);

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
		int numero = Integer.parseInt(txtexa.getText() );
		
		if (numero == 0) txtpro.setText("20");
		else if (numero==1) txtpro.setText("25");
		else if (numero ==2) txtpro.setText("30");
		else if (numero ==3) txtpro.setText("35");
		
		//txttipo.setText( numero == 0 ? "Nulo" : numero < 90 ? "N" : "Completo");
	} 
}