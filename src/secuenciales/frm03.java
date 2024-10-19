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

public class frm03 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtKilometros, txtPies, txtMillas, txtMetros, txtYardas;
	

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
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblKilometros = new JLabel("1er Tramo");
		lblKilometros.setBounds(50, 50, 80, 30);
		getContentPane().add(lblKilometros);

		JLabel lblPies = new JLabel("2do Tramo");
		lblPies.setBounds(50, 90, 80, 30);
		getContentPane().add(lblPies);

		JLabel lblMillas = new JLabel("3er Tramo");
		lblMillas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblMillas);

		JLabel lblMetros = new JLabel("Total en metros");
		lblMetros.setBounds(50, 170, 80, 30);
		getContentPane().add(lblMetros);

		JLabel lblYardas = new JLabel("Total en yardas");
		lblYardas.setBounds(50, 210, 80, 30);
		getContentPane().add(lblYardas);

		txtKilometros = new JTextField();
		txtKilometros.setBounds(130, 50, 60, 30);
		txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtKilometros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtKilometros);

		txtPies = new JTextField();
		txtPies.setBounds(130, 90, 60, 30);
		txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPies);
		
		txtMillas = new JTextField();
		txtMillas.setBounds(130, 130, 60, 30);
		txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMillas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMillas);

		txtMetros = new JTextField();
		txtMetros.setBounds(130, 170, 60, 30);
		txtMetros.setFocusable(false);
		txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtMetros);

		txtYardas = new JTextField();
		txtYardas.setBounds(130, 210, 60, 30);
		txtYardas.setFocusable(false);
		txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtYardas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtYardas);

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
		int kilometros = Integer.parseInt(txtKilometros.getText());
		int pies = Integer.parseInt(txtPies.getText());
		int millas = Integer.parseInt(txtMillas.getText());

		double Metros = kilometros*1000+pies/3.2808+millas*1609;
		double Yardas = Metros*1.0936;

		DecimalFormat df = new DecimalFormat("###.00");
		txtMetros.setText( df.format(Metros));
		txtYardas.setText( df.format(Yardas));

	} 
}