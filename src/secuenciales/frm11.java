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

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1nr, txt2nr, txt1int, txt2int;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbl1nr = new JLabel("1er Número :");
		lbl1nr.setBounds(50, 50, 80, 30);
		getContentPane().add(lbl1nr);

		JLabel lbl2nr = new JLabel("2do Número :");
		lbl2nr.setBounds(50, 90, 80, 30);
		getContentPane().add(lbl2nr);
		
		JLabel lbl1int = new JLabel("1er intercambio :");
		lbl1int.setBounds(50, 130, 80, 30);
		getContentPane().add(lbl1int);
		
		JLabel lbl2int = new JLabel("2do intercambio :");
		lbl2int.setBounds(50, 170, 80, 30);
		getContentPane().add(lbl2int);

		txt1nr = new JTextField();
		txt1nr.setBounds(130, 50, 60, 30);
		txt1nr.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1nr.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1nr);
		
		txt2nr = new JTextField();
		txt2nr.setBounds(130, 90, 60, 30);
		txt2nr.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2nr.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2nr);
		
		txt1int = new JTextField();
		txt1int.setBounds(130, 130, 60, 30);
		txt1int.setFocusable(false);
		txt1int.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1int.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1int);
		
		txt2int = new JTextField();
		txt2int.setBounds(130, 170, 60, 30);
		txt2int.setFocusable(false);
		txt2int.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2int.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2int);

		JButton btnInvertir = new JButton("Intercambiar");
		btnInvertir.setBounds(100, 210, 100, 30);
		btnInvertir.setMnemonic('a');
		getContentPane().add(btnInvertir);
		
		btnInvertir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int nr = Integer.parseInt(txt1nr.getText() );
		int Nr = Integer.parseInt(txt2nr.getText() );
		
		int c1 = nr /100; nr %= 100;
		int c2 = nr /10;		
		int c3 = nr % 10;
		int C1 = Nr /100; Nr %= 100;
		int C2 = Nr /10;	
		int C3 = Nr % 10;
		
		int d1 = C3*100;
		int d2 = c2*10;
		int d3 = C1;
		int D1 = c3*100;
		int D2 = C2*10;
		int D3 = c1;
		
		txt1int.setText("" + (d1+d2+d3));
		txt2int.setText("" + (D1+D2+D3));
	} 
}