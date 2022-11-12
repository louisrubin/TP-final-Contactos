
package TP_final;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Contactos extends JFrame {
    
    public Contactos() {
        setSize(700,500);   //  un tamaño al programa
        setTitle("Agenda Trabajo Final");
        
        setResizable(false);    // no se puede agrandar el tamaño del programas
        setLocationRelativeTo(null);    // el programa aparece en el centro de la pantalla
        
        EjecutarComponentes();  // llamo y ejecuto al metodo que creé mas abajo
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // el programa se cierra bien haciendo clic en la X de la ventana    
    }
    
    private void EjecutarComponentes() {
        // creacion de un metodo para paneles y otros componentes
        JPanel panel = new JPanel();    // creacion del panel llamado "panel"
        panel.setLayout(null);
        
        // jLabel1.setFont(jLabel1.getFont().deriveFont(Font.ITALIC));
        
        panel.setBackground(Color.DARK_GRAY);   // fondo gris oscuro
        this.getContentPane().add(panel);   // agrego el panel sobre la ventana
       
        
        JLabel titulo = new JLabel("AGENDA ELECTRÓNICA", SwingConstants.CENTER);
        titulo.setBounds(0, 0, 700, 65);
        titulo.setFont(  new Font("impact", 0 , 25 ) );
        titulo.setForeground(Color.WHITE);      // cambio el color de la letra a blanco
        
        titulo.setOpaque(true);         // permite poder cambiar el color del fondo
        titulo.setBackground(Color.BLACK);  // cambio el color fondo negro
        
        
        panel.add(titulo);
       
        
        
    }
    
}
