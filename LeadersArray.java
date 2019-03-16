//Leaders in an array
import java.io.*;
import java.util.*;

class LeadersArray
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
        calculateLeader(a,a.length);
    }
    public  static  void calculateLeader(int a[],int n)
    {
        int max=a[n-1];
        System.out.println(max);
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
                System.out.println(max);
            }
        }
    }
    
}