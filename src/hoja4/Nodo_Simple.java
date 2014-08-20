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
public class Nodo_Simple<t> extends Nodo implements Comparable {
    
    
    public Nodo_Simple()
    {
        num = null;
        siguiente = null;
    }
    public Nodo_Simple(t valor)
    {
        num = valor;
        siguiente = null;
    }
    public Nodo_Simple(t valor, Nodo next)
    {
	num = valor;
	siguiente = next;
    }
    
    @Override
    public void setNum(Object valor)
    {
        num = valor;
    }
    @Override
    public void setSiguiente(Nodo next)
    {
        this.siguiente = next;
    }
    @Override
    public Object getNum ()
    {
        return num;
    }
    @Override
    public Nodo getSiguiente()
    {
        return siguiente;
    }
    @Override
    public boolean equals(Object other)
    {
        return this.num == ((Nodo)other).getNum();
    }

    @Override
    public int compareTo(Object other)
    {
        /*int result;
        String otherValue = String.valueOf(((Nodo)other).getNum());
        result = String.valueOf(num).compareTo(otherValue);
        return result;*/
        return (((Comparable)other).compareTo(num));
    }
}