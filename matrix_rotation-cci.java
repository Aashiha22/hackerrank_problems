//Matrix rotation 90 degree clockwise
//O(n2) --> best solution --> rotate across rows
import java.io.*;
import java.util.*;

class main
{
    public static boolean matrix_rotation(int[][] matrix)
    {
        int n = matrix.length;
        if(n==0 || n != matrix[0].length)
        {
            return false;
        }
        else
        {
            for(int layer = 0;layer<n/2;layer++)
            {
                int first = layer;
                int last = n-layer-1;
                for(int i=first;i<last;i++)
                {
                    int offset = i-first;
                    int top = matrix[first][i]; 
                    matrix[first][i] = matrix[last-offset][first];//left->top
                    matrix[last-offset][first] = matrix[last][last-offset];//bottom->left
                    matrix[last][last-offset] = matrix[i][last];//right->bottom
                    matrix[i][last] = top;//top->right
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("");
        }
        return true;
    }
    public static void main(String args[])
    {
        int n=3, num = 1;
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = num++;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println("");
        }
        boolean res = matrix_rotation(matrix);
        System.out.println(res);
    }
}
