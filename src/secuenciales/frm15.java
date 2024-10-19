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

public class frm15 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtjuan, txtrosa, txtdaniel, txtcapital;
	JLabel lbljuan, lblrosa, lbldaniel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbljuan = new JLabel("Juan :");
		lbljuan.setBounds(50, 50, 80, 30);
		getContentPane().add(lbljuan);

		JLabel lblrosa = new JLabel("Rosa :");
		lblrosa.setBounds(50, 90, 80, 30);
		getContentPane().add(lblrosa);
		
		JLabel lbldaniel = new JLabel("Daniel :");
		lbldaniel.setBounds(50, 130, 80, 30);
		getContentPane().add(lbldaniel);
		
		JLabel lblcapital = new JLabel("Capital :");
		lblcapital.setBounds(50, 170, 80, 30);
		getContentPane().add(lblcapital);

		lbljuan = new JLabel("%");
		lbljuan.setBounds(200, 50, 120, 30);
		getContentPane().add(lbljuan);

		lblrosa = new JLabel("%");
		lblrosa.setBounds(200, 90, 80, 30);
		getContentPane().add(lblrosa);
		
		lbldaniel = new JLabel("%");
		lbldaniel.setBounds(200, 130, 80, 30);
		getContentPane().add(lbldaniel);

		txtjuan = new JTextField();
		txtjuan.setBounds( 130, 50, 60, 30);
		txtjuan.setHorizontalAlignment( SwingConstants.RIGHT );
		txtjuan.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtjuan);

		txtrosa = new JTextField();
		txtrosa.setBounds( 130, 90, 60, 30);
		txtrosa.setHorizontalAlignment( SwingConstants.RIGHT );
		txtrosa.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtrosa);
		
		txtdaniel = new JTextField();
		txtdaniel.setBounds( 130, 130, 60, 30);
		txtdaniel.setHorizontalAlignment( SwingConstants.RIGHT );
		txtdaniel.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtdaniel);
		
		txtcapital = new JTextField();
		txtcapital.setBounds( 130, 170, 60, 30);
		txtcapital.setFocusable(false);
		txtcapital.setHorizontalAlignment( SwingConstants.RIGHT );
		txtcapital.setMargin( new Insets(5, 5, 5, 5) );
		getContentPane().add(txtcapital);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds( 80, 210, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});

	}

	protected void btnCalcular_actionPerformed() {
		int varones = Integer.parseInt( txtjuan.getText() );
		int mujeres = Integer.parseInt( txtrosa.getText() );

		int total = varones + mujeres;
		double pVarones = varones * 100.0 / total;
		double pMujeres = mujeres * 100.0 / total;
		double dani = mujeres*2;

		DecimalFormat df = new DecimalFormat( "####.##");
		lbljuan.setText( df.format( pVarones ) + " %" );
		lblrosa.setText( df.format( pMujeres ) + " %" );
		lbldaniel.setText( df.format( dani) + " %" );
	}

}