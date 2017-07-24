import java.io.*;
import java.util.*;
import java.util.Arrays;
class main
{
    public static int getCharNum(char c)
    {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int c1 = Character.getNumericValue(c);
        if(c1>=a || c1<=z)
        {
            return c1-a;
        }
        else
        {
            return -1;
        }
    }
    public static int toggle(int bitvector, int index)
    {
        int mask = 1<<index;
        if((bitvector & mask) == 0)
        {
            bitvector |= mask;    //set the bit
        }
        else //unset the bit
        {
            bitvector &= (~mask);
        }
        return bitvector;
    }
    public static boolean check_1_digit(int bitvector)
    {
        return (bitvector & (bitvector-1))==0;
    }
    public static boolean check_permutation_palindrome(String a)
    {
        int bitvector = 0;
        char[] ch = a.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int x = getCharNum(ch[i]);
            bitvector = toggle(bitvector,x);
        }
        if(bitvector == 0 || check_1_digit(bitvector))
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
        boolean a = check_permutation_palindrome("abcdabcdeff");
        System.out.println(a);
    }
}
