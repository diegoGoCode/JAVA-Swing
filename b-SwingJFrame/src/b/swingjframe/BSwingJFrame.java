package b.swingjframe;

import javax.swing.JFrame;

/**
 *
 * @author diego.diaz
 */
public class BSwingJFrame extends JFrame{

    public BSwingJFrame() {
        setLayout(null);
    }

   
    public static void main(String[] args) {
        BSwingJFrame formulario = new BSwingJFrame();
        //formulario.setBounds(x, y, ancho, alto);
        formulario.setBounds(300, 300, 300, 300);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
    }
    
}
