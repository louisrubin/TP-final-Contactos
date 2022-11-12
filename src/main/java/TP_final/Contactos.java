
package TP_final;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Contactos extends JFrame {
    
    public JPanel panel = new JPanel();     // panel principal de todos
    
    
    public Contactos() {
        setSize(700,500);   //  un tamaño al programa
        setTitle("Agenda Trabajo Final");
        
        setResizable(false);    // no se puede agrandar el tamaño del programas
        setLocationRelativeTo(null);    // el programa aparece en el centro de la pantalla
        
        todosLosPaneles();
        todasLasEtiquetas();  // llamo y ejecuto al metodo que creé mas abajo
        //PanelContactos();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);    // el programa se cierra bien haciendo clic en la X de la ventana    
    }
    
    
    
    private void todosLosPaneles() {
        // creacion de un metodo para paneles
        //JPanel panelTitulo = new JPanel();    // creacion del panel llamado "panel"
        panel.setLayout(null);
        
        panel.setBackground(Color.DARK_GRAY);   // fondo gris oscuro
        this.getContentPane().add(panel);   // agrego el panel sobre la ventana
        
    }
    
    
    
    private void todasLasEtiquetas() {

        JLabel labelTitulo = new JLabel("AGENDA ELECTRÓNICA", SwingConstants.CENTER);
        
        JLabel labelDNI = new JLabel("DNI  : ");
        JLabel labelNombre = new JLabel("Nombre  : ");
        JLabel labelApellido = new JLabel("Apellido  : ");
        JLabel labelDireccion = new JLabel("Direccion  : ");
        JLabel labelTelefono = new JLabel("Telefono  : ");
        JLabel labelFechaNAC = new JLabel("Fecha Nac.  : ");
           
        
        JLabel[] listaDeLabels = {
            // lista de objetos del tipo JLabel
            labelDNI,
            labelNombre,
            labelApellido,
            labelDireccion,
            labelTelefono,
            labelFechaNAC
        };
        
        labelTitulo.setBounds(0, 0, 700, 65);
        labelTitulo.setFont(  new Font("Yu Gothic UI", 1 , 25 ) );
        labelTitulo.setForeground(Color.WHITE);      // cambio el color de la letra a blanco
        
        labelTitulo.setOpaque(true);         // permite poder cambiar el color del fondo
        labelTitulo.setBackground(Color.BLACK);  // cambio el color fondo negro
        
        
        
        int x = 55;
        int y = 120;
        
        for (  JLabel  item  :  listaDeLabels  ) {
            
            item.setBounds(x, y, 50, 20);
            item.setForeground(Color.white);
            item.setFont( new Font("Yu Gothic UI", 0 , 18 ) );
            item.setSize(110, 30);
            
            y += 60;
            
            if (item == labelApellido){
                // imprime la otra fila de etiquetas "apellido" -> "direccion"
                x = 335;
                y = 120;
            }
        }
        
        
        //labelRegistro.setBounds(0, 65, 700, 45);
        //labelRegistro.setOpaque(true);
        //labelRegistro.setBackground(Color.LIGHT_GRAY);
        //labelRegistro.setForeground(Color.black);
        //labelRegistro.setFont( new Font("Yu Gothic UI", 1, 20));
        
      
        
        panel.add(labelTitulo);   
        panel.add(labelDNI);    
        panel.add(labelNombre);    
        panel.add(labelApellido);    
        panel.add(labelDireccion);    
        panel.add(labelTelefono);    
        panel.add(labelFechaNAC);        
    }
    
    
    
    
    
    
    
    
    
    
    private void PanelContactos() {
        JPanel panelContactos = new JPanel();
        panelContactos.setLayout(null);
        panelContactos.setBounds(65, 65, 700, 65);
        
        panelContactos.setBackground(Color.green);   // fondo gris oscuro
        this.getContentPane().add(panelContactos);   // agrego el panel sobre la ventana
        
        
        JLabel registro = new JLabel("REGISTRO", SwingConstants.CENTER);
        registro.setBounds(0, 0, 700, 65);
        registro.setFont(  new Font("impact", 0 , 25 ) );
        registro.setForeground(Color.black);      // cambio el color de la letra a blanco
        
        registro.setOpaque(true);         // permite poder cambiar el color del fondo
        registro.setBackground(Color.white);  // cambio el color fondo negro
        
        
        panelContactos.add(registro); 
        
    }
    
}
