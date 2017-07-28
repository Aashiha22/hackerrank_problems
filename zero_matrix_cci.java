//Zero matrix
//O(n2) --> method 3 --> mark row and column of same array
import java.io.*;
import java.util.*;

class main
{
    public static int[][] zero_matrix(int[][] matrix)
    {
        int n = matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //nullify row
        for(int i=0;i<n;i++)
        {
            if(matrix[i][0] == 0)
            {
                for(int j=1;j<n;j++)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        //nullify column
        for(int i=0;i<n;i++)
        {
            if(matrix[0][i] == 0)
            {
                for(int j=1;j<n;j++)
                {
                    matrix[j][i] = 0;
                }
            }
        }
        return matrix;
    }
    public static void main(String args[])
    {
        int n = 3, num = 1;
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = num++;
            }
        }
        matrix[2][2] = 0;
        matrix[1][1] = 0;
        System.out.println("Input");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
        matrix = zero_matrix(matrix);
        System.out.println("Output");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
