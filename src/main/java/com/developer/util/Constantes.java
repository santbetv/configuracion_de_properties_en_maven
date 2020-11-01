/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rizzoli
 */
public class Constantes {

    public static String RUTA_RECURSOS = "";

    static {

        try {
            Properties properties = new Properties();

            properties.load(new FileReader("./src/main/java/config.properties"));

            RUTA_RECURSOS = properties.get("RUTA_RECURSOS").toString();
            //System.out.println(properties.get("RUTA_RECURSOS"));

        } catch (IOException ex) {
            Logger.getLogger(Constantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
