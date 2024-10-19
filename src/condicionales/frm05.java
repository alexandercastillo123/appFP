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

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtcifras, txtnuevo;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcifras = new JLabel("Número :");
		lblcifras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcifras);

		JLabel lblnuevo = new JLabel("Nuevo número :");
		lblnuevo.setBounds(50, 90, 80, 30);
		getContentPane().add(lblnuevo);

		txtcifras = new JTextField();
		txtcifras.setBounds(130, 50, 60, 30);
		txtcifras.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcifras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcifras);
		
		txtnuevo = new JTextField();
		txtnuevo.setBounds(130, 90, 60, 30);
		txtnuevo.setFocusable(false);
		txtnuevo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnuevo.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtnuevo);

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
		
		int c1 = numero /1000; numero %= 1000;
		int c2 = numero /100; numero %= 100;
		int c3 = numero /10;		
		int c4 = numero % 10;	
		
		int d1=(c1*10)+c2;
		int d2=(c1*10)+c3;
		int d3=(c1*10)+c4;
		int d4=(c2*10)+c1;
		int d5=(c2*10)+c3;
		int d6=(c2*10)+c4;
		int d7=(c3*10)+c1;
		int d8=(c3*10)+c2;
		int d9=(c3*10)+c4;
		int d10=(c4*10)+c1;
		int d11=(c4*10)+c2;
		int d12=(c4*10)+c3;
		
		if (c2<c3 && c3<c4 && c4<c1) txtnuevo.setText(""+d1);
		if (c3<c2 && c2<c4 && c4<c1) txtnuevo.setText(""+d2);
		if (c4<c3 && c3<c2 && c2<c1) txtnuevo.setText(""+d3);
		if (c1<c4 && c4<c3 && c3<c2) txtnuevo.setText(""+d4);
		if (c3<c4 && c4<c3 && c3<c2) txtnuevo.setText(""+d5);
		if (c4<c2 && c2<c3 && c3<c2) txtnuevo.setText(""+d6);
		if (c1<c2 && c2<c4 && c4<c3) txtnuevo.setText(""+d7);
		if (c2<c4 && c4<c1 && c1<c3) txtnuevo.setText(""+d8);
		if (c4<c2 && c2<c1 && c1<c3) txtnuevo.setText(""+d9);
		if (c1<c2 && c2<c3 && c3<c4) txtnuevo.setText(""+d10);
		if (c2<c1 && c1<c3 && c3<c4) txtnuevo.setText(""+d11);
		if (c3<c2 && c2<c1 && c1<c4) txtnuevo.setText(""+d12);
	} 
}