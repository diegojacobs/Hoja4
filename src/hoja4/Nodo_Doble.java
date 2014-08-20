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
public class Nodo_Doble<t>extends Nodo_Simple {
    protected Nodo anterior;

    
    public Nodo_Doble()
    {
        num = null;
        anterior = null;
        siguiente = null;
    }
    
    public Nodo_Doble(t dato)
    {
        num = dato;
        anterior = null;
        siguiente = null;
    }
    
    public Nodo_Doble(t dato, Nodo next)
    {
        num = dato;
        anterior = null;
        siguiente = next;
    }
    
    public Nodo_Doble(t dato, Nodo_Doble previous, Nodo_Doble next)
    {
        num = dato;
        anterior = previous;
        siguiente = next;
    }
    
    
    public void setAnterior(Nodo previous)
    {
        this.anterior = previous;
    }
    
    public Nodo getAnterior()
    {
        return anterior;
    }
}