
package TP_final;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Contactos extends JFrame {
    
    private String[][] vector = new String[9][6];   // tamaño del vector:  9 filas y 6 columnas
    private int indice = 0;
    
    public JTextField campoDNI = new JTextField();      // campos de texto GLOBALES para todas los métodos
    public JTextField campoNombre = new JTextField();
    public JTextField campoApellido = new JTextField();
    public JTextField campoDireccion = new JTextField();
    public JTextField campoTelefono = new JTextField();
    public JTextField campoFechaNac = new JTextField();
        
    public JTextField campoIndice = new JTextField(String.valueOf(indice) );
        
    
    public JTextField [] listaCamposTexto = {
        // lista de campos 
        campoDNI,
        campoNombre, 
        campoApellido, 
        campoDireccion, 
        campoTelefono, 
        campoFechaNac,
        campoIndice
    };
    
    
    public JPanel panel = new JPanel();     // creacion del panel llamado "panel"
    
    
    public Contactos() {
        setSize(700,500);   //  un tamaño al programa
        setTitle("Agenda Trabajo Final");
        
        setResizable(false);    // no se puede agrandar el tamaño del programas
        setLocationRelativeTo(null);    // el programa aparece en el centro de la pantalla
        
        todosLosPaneles();
        todasLasEtiquetas();  // llamo y ejecuto al metodo que creé mas abajo
        todosLosBotones();
        todosLosTextFields();
        
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
              
        
        int x = 210;    // posición en horizontal
        int y = 320;    // posición en vertical
        
        for (JButton  item  :  listaBotones ){
            
            if( item == butonGrabar ){
                item.setBounds(  x,  y, 100, 50);
                x += 120;
            } 
            else {
                item.setBounds(  x,  y, 60, 50);
                x += 80;
            }
            
            panel.add(item);    // en cada vuelta del FOR se agrega esa boton al JPanel
           
        }
        
        
        
        ActionListener accionGrabar = new ActionListener() {
            // al hacer clic en "grabar" ejecuta todo este programa que guarda los datos en el vector
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    int colum = 0;
                    for (JTextField  item   :  listaCamposTexto ) {
                      
                        if ( item != campoIndice ){
                            // si es diferente a "campoIndice" hace lo siguiente, si es igual no hace nada
                            vector[indice][colum] =  item.getText();
                            colum ++;
                        }
                    }
                    
                    for( int column = 0; column <= 5; column++){
                        System.out.println(" DATOS ENCONTRADOS: ");
                        System.out.println(  vector[indice][column]  );
                    }
            }
        };
        
        butonGrabar.addActionListener(accionGrabar);    // accion al hacer clic en el boton "grabar"
        
        
        
        
        
    }
    
    
    
    private void todosLosTextFields() {
        // campos para ingresar texto
        
    
        int x = 150;    // posición en horizontal
        int y = 125;    // posición en vertical
        int ancho = 170;
        int alto = 25;
        
        for ( JTextField   item   :  listaCamposTexto  ){
            
            if (  item  == campoDireccion ){
                x = 455;
                y = 125;
            }
            
            if ( item == campoIndice) {
                x = 325;
                y = 400;
                ancho = 30;
                alto = 30;
                
                item.setFont( new Font ("arial", 1, 25) );
            }
            
            item.setBounds(  x,   y,  ancho, alto);
            
            y += 60;
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
        
        labelTitulo.setBounds(0, 20, 700, 65);
        labelTitulo.setFont(  new Font("Yu Gothic UI", 1 , 25 ) );
        labelTitulo.setForeground(Color.WHITE);      // cambio el color de la letra a blanco
        
        labelTitulo.setOpaque(true);         // permite poder cambiar el color del fondo
        labelTitulo.setBackground(Color.GRAY);  // cambio el color fondo negro
        
        
        
        int x = 55;     // posición en horizontal
        int y = 120;    // posición en vertical
        int ancho = 50;
        int alto = 20;
        
        for (  JLabel  item  :  listaDeLabels  ) {
            
            if (item == labelIndice ) {
                x = 240;
                y = 400;
            }
            
            
            if (item == labelDireccion){
                // imprime la otra fila de etiquetas "apellido" -> "direccion"
                x = 345;
                y = 120;
            }
            
            
            item.setBounds(  x,   y, ancho, alto);
            item.setForeground(Color.white);
            item.setFont( new Font("Yu Gothic UI", 0 , 18 ) );
            item.setSize(110, 30);
            
            
            panel.add(labelTitulo);
            panel.add(item);    // en cada vuelta del FOR se agrega esa estiqueta al JPanel
            
            y += 60;
        }
        
    }
    
    
    
}
