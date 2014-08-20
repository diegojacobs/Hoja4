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
public class ListasFactory<t> {
    
    public Listas<t> getClass(int tipoLista){
        switch(tipoLista){
            case 1:
                return new Lista_Simple<t>();
            case 2:
                return new Lista_Doble<t>();
            case 3:
                return new Lista_Circular<t>();
        }
        return null;
    }

}
