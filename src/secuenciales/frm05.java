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

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtGigabytes, txtMegabytes, txtKilobytes, txtBytes;
	

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
		setBounds(0, 0, 300, 350);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblGigabites = new JLabel("Gigabites");
		lblGigabites.setBounds(50, 50, 80, 30);
		getContentPane().add(lblGigabites);

		JLabel lblMegabites = new JLabel("Megabites");
		lblMegabites.setBounds(50, 90, 80, 30);
		getContentPane().add(lblMegabites);

		JLabel lblkilobites = new JLabel("Kilobites");
		lblkilobites.setBounds(50, 130, 80, 30);
		getContentPane().add(lblkilobites);

		JLabel lblBites = new JLabel("Bites");
		lblBites.setBounds(50, 170, 80, 30);
		getContentPane().add(lblBites);

		txtGigabytes = new JTextField();
		txtGigabytes.setBounds(130, 50, 100, 30);
		txtGigabytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGigabytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtGigabytes);

		txtMegabytes = new JTextField();
		txtMegabytes.setBounds(130, 90, 100, 30);
		txtMegabytes.setFocusable(false);
		txtMegabytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMegabytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMegabytes);
		
		txtKilobytes = new JTextField();
		txtKilobytes.setBounds(130, 130, 100, 30);
		txtKilobytes.setFocusable(false);
		txtKilobytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKilobytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtKilobytes);

		txtBytes = new JTextField();
		txtBytes.setBounds(130, 170, 100, 30);
		txtBytes.setFocusable(false);
		txtBytes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBytes.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtBytes);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 240, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int Gigabites = Integer.parseInt(txtGigabytes.getText());

		int Megabites = Gigabites * 1024;
		int Kilobites = Megabites * 1024;
		int Bites = Kilobites * 1024;

		txtMegabytes.setText("" + Megabites );
		txtKilobytes.setText("" + Kilobites );
		txtBytes.setText("" + Bites );

	} 
}