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
public abstract class Listas<t>  
{
    Nodo Cabeza;
    Nodo NodoActual;
    
    public void Lista()
    {
        NodoActual = Cabeza;
    }
    
    abstract public void Agregar(t valor);

    abstract public Nodo Eliminar(t valor);
    
    @Override
    public String toString()
    {
        Nodo Inicio = Cabeza;
        String strLista = "";
        StringBuilder _sb = new    StringBuilder();
    
        if (Inicio != null)
        {        
            while (Inicio != null)
            {
                _sb.append(Inicio.getNum());
                _sb.append("  -> ");            
                Inicio = Inicio.getSiguiente();
            }
        }
    
        _sb.append(" null");
    
        return _sb.toString();
    }
}
