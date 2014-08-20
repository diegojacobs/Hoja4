/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package hoja4;
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 *
 * @author Diego Jacobs
 */
public class Hoja4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Listas<Integer> _lista = null;
        Nodo<Integer>[] list;
        ListasFactory Factory = new ListasFactory();
        //list = new Nodo<Integer>(8);
        Scanner _in  = new Scanner(System.in);
        
        int opcion =0;
        
        
        System.out.print("Tipo de Lista que desea trabajar: \n");
        System.out.print("1. Simple\n");
        System.out.print("2. Doble\n");
        System.out.print("3. Circular\n");
        opcion = _in.nextInt();
        Listas _list = Factory.getClass(opcion);
        
        while (opcion!= 4){
            System.out.print("1. Agregar\n");
            System.out.print("2. Mostrar\n");
            System.out.print("3. Ordenar lista\n");
            System.out.print("4. Salir\n");
            opcion = _in.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.print("Ingrese un numero: ");
                    int num =_in.nextInt();
                    _lista.Agregar(num);
                    break;
                case 2:
                    System.out.print(_lista.toString());
                    System.out.print("\n");
                    break;    
                case 3:
                    Sorting.selectionSort(_list);
                    Sorting.insertionSort(_list);
                    System.out.print("La lista se ha ordenado.");
                    System.out.print("\n");
                    break;
            }
        }
    }
}
