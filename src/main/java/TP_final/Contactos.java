
package TP_final;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Contactos extends JFrame {
    
    public Contactos() {
        setSize(500,500);   //  un tamaño al programa
        setTitle("Agenda Trabajo Final");
        
        setResizable(false);    // no se puede agrandar el tamaño del programas
        setLocationRelativeTo(null);    // el programa aparece en el centro de la pantalla
        
        EjecutarComponentes();  // llamo y ejecuto al metodo que creé mas abajo
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // el programa se cierra bien haciendo clic en la X de la ventana    
    }
    
    private void EjecutarComponentes() {
        // creacion de un metodo para paneles y otros componentes
        JPanel panel = new JPanel();    // creacion del panel llamado "panel"
        panel.setBackground(Color.green);
        this.getContentPane().add(panel);   // agrego el panel sobre la ventana
       
    }
    
}
