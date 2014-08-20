/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Jacobs
 */
package hoja4;

public class Lista_Doble<t> extends Listas{
  
    
    public void Lista_DoblementeEnlazada()
    {
        NodoActual = Cabeza;
    }
    
    @Override
    public void Agregar(Object valor)
    {
        Nodo_Doble<t> _newNodo = new Nodo_Doble(valor);

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
        Nodo_Doble<t> _newNodo; 
         
         if (NodoActual.getSiguiente().equals(valor))
         { 
            if (NodoActual == Cabeza)
            {
                _newNodo = (Nodo_Doble<t>) Cabeza;
                Cabeza.setSiguiente(NodoActual.getSiguiente());
            }
            else
            {
                _newNodo = (Nodo_Doble<t>) NodoActual.getSiguiente();
                NodoActual.setSiguiente(NodoActual.getSiguiente().getSiguiente());
                return _newNodo;
            }
         }
         else
             return null;
        return null;
    }
    
}
