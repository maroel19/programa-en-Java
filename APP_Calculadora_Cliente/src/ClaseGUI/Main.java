/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseGUI;

import java.awt.Color;

/**
 *
 * @author ElJo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        interfazCalculadora objInterfazCalculadora = new interfazCalculadora();
        objInterfazCalculadora.setVisible(true);
        objInterfazCalculadora.setTitle("Calculadora Examen");
        
        objInterfazCalculadora.getContentPane().setBackground(Color.yellow);
        objInterfazCalculadora.setResizable(false);
    }
    
}
