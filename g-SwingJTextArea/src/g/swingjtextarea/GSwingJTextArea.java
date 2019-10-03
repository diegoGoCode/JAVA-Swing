package g.swingjtextarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author diego.diaz
 */
public class GSwingJTextArea extends JFrame implements ActionListener{

    private JTextField txt;
    private JTextArea txtTarea;
    private JButton btnSalir;

    public GSwingJTextArea() {
        
        setLayout(null);
        txt = new JTextField();
        txt.setBounds(10, 10, 200, 30);

        txtTarea = new JTextArea();
        txtTarea.setBounds(10, 50, 400, 300);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(10, 360, 100, 30);
        btnSalir.addActionListener(this);

        add(txt);
        add(txtTarea);
        add(btnSalir);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSalir){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        GSwingJTextArea formulario = new GSwingJTextArea();
        formulario.setBounds(0, 0, 500, 500);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }

    

}
