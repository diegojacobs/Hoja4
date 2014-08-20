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
public abstract class Nodo<t>implements Comparable {
    protected t num;
    protected Nodo siguiente;
    
    public Nodo()
    {
        num = null;
        siguiente = null;
    }
    public Nodo(t valor)
    {
        num = valor;
        siguiente = null;
    }
    public Nodo(t valor, Nodo next)
    {
	num = valor;
	siguiente = next;
    }
    abstract public void setNum(t valor);
    
    abstract public void setSiguiente(Nodo next);
    
    abstract public t getNum ();
    
    abstract public Nodo getSiguiente();
    
    @Override
    abstract public boolean equals(Object other);
    /*{
        String prueba = String.valueOf(((Nodo)other).getNum());
        return (String.valueOf(num).equals(((Nodo)other).getNum()));
    }*/

    @Override
    abstract public int compareTo(Object other);
        /*int result;
        String otherValue = String.valueOf(((Nodo)other).getNum());
        result = String.valueOf(num).compareTo(otherValue);
        return result;*/
       // return (((Comparable)other).compareTo(num))

}

