/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Diego Jacobs
 */
public class LeerArchivo {
    public String postfix () {
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("postfix.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                return (strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
         return "";
    }
}
