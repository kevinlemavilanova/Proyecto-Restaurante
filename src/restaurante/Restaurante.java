/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author christian
 */
public class Restaurante extends Application {
    private JFrame ventanaPrincipal;
private JDialog ventanaSecundaria;

    @Override
    public void start(Stage primaryStage) {
        
        new Intro().setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		new Restaurante();
	}
	
	public Restaurante()
	{
		// Construcción de ventana principal
		ventanaPrincipal = new JFrame("Ventana principal");
		JButton boton = new JButton("Abre secundaria");
		ventanaPrincipal.getContentPane().add(boton);
		ventanaPrincipal.pack();
		
		// Construcción de ventana secundaria
		ventanaSecundaria = new JDialog(ventanaPrincipal,"Ventana secundaria");
		JLabel etiqueta = new JLabel("Hola");
		ventanaSecundaria.getContentPane().add(etiqueta);
		ventanaSecundaria.pack();

		// Hacer que el botón abra la ventana secundaria y cierre la
		// principal
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaPrincipal.setVisible(false);
				ventanaSecundaria.setVisible(true);
			}

                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
		
		});
		
		// Hacer que al cerrarse la secundaria con la x de arriba a la
		// derecha, se muestre la primaria
		ventanaSecundaria.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				ventanaPrincipal.setVisible(true);
				ventanaSecundaria.setVisible(false);
			}
		
			public void windowClosed(WindowEvent e) {
				ventanaPrincipal.setVisible(true);
				ventanaSecundaria.setVisible(false);
			}
		});
		
		// Mostrar la ventana principal
		ventanaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventanaPrincipal.setVisible(true);
	}
    
}
