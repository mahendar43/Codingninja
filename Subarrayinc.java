import java.util.*;
import java.io.*;
// Longest increasing subarray::Mahendar

class Subarrayinc
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
        int maxsub=Calculatesubarray(a,n);
        System.out.println(maxsub);
    }
    public static int Calculatesubarray(int a[],int len)
    {
        int max=1,temp=1;

        for(int i=0;i<len-1;i++)
        {
            if(a[i]<a[i+1])
            {
                temp++;
            }
            else
            {
                if(max<temp)
                {
                    max=temp;
                }
                temp=1;
            }
        }
        return max;
    }
}