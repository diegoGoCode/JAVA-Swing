package f.swingjtextfield;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author diego.diaz
 */
public class FSwingJTextField extends JFrame implements ActionListener{

    private JLabel label1;
    private JTextField txt;
    private JButton btnAceptar;
    
    public FSwingJTextField() {
        setLayout(null);
        
        label1 = new JLabel("Usuario:");
        label1.setBounds(10, 10, 50, 20);
        
        txt = new JTextField();
        txt.setBounds(70, 10, 100, 20);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(10, 30, 100, 30);
        btnAceptar.addActionListener(this);
        
        add(label1);
        add(txt);
        add(btnAceptar);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAceptar){
            String usuario = txt.getText();
            this.setTitle(usuario);
        }
    }
    
    public static void main(String[] args) {
        FSwingJTextField formulario = new FSwingJTextField();
        formulario.setBounds(0, 0, 400, 400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
    
}
