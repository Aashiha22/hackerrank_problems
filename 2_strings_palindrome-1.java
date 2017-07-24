import java.io.*;
import java.util.*;

class main
{
    public static boolean check_palindrome(String a, String b)
    {
        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        a = String.valueOf(s1);
        b = String.valueOf(s2);
        if(a.equals(b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        boolean a = check_palindrome("abcd","dcba");
        System.out.println(a);
    }
}
