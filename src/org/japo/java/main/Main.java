/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double CAMBIO_EURO_DOLAR = 1.0921;
        System.out.printf(Locale.ENGLISH, "El cambio de hoy es 1€ por %3.3f$\n",
                CAMBIO_EURO_DOLAR);
//        System.out.println("$");
    }
    
}
