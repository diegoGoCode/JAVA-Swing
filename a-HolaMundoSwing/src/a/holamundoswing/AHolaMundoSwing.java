package a.holamundoswing;

import javax.swing.*;

/**
 *
 * @author diego.diaz
 */
public class AHolaMundoSwing extends JFrame{

    public JLabel lblHolaMundo;

    public AHolaMundoSwing() {
        setLayout(null);
        lblHolaMundo = new JLabel("Hola mundo");
        lblHolaMundo.setBounds(10, 20, 200, 300);
        add(lblHolaMundo);  
    }
    
    public static void main(String[] args) {
        AHolaMundoSwing formulario1 = new AHolaMundoSwing();
        formulario1.setBounds(0, 0, 400, 300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }
    
}
