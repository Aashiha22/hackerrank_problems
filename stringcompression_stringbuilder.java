String compression - used stringbuilder-O(n) instead of (string concatenation O(n2))
import java.io.*;
import java.util.*;

class main
{
    public static String compression(String s)
    {
        char[] ch = s.toCharArray();
        StringBuilder res = new StringBuilder();
        res.append(ch[0]);
        int count = 1;
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i] == ch[i-1])
            {
                count++;
            }
            else
            {
                res.append(count);
                res.append(ch[i]);
                count = 1;
            }
        }
        res.append(count);
        String s1 = String.valueOf(res);
        return s1;
    }
    public static void main(String[] args)
    {
        String s = "aabbbccccccccaaadddd";
        String res = compression(s);
        System.out.println("Output : "+res);
    }
}
