package c.swingjlabel;

import javax.swing.*;


/**
 *
 * @author diego.diaz
 */
public class CSwingJLabel extends JFrame{
    private JLabel label1;
    private JLabel label2;

    public CSwingJLabel() {
        setLayout(null);
        label1 = new JLabel("Interfaz grafica");    
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        label2 = new JLabel("Version 1.0");   
        label2.setBounds(10, 100, 100, 30);
        add(label2);
    }
    
    
    
    public static void main(String[] args) {
        CSwingJLabel formulario = new CSwingJLabel();
        formulario.setBounds(0, 0, 300, 200);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
    
}
