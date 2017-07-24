import java.io.*;
import java.util.*;
import java.util.Arrays;
class main
{
    public static void replace_space(String a, int true_length)
    {
        int count = 0;
        char[] a_arr = a.toCharArray();
        for(int i=0;i<true_length;i++)
        {
            if(a_arr[i] == ' ')
            {
                count++;
            }
        }
        int index = true_length + (count*2);
        int index1 = index;
        if(true_length < a_arr.length)
        {
            a_arr[true_length] = '\0';
        }
        for(int j=true_length-1;j>=0;j--)
        {
            if(a_arr[j] == ' ')
            {
                a_arr[index-1] = '0';
                a_arr[index-2] = '2';
                a_arr[index-3] = '%';
                index = index -3;
            }
            else
            {
                a_arr[index-1] = a_arr[j];
                index--;
            }
        }
        String b = String.valueOf(a_arr);
        System.out.println(b);
    }
    public static void main(String args[])
    {
        replace_space("Mr John Smith    ", 13);
    }
}
