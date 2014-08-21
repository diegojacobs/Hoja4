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
        Listas<String> _lista = null;
        Nodo<String>[] list;
        
        ListasFactory Factory = new ListasFactory();
        //list = new Nodo<Integer>(8);
        Scanner _in  = new Scanner(System.in);
        
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        
        System.out.print("Elija entre listas y Stack: \n");
        System.out.print("1. Lista\n");
        System.out.print("2. Stack\n");
        System.out.print("Número de opción: \n");
        opcion = _in.nextInt();
        
            switch (opcion){
                case 1:
                {
                    System.out.print("1. Simple\n");
                    System.out.print("2. Doble\n");
                    System.out.print("3. Circular\n");
                    System.out.print("Número de opción: \n");
                    opcion2 = _in.nextInt();
                    
                    while (opcion3!= 4){
                        System.out.print("1. Leer\n");
                        System.out.print("2. Mostrar\n");
                        System.out.print("3. Calcular\n");
                        System.out.print("4. Salir\n");
                        System.out.print("Número de opción: \n");
                        opcion3 = _in.nextInt();
            
                        Listas _list = Factory.getClass(opcion2);
                        switch(opcion3)
                        {
                            case 1:
                                LeerArchivo entrada = new LeerArchivo();
                                Evaluar check = new Evaluar();
                                String expr;
                                expr = entrada.postfix();
        
                                for (int i=1;i<=expr.length();i++)
                                {
                                    String car;
                                    car = expr.substring(i-1, i);
                                    _list.Agregar(car);    
                                }
                    
                            case 2:
                                System.out.print(_lista.toString());
                                System.out.print("\n");
                                break;    
                            case 3:
                                
                                int num, num2;
                                Evaluar check2 = new Evaluar();
                                expr = _list.toString();
                                
                                for (int i=expr.length();i==1;i++)
                                {
                                    String car;
                                    car = expr.substring(i-1, i);
                                    if ("resta".equals(check2.operacion(car)))
                                    {
                                        num=Integer.parseInt(expr.substring(i-2, i-1));
                                        num2=Integer.parseInt(expr.substring(i-3, i-2));
                                        num=num2-num;
                                        _list.Eliminar(i);
                                        _list.Eliminar(i-1);
                                        _list.Eliminar(i-2);
                                        _list.Agregar(num);
                                    }
                                    if ("suma".equals(check2.operacion(car)))
                                    {
                                        num=Integer.parseInt(expr.substring(i-2, i-1));
                                        num2=Integer.parseInt(expr.substring(i-3, i-2));
                                        num=num2+num;
                                        _list.Eliminar(i);
                                        _list.Eliminar(i-1);
                                        _list.Eliminar(i-2);
                                        _list.Agregar(num);
                                    }
                                    if ("por".equals(check2.operacion(car)))
                                    {
                                        num=Integer.parseInt(expr.substring(i-2, i-1));
                                        num2=Integer.parseInt(expr.substring(i-3, i-2));
                                        num=num2*num;
                                        _list.Eliminar(i);
                                        _list.Eliminar(i-1);
                                        _list.Eliminar(i-2);
                                        _list.Agregar(num);
                                    }
                                    if ("dividir".equals(check2.operacion(car)))
                                    {
                                        num=Integer.parseInt(expr.substring(i-2, i-1));
                                        num2=Integer.parseInt(expr.substring(i-3, i-2));
                                        num=num2/num;
                                        _list.Eliminar(i);
                                        _list.Eliminar(i-1);
                                        _list.Eliminar(i-2);
                                        _list.Agregar(num);
                                    }
                                    expr = _list.toString();
                                }
                                num=0;
                                System.out.print("\nEl resultado es: ");
                                System.out.print(num);
                                break;
                        }
                    }
                }
                case 2:
                    myStack st = new myStack();
                    LeerArchivo entrada = new LeerArchivo();
                    Evaluar check = new Evaluar();
                    String expr;
                    int num, num2;
                    System.out.print("\nLa expresión es: ");
                    System.out.print(entrada.postfix());
        
                    expr = entrada.postfix();
        
                    for (int i=1;i<=expr.length();i++)
                    {
                        String car;
                        car = expr.substring(i-1, i);
                        if("num".equals(check.operacion(car))) 
                        {
                            num = Integer.parseInt(car);
                            st.push(num);
                        }
                        if ("resta".equals(check.operacion(car)))
                        {
                            num=st.pop();
                            num2=st.pop();
                            num=num2-num;
                            st.push(num);
                        }
                        if ("suma".equals(check.operacion(car)))
                        {
                            num=st.pop();
                            num2=st.pop();
                            num=num+num2;
                            st.push(num);
                        }
                        if ("por".equals(check.operacion(car)))
                        {
                            num=st.pop();
                            num2=st.pop();
                            num=num*num2;
                            st.push(num);
                        }
                        if ("dividir".equals(check.operacion(car)))
                        {
                            num=st.pop();
                            num2=st.pop();
                            num=num2/num;
                            st.push(num);
                        }
                    }
                    num=st.pop();
                    System.out.print("\nEl resultado es: ");
                    System.out.print(num);
                    break;
            }
    }
}
