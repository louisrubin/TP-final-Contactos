/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP_final;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author louis-rubin
 */
public class Menu extends JFrame {
    
    JPanel menuPanel = new JPanel();
    
    public Menu() {
        
        // este método crea la ventana y los paneles
        setSize(700,500);   //  un tamaño al programa
        setTitle("Menu Principal");
        
        setResizable(false);    // no se puede agrandar el tamaño del programas
        setLocationRelativeTo(null);    // el programa aparece en el centro de la pantalla
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    private void todosLosPaneles() {
        // creacion de un metodo para paneles  
        menuPanel.setLayout(null);
        
        menuPanel.setBackground(Color.DARK_GRAY);   // fondo gris oscuro
        this.getContentPane().add(menuPanel);   // agrego el panel sobre la ventana
        
    }
}
