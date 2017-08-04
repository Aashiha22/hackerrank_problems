//Sort stack - using 3 stack --> when unlimited stacks allowed

import java.io.*;
import java.util.*;
 
class stack_sort
{
    public static Stack<Integer> s1 = new Stack<Integer>();
    public static Stack<Integer> sort()
    {
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        while(s1.isEmpty() != true)
        {
            int a = findmin(s2);
            s3.push(a);
        }
        return s3;
    }
    public static int findmin(Stack<Integer> s2)
    {
        int min = Integer.MAX_VALUE;
        while(s1.isEmpty() != true)
        {
            int b = s1.pop();
            if(b<min)
            {
                min = b;
            }
            s2.push(b);
        }
        while(s2.isEmpty() != true)
        {
            int c = s2.pop();
            if(c != min)
            {
                s1.push(c);
            }
        }
        return min;
    }
    public static void main(String args[])
    {
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(2);
        s1.push(0);
        s1.push(-2);
        s1.push(6);
        Stack<Integer> s3 = sort();
        System.out.println(s3);
    }
    
}
