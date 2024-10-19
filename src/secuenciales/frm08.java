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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtaltura, txtradio, txtareabs, txtarealtl, txtareatot;
	

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
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblaltura = new JLabel("Altura");
		lblaltura.setBounds(50, 50, 80, 30);
		getContentPane().add(lblaltura);

		JLabel lblradio = new JLabel("Radio");
		lblradio.setBounds(50, 90, 80, 30);
		getContentPane().add(lblradio);

		JLabel lblareabs = new JLabel("Area base");
		lblareabs.setBounds(50, 130, 80, 30);
		getContentPane().add(lblareabs);

		JLabel lblarealtl = new JLabel("Area lateral");
		lblarealtl.setBounds(50, 170, 80, 30);
		getContentPane().add(lblarealtl);
		
		JLabel lblareatot = new JLabel("Area total");
		lblareatot.setBounds(50, 210, 80, 30);
		getContentPane().add(lblareatot);

		txtaltura = new JTextField();
		txtaltura.setBounds(130, 50, 60, 30);
		txtaltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtaltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtaltura);

		txtradio = new JTextField();
		txtradio.setBounds(130, 90, 60, 30);
		txtradio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtradio.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtradio);
		
		txtareabs = new JTextField();
		txtareabs.setBounds(130, 130, 60, 30);
		txtareabs.setFocusable(false);
		txtareabs.setHorizontalAlignment(SwingConstants.RIGHT);
		txtareabs.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtareabs);

		txtarealtl = new JTextField();
		txtarealtl.setBounds(130, 170, 60, 30);
		txtarealtl.setFocusable(false);
		txtarealtl.setHorizontalAlignment(SwingConstants.RIGHT);
		txtarealtl.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtarealtl);
		
		txtareatot = new JTextField();
		txtareatot.setBounds(130, 210, 60, 30);
		txtareatot.setFocusable(false);
		txtareatot.setHorizontalAlignment(SwingConstants.RIGHT);
		txtareatot.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtareatot);

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
		int altura = Integer.parseInt(txtaltura.getText());
        int radio = Integer.parseInt(txtradio.getText());

		double areabs = Math.PI * radio * radio;
		double arealtl = 2 * Math.PI * radio * altura;
		double areatotal = 2*areabs+arealtl;

		DecimalFormat df = new DecimalFormat("###.00");
		txtareabs.setText( df.format(areabs));
		txtarealtl.setText( df.format(arealtl));
		txtareatot.setText( df.format(areatotal));

	} 
}