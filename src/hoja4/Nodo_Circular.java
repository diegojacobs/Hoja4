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
public class Nodo_Circular<t> extends Nodo_Doble{
    protected Boolean esCabeza;
    
    public Nodo_Circular()
    {
        num = null;
        anterior = null;
        siguiente = null;
        esCabeza = false;
    }
    
    public Nodo_Circular(t dato)
    {
        num = dato;
        anterior = null;
        siguiente = null;
        esCabeza = false;
    }
    
    public Nodo_Circular(t dato, Nodo next)
    {
        num = dato;
        anterior = null;
        siguiente = next;
        esCabeza = false;
    }
    
    public Nodo_Circular(t dato, Nodo_Doble previous, Nodo_Doble next)
    {
        num = dato;
        anterior = previous;
        siguiente = next;
        esCabeza = false;
    }
    public Nodo_Circular(t dato, Nodo_Doble previous, Nodo_Doble next, boolean ec)
    {
        num = dato;
        anterior = previous;
        siguiente = next;
        esCabeza = ec;
    }
    public void setCabeza(boolean ec)
    {
        esCabeza = ec;
    }
    public boolean getCabeza()
    {
        return esCabeza;
    }
}
