package d.swingjbutton;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author diego.diaz
 */
public class DSwingJButton extends JFrame implements ActionListener{

    private JButton boton1;
    
    public DSwingJButton() {
        setLayout(null);
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        DSwingJButton formulario = new DSwingJButton();
        formulario.setBounds(0, 0, 450, 350);
        formulario.setResizable(false);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }

    
    
}
