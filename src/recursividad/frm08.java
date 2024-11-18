package recursividad;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtElemento;
    JLabel lblResultado;

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
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        txtElemento = new JTextField();
        txtElemento.setBounds(150, 30, 100, 30);
        getContentPane().add(txtElemento);

        JButton btnCalcular = new JButton("Buscar Elemento");
        btnCalcular.setBounds(30, 70, 200, 30);
        getContentPane().add(btnCalcular);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(30, 110, 300, 30);
        getContentPane().add(lblResultado);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    // Buscar Elemento
    public static boolean buscarElemento(int[] arreglo, int elemento, int index) {
        if (index == arreglo.length) return false;
        if (arreglo[index] == elemento) return true;
        return buscarElemento(arreglo, elemento, index + 1);
    }

    protected void btnCalcular_actionPerformed() {
        int[] arreglo = {1, 2, 3, 4, 5};
        int elemento = Integer.parseInt(txtElemento.getText());
        boolean encontrado = buscarElemento(arreglo, elemento, 0);
        lblResultado.setText("¿Elemento encontrado? " + encontrado);
    }
}
