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

public class frm23 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txt1nt, txt2nt,txt3nt, txtpf, txtptm, txtptf;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm23 frame = new frm23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 400);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lbl1nt = new JLabel("Matematica :");
		lbl1nt.setBounds(50, 50, 80, 30);
		getContentPane().add(lbl1nt);

        JLabel lblptm = new JLabel("Puntos de matematica :");
		lblptm.setBounds(50, 90, 80, 30);
		getContentPane().add(lblptm);

		JLabel lbl2nt = new JLabel("Fisica :");
		lbl2nt.setBounds(50, 130, 80, 30);
		getContentPane().add(lbl2nt);

        JLabel lblptf = new JLabel("Puntos de fisica :");
		lblptf.setBounds(50, 170, 80, 30);
		getContentPane().add(lblptf);
		
		JLabel lbl3nt = new JLabel("Propina :");
		lbl3nt.setBounds(50, 210, 80, 30);
		getContentPane().add(lbl3nt);
		
		JLabel lblpf = new JLabel("Reloj :");
		lblpf.setBounds(50, 250, 80, 30);
		getContentPane().add(lblpf);
		
		txt1nt = new JTextField();
		txt1nt.setBounds(130, 50, 60, 30);
		txt1nt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1nt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt1nt);

        txtptm = new JTextField();
		txtptm.setBounds(130, 90, 60, 30);
		txtptm.setHorizontalAlignment(SwingConstants.RIGHT);
		txtptm.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtptm);
		
		txt2nt = new JTextField();
		txt2nt.setBounds(130, 130, 60, 30);
		txt2nt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2nt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt2nt);

        txtptf = new JTextField();
		txtptf.setBounds(130, 170, 60, 30);
		txtptf.setHorizontalAlignment(SwingConstants.RIGHT);
		txtptf.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtptf);
		
		txt3nt = new JTextField();
		txt3nt.setBounds(130, 210, 60, 30);
        txt3nt.setFocusable(false);
		txt3nt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt3nt.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txt3nt);
		
		txtpf = new JTextField();
		txtpf.setBounds(130, 250, 60, 30);
		txtpf.setFocusable(false);
		txtpf.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpf.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpf);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(100, 290, 100, 30);
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
		int a = Integer.parseInt(txt1nt.getText() );
		int b = Integer.parseInt(txt2nt.getText() );
        int pm = Integer.parseInt(txtptm.getText() );
        int pfs = Integer.parseInt(txtptf.getText() );
		
		int R=(a+b)/2;
		int pm1=(3*pm)+(2*pfs);
        double pm2=(3*pm)+(0.5*pfs);
        int pm3=(pm)+(2*pfs);
        double pm4=(pm)+(0.5*pfs);
                
		if (17<a&&15<b) txt3nt.setText(""+pm1);
        if (17<a&&b<16) txt3nt.setText(""+pm2);
        if (a<18&&15<b) txt3nt.setText(""+pm3);
        if (17>a&&b>16) txt3nt.setText(""+pm4);

        if (16<R) txtpf.setText("SI");
        else txtpf.setText("NO");
		
	} 
}