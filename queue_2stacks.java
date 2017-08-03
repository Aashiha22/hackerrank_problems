//Implement a queue using 2 stacks-new approach

import java.io.*;
import java.util.*;
 
class stack_queue
{
    public static Stack<Integer> os = new Stack<Integer>();
    public static Stack<Integer> ns = new Stack<Integer>();
    
    public static void push(int value)
    {
        //always push to new list ns
        ns.push(value);
    }
    
    public static int pop()
    {
        if(os.isEmpty() == true)
        {
            while(ns.isEmpty() != true)
            {
                os.push(ns.pop());
            }
        }
        return os.pop();
    }
    
    public static void main(String args[])
    {
        System.out.println("Hi");
        //original stack order : 4,3,2,1 expected queue behaviour : 1,2,3,4
        push(1);
        System.out.println("2 stacks  :  "+ns+"  "+os);
        push(2);
        push(3);
        push(4);
        System.out.println("2 stacks  :  "+ns+"  "+os);
        int a = pop();
        System.out.println("2 stacks  :  "+ns+"  "+os);
        System.out.println(a);
        push(5);
        System.out.println("2 stacks  :  "+ns+"  "+os);
        push(6);
        System.out.println("2 stacks  :  "+ns+"  "+os);
        int b = pop();
        System.out.println("2 stacks  :  "+ns+"  "+os);
        System.out.println(b);
        int c = pop();
        System.out.println(c);
        int d = pop();
        System.out.println(d);
        int e = pop();
        System.out.println(e);
        int f = pop();
        System.out.println(f);
    }
}
