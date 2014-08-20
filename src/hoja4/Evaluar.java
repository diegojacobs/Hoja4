/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja4;

/**
 *
 * @author Diego Jacobs
 */
public class Evaluar {
    public String operacion(String op)
    {
        if ("+".equals(op))
            return "suma";
        if ("-".equals(op))
            return "resta";
        if ("*".equals(op))
            return "por";
        if ("/".equals(op))
           return "dividir";
        else 
            return "num";
    }
}
