//Rearrange Odd and Even values in Alternate Fashion in Ascending Order

import java.io.*;
import java.util.*;
class Rearrange
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
    Arrays.sort(a);
    boolean check=true;
    int even[]=new int[n/2];
    int odd[]=new int[n/2];
        if(a[0]%2==0)
        {
        check=true;
        }
        else
        {
        check=false;
        }
        int j=0,k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even[j]=a[i];
                j++;
            }
            else
            {
                 odd[k]=a[i];
                 k++;
            }
        }

        if(check)
        {
            for(int i=0;i<n/2;i++)
            {
                System.out.println(even[i]);
                System.out.println(odd[i]);

            }
        }
        else
        {
            for(int i=0;i<n/2;i++)
            {
                System.out.println(odd[i]);
                System.out.println(even[i]);

            }
        }
        
    
}
}