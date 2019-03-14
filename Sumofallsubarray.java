// Sum of all sub arrays in an array (efficient O(n))

// formula (n-i)+(i-1)

//https://www.geeksforgeeks.org/sum-of-all-subarrays/

import java.io.*;
import java.util.*;
    
class Sumofallsubarray{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int result=0;

        for(int i=0;i<n;i++)
        {
            result+=a[i]*(n-i)*(i+1);
        }
        System.out.println(result);
    }
}