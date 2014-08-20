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
public class myStack {
    protected int sp;
    protected int[] stack;
    
    public myStack()
    {
        sp = -1;
        stack = new int[100];
    }
    public void push(int car)
    {
        if (sp<100)
        {
            sp++;
            stack[sp] = car;
        }
    }
    public int pop()
    {
        int car;
        car = stack[sp];
        sp--;
        return car;
    }
    public boolean empty()
    {
        return sp==-1;
    }
    public int top()
    {
        return stack[sp];
    }    
}
