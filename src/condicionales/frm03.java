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

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel lblangulo;
	JTextField txtangulo, txttipo;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblangulo = new JLabel("Angulo :");
		lblangulo.setBounds(50, 50, 80, 30);
		getContentPane().add(lblangulo);

		JLabel lbltipo = new JLabel("Tipo :");
		lbltipo.setBounds(50, 90, 80, 30);
		getContentPane().add(lbltipo);
		
		lblangulo = new JLabel("°");
		lblangulo.setBounds(200, 50, 120, 30);
		getContentPane().add(lblangulo);


		txtangulo = new JTextField();
		txtangulo.setBounds(130, 50, 60, 30);
		txtangulo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtangulo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtangulo);
		
		txttipo = new JTextField();
		txttipo.setBounds(130, 90, 60, 30);
		txttipo.setFocusable(false);
		txttipo.setHorizontalAlignment(SwingConstants.RIGHT);
		txttipo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txttipo);

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
		int numero = Integer.parseInt(txtangulo.getText() );
		
		if (numero == 0) txttipo.setText("Nulo");
		else if (numero<90 && 0<numero) txttipo.setText("Agudo");
		else if (numero == 90) txttipo.setText("Recto");
		else if (numero<180 && 90<numero) txttipo.setText("Obtuso");
		else if (numero == 180) txttipo.setText("Llano");
		else if (numero<360 && 180<numero) txttipo.setText("Concavo");
		else if (numero == 360) txttipo.setText("Completo");
		
		//txttipo.setText( numero == 0 ? "Nulo" : numero < 90 ? "N" : "Completo");
	} 
}