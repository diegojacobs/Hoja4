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
public class Lista_Simple<t> extends Listas {
    
    Nodo_Simple Cabeza;
    Nodo_Simple NodoActual;
    
    public void Lista_Simple()
    {
        NodoActual = Cabeza;
    }
    
    @Override
    public void Agregar(Object valor)
    {
        Nodo_Simple<t> _newNodo = new Nodo_Simple(valor);

        if (Cabeza == null)
        {
            Cabeza = _newNodo;
            NodoActual = Cabeza;
        }
        else
        {
            NodoActual.setSiguiente(_newNodo);
            NodoActual = _newNodo;
        
        }
    }
    
    @Override
    public Nodo Eliminar(Object valor)
    {
         Nodo_Simple<t> _newNodo; 
         
         if (NodoActual.getSiguiente().equals(valor))
         { 
            if (NodoActual == Cabeza)
            {
                _newNodo = (Nodo_Simple<t>) Cabeza;
                Cabeza.setSiguiente(NodoActual.getSiguiente());
            }
            else
            {
                _newNodo = (Nodo_Simple<t>) NodoActual.getSiguiente();
                NodoActual.setSiguiente(NodoActual.getSiguiente().getSiguiente());
                return _newNodo;
            }
         }
         else
             return null;
        return null;
    }
    
    @Override
    public String toString()
    {
        Nodo_Simple Inicio = Cabeza;
        String strLista = "";
        StringBuilder _sb = new    StringBuilder();
    
        if (Inicio != null)
        {        
            while (Inicio != null)
            {
                _sb.append(Inicio.getNum());
                _sb.append("  -> ");            
                Inicio = (Nodo_Simple) Inicio.getSiguiente();
            }
        }
    
        _sb.append(" null");
    
        return _sb.toString();
    }
}
