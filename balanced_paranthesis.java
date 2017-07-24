import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) 
    {
        if(expression.length() == 0)
        {
            return true;
        }
        char[] ch_array = expression.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<expression.length();i++)
        {
            if(ch_array[i] == '{' || ch_array[i] == '(' || ch_array[i] == '[')
            {
                st.push(new Character(ch_array[i]));
            }
            else if(ch_array[i] == '}' || ch_array[i] == ')' || ch_array[i] == ']')
            {
                char ch1 = ' ';
                if(st.isEmpty() != true)
                {
                    ch1 = (Character)st.pop();
                }
                else
                {
                    return false;
                }
                if(ch_array[i] == '}')
                {
                    if(ch1 != '{')
                    {
                        return false;
                    }
                }
                else if(ch_array[i] == ')')
                {
                    if(ch1 != '(')
                    {
                        return false;
                    }
                }
                else if(ch_array[i] == ']')
                {
                    if(ch1 != '[')
                    {
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty() != true)
        {
            return false;
        }
        return true;
    }
  
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
