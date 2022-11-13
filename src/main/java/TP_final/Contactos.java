
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
    
    public int cantidadAlumnos = 10;
    public int cantidadColumns = 6;
    public String[][] vector = new String[cantidadAlumnos][cantidadColumns];   // tamaño del vector:  9 filas y 6 columnas
    public int indice = 0;     // indice inicial
    
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
    
    public JLabel labelGuardado = new JLabel();     // label de "Datos Guardados" en formato GLOBAL
    
    
    public JPanel panel = new JPanel();     // creacion del panel llamado "panel"
    
    
    public Contactos() {
        // este método crea la ventana y los paneles
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
    
    
    private void MostrarTodosLosDatos(){
        // este método busca y muestra los datos almacenados en el vector
        
       
        int colum = 0;
        for ( JTextField   item   :  listaCamposTexto  ) {
                      
            if ( item != campoIndice ){
                // si es diferente a "campoIndice" hace lo siguiente, si es igual no hace nada
                item.setText( vector[indice][colum] );
                colum ++;
            }
        }
        
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
        
        
        /* 
                ACCIONES DE LOS BOTONES
        */
        
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
                    
                    System.out.println("STORED DATA: ");
                    for( int column = 0; column < 6; column++){
                        System.out.println(  vector[indice][column]  );
                    }
                    
                    labelGuardado.setText("datos guardados");
            }
        };
        
        
        ActionListener accionAtras = new ActionListener() {
            // accion del boton ATRAS
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if ( indice > 0 ){
                    indice--;
                    campoIndice.setText(  String.valueOf(indice)  );
                    MostrarTodosLosDatos();
                    labelGuardado.setText("");
                }
            }
            
        };
        
        
        
        ActionListener accionSiguiente = new ActionListener() {
            // accion del boton ATRAS
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if ( indice < cantidadAlumnos -1 ){
                    indice++;
                    campoIndice.setText(  String.valueOf(indice)  );
                    MostrarTodosLosDatos();
                    labelGuardado.setText("");
                }
            }
            
        };
        
        
        butonAtras.addActionListener(accionAtras);
        butonGrabar.addActionListener(accionGrabar);    // accion al hacer clic en el boton "grabar"
        butonSiguiente.addActionListener(accionSiguiente);
        
        
        
        
        
    }
    
    
    
    private void todosLosTextFields() {
        // campos para ingresar texto
        
    
        int x = 150;    // posición en horizontal
        int y = 125;    // posición en vertical
        int ancho = 170;
        int alto = 25;
        
        int yo = 1;
        
        for ( JTextField   item   :  listaCamposTexto  ){
            // este FOR coloca todos los campos de textos en la ventana
            
            if ( item == campoIndice) {
                x = 325;
                y = 400;
                ancho = 30;
                alto = 30;
                
                item.setFont( new Font ("arial", 1, 22) );
                item.setEditable(false);
                item.setHorizontalAlignment(SwingConstants.CENTER);
            }
            
            item.setBounds(  x,   y,  ancho, alto);
            
            panel.add(item);
            
            
            if ( yo % 2 == 0 ) {
                /* si es PAR
                vueltas para colocar los INPUTS correctamente:
                                                                 dni - nombre
                                                                 apellido - direccion
                */
                x = 150;
                y += 60;
                
            // si es impar:
            } else {
                x = 455;
            }
            
            yo ++;     // vueltas + 1
        }
        
          
    }
    
    private void todasLasEtiquetas() {

        JLabel labelTitulo = new JLabel("Registro de Alumnos", SwingConstants.CENTER);
        
        JLabel labelDNI = new JLabel("DNI  : ");
        JLabel labelNombre = new JLabel("Nombre  : ");
        JLabel labelApellido = new JLabel("Apellido  : ");
        JLabel labelDireccion = new JLabel("Dirección  : ");
        JLabel labelTelefono = new JLabel("Teléfono  : ");
        JLabel labelFechaNAC = new JLabel("Fecha Nac.  : ");
        
        JLabel labelIndice = new JLabel ("Índice  : ");
           
        
        JLabel[] listaDeLabels = {
            // lista de objetos del tipo JLabel
            labelDNI,
            labelNombre,
            labelApellido,
            labelDireccion,
            labelTelefono,
            labelFechaNAC,
            labelGuardado,
            labelIndice
        };
        
        labelTitulo.setBounds(0, 20, 700, 65);
        labelTitulo.setFont(  new Font("Yu Gothic UI", 1 , 25 ) );
        labelTitulo.setForeground(Color.WHITE);      // cambio el color de la letra a blanco
        
        labelTitulo.setOpaque(true);         // permite poder cambiar el color del fondo
        labelTitulo.setBackground(Color.GRAY);  // cambio el color fondo negro
        
        
        
        int x = 55;     // posición en horizontal
        int y = 120;    // posición en vertical
        int yo = 1;
        
        for (  JLabel  item  :  listaDeLabels  ) {
            int ancho = 110;
            int alto = 30;
            Color colorSeleccionado = Color.white;      // color de letra default
            
            if ( item == labelGuardado ) {
                x = 275; 
                y = 280;
                ancho = 450;
                colorSeleccionado = Color.GREEN;
            }
            
            if ( item == labelIndice ) {
                x = 240;
                y = 400;
            }
            
            
            item.setBounds(  x,   y, ancho, alto);
            item.setForeground( colorSeleccionado);
            item.setFont( new Font("Yu Gothic UI", 0 , 18 ) );
            
            
            panel.add(labelTitulo);
            panel.add(item);    // en cada vuelta del FOR se agrega esa estiqueta al JPanel
            
            
            if ( yo % 2 == 0 ) {
                /* si es PAR
                vueltas para colocar los LABELS correctamente:
                                                                 dni - nombre
                                                                 apellido - direccion
                */
                x = 55;
                y += 60;
                
            // si es impar:
            } else {
                x = 345;
            }
            
            yo ++;
        }
        
    }
    
    
    
}
