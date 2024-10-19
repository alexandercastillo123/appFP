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

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtaltura, txtradio, txtarea, txtvolumen;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm06() {
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

		JLabel lblarea = new JLabel("Area");
		lblarea.setBounds(50, 130, 80, 30);
		getContentPane().add(lblarea);

		JLabel lblvolumen = new JLabel("Volumen");
		lblvolumen.setBounds(50, 170, 80, 30);
		getContentPane().add(lblvolumen);

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
		
		txtarea = new JTextField();
		txtarea.setBounds(130, 130, 60, 30);
		txtarea.setFocusable(false);
		txtarea.setHorizontalAlignment(SwingConstants.RIGHT);
		txtarea.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtarea);

		txtvolumen = new JTextField();
		txtvolumen.setBounds(130, 170, 60, 30);
		txtvolumen.setFocusable(false);
		txtvolumen.setHorizontalAlignment(SwingConstants.RIGHT);
		txtvolumen.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtvolumen);

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

		double area = 2 * Math.PI * radio * (radio + altura);
		double volumen = Math.PI * Math.pow(radio, 2) * altura;

		DecimalFormat df = new DecimalFormat("###.00");
		txtarea.setText( df.format(area));
		txtvolumen.setText( df.format(volumen));

	} 
}