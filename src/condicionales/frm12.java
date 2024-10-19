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

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtnumero, txtdia;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcifras = new JLabel("Número :");
		lblcifras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcifras);

		JLabel lbltotalsuma = new JLabel("Día :");
		lbltotalsuma.setBounds(50, 90, 80, 30);
		getContentPane().add(lbltotalsuma);

		txtnumero = new JTextField();
		txtnumero.setBounds(130, 50, 60, 30);
		txtnumero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnumero.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnumero);
		
		txtdia = new JTextField();
		txtdia.setBounds(130, 90, 60, 30);
		txtdia.setFocusable(false);
		txtdia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdia.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtdia);

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
		int numero = Integer.parseInt(txtnumero.getText() );
		
		if (numero == 1) txtdia.setText("Lunes");
		else if (numero == 2) txtdia.setText("Martes");
		else if (numero == 3) txtdia.setText("Miercoles");
		else if (numero == 4) txtdia.setText("Jueves");
		else if (numero == 5) txtdia.setText("Viernes");
		else if (numero == 6) txtdia.setText("Sabado");
		else if (numero == 7) txtdia.setText("Domingo");
		else txtdia.setText("Error");
	} 
}