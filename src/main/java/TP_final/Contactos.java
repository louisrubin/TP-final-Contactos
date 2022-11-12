
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
        
        Font fuenteLetra = new Font("Serif", Font.BOLD, 25);
        // jLabel1.setFont(jLabel1.getFont().deriveFont(Font.ITALIC));
        
        panel.setBackground(Color.DARK_GRAY);   // fondo gris oscuro
        this.getContentPane().add(panel);   // agrego el panel sobre la ventana
       
        
        JLabel titulo = new JLabel("AGENDA ELECTRÓNICA", SwingConstants.CENTER);
        titulo.setBounds(0, 0, 700, 65);
        titulo.setFont(fuenteLetra);
        titulo.setForeground(Color.WHITE);
        
        titulo.setOpaque(true);
        titulo.setBackground(Color.BLACK);
        
        
        panel.add(titulo);
       
        
        
    }
    
}
