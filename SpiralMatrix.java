//Print a given matrix in spiral form

//Print numbers in matrix diagonal pattern

import java.io.*;
import java.util.*;

class SpiralMatrix
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows and columns::");
        int rows=in.nextInt();
        int columns=in.nextInt();

        int a[][]=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                a[i][j]=in.nextInt();
            }   
        }
        Calculate(a,rows,columns);
    }
    public static void Calculate(int a[][],int m,int n)
    {   
        int k = 0, l = 0; 
        while (k < m && l < n) 
        { 
            // Print the first row from the remaining rows 
            for (int i = l; i < n; ++i) 
            { 
                System.out.print(a[k][i]+" "); 
            } 
            k++; 
   
            // Print the last column from the remaining columns  
            for (int i = k; i < m; ++i) 
            { 
                System.out.print(a[i][n-1]+" "); 
            } 
            n--; 
   
            // Print the last row from the remaining rows */ 
            if ( k < m) 
            { 
                for (int i = n-1; i >= l; --i) 
                { 
                    System.out.print(a[m-1][i]+" "); 
                } 
                m--; 
            } 
   
            // Print the first column from the remaining columns */ 
            if (l < n) 
            { 
                for (int i = m-1; i >= k; --i) 
                { 
                    System.out.print(a[i][l]+" "); 
                } 
                l++;     
            }         
        } 
    }
}