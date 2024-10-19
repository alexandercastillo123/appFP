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

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1nt, txt2nt,txt3nt, txtpf;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbl1nt = new JLabel("1era nota :");
		lbl1nt.setBounds(50, 50, 80, 30);
		getContentPane().add(lbl1nt);

		JLabel lbl2nt = new JLabel("2da nota :");
		lbl2nt.setBounds(50, 90, 80, 30);
		getContentPane().add(lbl2nt);
		
		JLabel lbl3nt = new JLabel("3era nota :");
		lbl3nt.setBounds(50, 130, 80, 30);
		getContentPane().add(lbl3nt);
		
		JLabel lblpf = new JLabel("Promedio final :");
		lblpf.setBounds(50, 170, 80, 30);
		getContentPane().add(lblpf);
		
		txt1nt = new JTextField();
		txt1nt.setBounds(130, 50, 60, 30);
		txt1nt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1nt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1nt);
		
		txt2nt = new JTextField();
		txt2nt.setBounds(130, 90, 60, 30);
		txt2nt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2nt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2nt);
		
		txt3nt = new JTextField();
		txt3nt.setBounds(130, 130, 60, 30);
		txt3nt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3nt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3nt);
		
		txtpf = new JTextField();
		txtpf.setBounds(130, 170, 60, 30);
		txtpf.setFocusable(false);
		txtpf.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpf.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpf);
		
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
		int no = Integer.parseInt(txt1nt.getText() );
		int not = Integer.parseInt(txt2nt.getText() );
		int nota = Integer.parseInt(txt3nt.getText() );
		
		int pf=(no+not+nota+2)/3;
		int pn=(no+not+nota)/3;
		
		if (9<nota) txtpf.setText(""+pf);
		else if (nota<10) txtpf.setText(""+pn);
		
	} 
}