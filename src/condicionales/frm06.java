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

public class frm06 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txted, txt2ed,txt3ed, txtma, txtme;

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

		JLabel lbl1ed = new JLabel("1era edad :");
		lbl1ed.setBounds(50, 50, 80, 30);
		getContentPane().add(lbl1ed);

		JLabel lbl2ed = new JLabel("2da edad :");
		lbl2ed.setBounds(50, 90, 80, 30);
		getContentPane().add(lbl2ed);
		
		JLabel lbl3ed = new JLabel("3era edad :");
		lbl3ed.setBounds(50, 130, 80, 30);
		getContentPane().add(lbl3ed);
		
		JLabel lblma = new JLabel("Mayor edad :");
		lblma.setBounds(50, 170, 80, 30);
		getContentPane().add(lblma);
		
		JLabel lblme = new JLabel("Menor edad :");
		lblme.setBounds(50, 210, 80, 30);
		getContentPane().add(lblme);
		
		txted = new JTextField();
		txted.setBounds(130, 50, 60, 30);
		txted.setHorizontalAlignment(SwingConstants.RIGHT);
		txted.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txted);
		
		txt2ed = new JTextField();
		txt2ed.setBounds(130, 90, 60, 30);
		txt2ed.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2ed.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2ed);
		
		txt3ed = new JTextField();
		txt3ed.setBounds(130, 130, 60, 30);
		txt3ed.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3ed.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3ed);
		
		txtma = new JTextField();
		txtma.setBounds(130, 170, 60, 30);
		txtma.setFocusable(false);
		txtma.setHorizontalAlignment(SwingConstants.RIGHT);
		txtma.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtma);
		
		txtme = new JTextField();
		txtme.setBounds(130, 210, 60, 30);
		txtme.setFocusable(false);
		txtme.setHorizontalAlignment(SwingConstants.RIGHT);
		txtme.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtme);

		JButton btnCalcular = new JButton("Calcular");
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
		int ed = Integer.parseInt(txted.getText() );
		int eda = Integer.parseInt(txt2ed.getText() );
		int edad = Integer.parseInt(txt3ed.getText() );
		
		if (eda<ed && edad<ed) txtma.setText(""+ed);
		else if (ed<eda && edad<eda) txtma.setText(""+eda);
		else if (ed<edad && eda<edad) txtma.setText(""+edad);
		
		if (ed<eda && ed<edad) txtme.setText(""+ed);
		else if (eda<ed && eda<edad) txtme.setText(""+eda);
		else if (edad<ed && edad<eda) txtme.setText(""+edad);
		
	} 
}