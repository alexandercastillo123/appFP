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

public class frm21 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtcodigo, txtec,txted, txtsex;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm21 frame = new frm21();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcodigo = new JLabel("Codigo :");
		lblcodigo.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcodigo);

		JLabel lblec = new JLabel("Estado civil :");
		lblec.setBounds(50, 90, 80, 30);
		getContentPane().add(lblec);
		
		JLabel lbled = new JLabel("Edad :");
		lbled.setBounds(50, 130, 80, 30);
		getContentPane().add(lbled);
		
		JLabel lblsex = new JLabel("Sexo :");
		lblsex.setBounds(50, 170, 80, 30);
		getContentPane().add(lblsex);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(130, 50, 60, 30);
		txtcodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcodigo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcodigo);
		
		txtec = new JTextField();
		txtec.setBounds(130, 90, 60, 30);
		txtec.setFocusable(false);
		txtec.setHorizontalAlignment(SwingConstants.RIGHT);
		txtec.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtec);
		
		txted = new JTextField();
		txted.setBounds(130, 130, 60, 30);
		txted.setFocusable(false);
		txted.setHorizontalAlignment(SwingConstants.RIGHT);
		txted.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txted);
		
		txtsex = new JTextField();
		txtsex.setBounds(130, 170, 60, 30);
		txtsex.setFocusable(false);
		txtsex.setHorizontalAlignment(SwingConstants.RIGHT);
		txtsex.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtsex);
		
		JButton btnCalcular = new JButton("Dar datos");
		btnCalcular.setBounds(100, 250, 100, 30);
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
		int codigo = Integer.parseInt(txtcodigo.getText() );
		
		int c1= codigo / 1000; codigo %=1000;
		int c2= codigo / 10; 
		int c3= codigo % 10;
		
		if (c1==1) txtec.setText("Soltero");
		else if (c1==2) txtec.setText("Casado");
		else if (c1==3) txtec.setText("Divorciado");
		else if (c1==4) txtec.setText("Viudo");
		
		if (0<c2) txted.setText(""+c2);
		
		if (c3==1) txtsex.setText("Masculino");
		else if (c3==2) txtsex.setText("Femenino");
	} 
}