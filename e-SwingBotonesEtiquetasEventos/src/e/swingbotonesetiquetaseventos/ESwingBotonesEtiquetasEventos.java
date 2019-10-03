package e.swingbotonesetiquetaseventos;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author diego.diaz
 */
public class ESwingBotonesEtiquetasEventos extends JFrame implements ActionListener{

    private JLabel label1;
    private JButton boton1, boton2, boton3;
    
    
    public ESwingBotonesEtiquetasEventos() {
        setLayout(null);
        label1 = new JLabel("En espera");
        label1.setBounds(50, 50, 300, 20);
        add(label1);
        
        boton1 = new JButton("Boton 1");
        boton1.setBounds(50, 100, 100, 30);
        boton1.addActionListener(this);
        add(boton1);
        
        boton2 = new JButton("Boton 2");
        boton2.setBounds(160, 100, 100, 30);
        boton2.addActionListener(this);
        add(boton2);
        
        boton3 = new JButton("Boton 3");
        boton3.setBounds(270, 100, 100, 30);
        boton3.addActionListener(this);
        add(boton3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == boton1){
            label1.setText("Has presionado el boton 1");
        }
        
        
        if(e.getSource() == boton2){
            label1.setText("Has presionado el boton 2");
        }
        
        
        if(e.getSource() == boton3){
            label1.setText("Has presionado el boton 3");
        }
        
    }
    
    public static void main(String[] args) {
        ESwingBotonesEtiquetasEventos formulario = new ESwingBotonesEtiquetasEventos();
        formulario.setBounds(0, 0, 600, 300);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }
    
}
