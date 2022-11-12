
package TP_final;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Contactos extends JFrame {
    
    public JPanel panel = new JPanel();     // creacion del panel llamado "panel"
    
    
    public Contactos() {
        setSize(700,500);   //  un tamaño al programa
        setTitle("Agenda Trabajo Final");
        
        setResizable(false);    // no se puede agrandar el tamaño del programas
        setLocationRelativeTo(null);    // el programa aparece en el centro de la pantalla
        
        todosLosPaneles();
        todasLasEtiquetas();  // llamo y ejecuto al metodo que creé mas abajo
        todosLosBotones();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // el programa se cierra bien haciendo clic en la X de la ventana    
    }
    
    
    
    private void todosLosPaneles() {
        // creacion de un metodo para paneles  
        panel.setLayout(null);
        
        panel.setBackground(Color.DARK_GRAY);   // fondo gris oscuro
        this.getContentPane().add(panel);   // agrego el panel sobre la ventana
        
    }
    
    
    private void todosLosBotones(){
        
        JButton butonAtras = new JButton("<<");
        JButton butonGrabar = new JButton("GRABAR");
        JButton butonSiguiente = new JButton(">>");
        
        JButton[] listaBotones = {
            butonAtras,
            butonGrabar,
            butonSiguiente
        };
              
        int x = 210;
        int y = 320;
        
        for (JButton  item  :  listaBotones ){
            
            if( item == butonGrabar ){
                item.setBounds(x, y, 100, 50);
                x += 120;
            } 
            else {
                item.setBounds(x, y, 60, 50);
                x += 80;
            }
            
            panel.add(item);
           
            
        }
        
    }
    
    
    private void todasLasEtiquetas() {

        JLabel labelTitulo = new JLabel("AGENDA ELECTRÓNICA", SwingConstants.CENTER);
        
        JLabel labelDNI = new JLabel("DNI  : ");
        JLabel labelNombre = new JLabel("Nombre  : ");
        JLabel labelApellido = new JLabel("Apellido  : ");
        JLabel labelDireccion = new JLabel("Direccion  : ");
        JLabel labelTelefono = new JLabel("Telefono  : ");
        JLabel labelFechaNAC = new JLabel("Fecha Nac.  : ");
        
        JLabel labelIndice = new JLabel ("INDICE  : ");
           
        
        JLabel[] listaDeLabels = {
            // lista de objetos del tipo JLabel
            labelDNI,
            labelNombre,
            labelApellido,
            labelDireccion,
            labelTelefono,
            labelFechaNAC,
            labelIndice
        };
        
        labelTitulo.setBounds(0, 0, 700, 65);
        labelTitulo.setFont(  new Font("Yu Gothic UI", 1 , 25 ) );
        labelTitulo.setForeground(Color.WHITE);      // cambio el color de la letra a blanco
        
        labelTitulo.setOpaque(true);         // permite poder cambiar el color del fondo
        labelTitulo.setBackground(Color.BLACK);  // cambio el color fondo negro
        
        
        
        int x = 55;
        int y = 120;
        
        for (  JLabel  item  :  listaDeLabels  ) {
            
            
            if (item == labelIndice ) {
                x = 180;
                y = 400;
            }
            
            
            if (item == labelDireccion){
                // imprime la otra fila de etiquetas "apellido" -> "direccion"
                x = 335;
                y = 120;
            }
            
            
            item.setBounds(x, y, 50, 20);
            item.setForeground(Color.white);
            item.setFont( new Font("Yu Gothic UI", 0 , 18 ) );
            item.setSize(110, 30);
            
            y += 60;
        }
        
      
        
        panel.add(labelTitulo);   
        panel.add(labelDNI);    
        panel.add(labelNombre);    
        panel.add(labelApellido);    
        panel.add(labelDireccion);    
        panel.add(labelTelefono);    
        panel.add(labelFechaNAC);     
        panel.add(labelIndice);       
    }
    
    
    
}
