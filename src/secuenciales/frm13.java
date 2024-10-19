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

public class frm13 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtaltura, txtbase, txthipotenusa;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblaltura = new JLabel("Altura :");
		lblaltura.setBounds(50, 50, 80, 30);
		getContentPane().add(lblaltura);

		JLabel lblbase = new JLabel("Base :");
		lblbase.setBounds(50, 90, 80, 30);
		getContentPane().add(lblbase);

		JLabel lblarea = new JLabel("Hipotenusa :");
		lblarea.setBounds(50, 130, 80, 30);
		getContentPane().add(lblarea);

		txtaltura = new JTextField();
		txtaltura.setBounds(130, 50, 60, 30);
		txtaltura.setHorizontalAlignment(SwingConstants.RIGHT);
		txtaltura.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtaltura);

		txtbase = new JTextField();
		txtbase.setBounds(130, 90, 60, 30);
		txtbase.setHorizontalAlignment(SwingConstants.RIGHT);
		txtbase.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtbase);
		
		txthipotenusa = new JTextField();
		txthipotenusa.setBounds(130, 130, 60, 30);
		txthipotenusa.setFocusable(false);
		txthipotenusa.setHorizontalAlignment(SwingConstants.RIGHT);
		txthipotenusa.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txthipotenusa);

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
        int base = Integer.parseInt(txtbase.getText());

		double hipotenusa = Math.sqrt((altura*altura)+(base*base));

		DecimalFormat df = new DecimalFormat("###.00");
		txthipotenusa.setText( df.format(hipotenusa));

	} 
}