//Convert array into Zig-Zag fashion
import java.io.*;
import java.util.*;

class ArrayZigZag
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        boolean check=true;

        for(int i=0;i<n-1;i++)
        {   
            if(check)
            {
                if(a[i]>a[i+1])
                {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                }
            }
            else
            {
                if(a[i]<a[i+1])
                {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                }
            }
            check=!check;
            
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}