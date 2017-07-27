//String compression - my method
//Input "aabcccccaaa"
//Output a2b1c5a3

import java.io.*;
import java.util.*;

class main
{
    public static String compression(String s)
    {
        char[] ch = s.toCharArray();
        String res = "";
        res = res + ch[0];
        int count = 1;
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i] == ch[i-1])
            {
                count++;
            }
            else
            {
                res = res + count;
                res = res + ch[i];
                count = 1;
            }
        }
        res = res + count;
        return res;
    }
    public static void main(String[] args)
    {
        String s = "aabcccccaaa";
        String res = compression(s);
        System.out.println("Output : "+res);
    }
}
