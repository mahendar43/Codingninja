//Count all elements in the array which appears at least K times after their first occurrence

import java.io.*;
import java.util.*;
class Atleastktimes
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int k=in.nextInt();
int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    a[i]=in.nextInt();
    }

    HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
    
    for(int i=0;i<n;i++)
    {
        if(hmap.containsKey(a[i]))
        {
            hmap.put(a[i],hmap.get(a[i])+1);
        }
        else
        {
            hmap.put(a[i],1);
        }
    }
    int res=0;
    for (Map.Entry<Integer,Integer> entry : hmap.entrySet())  
    {

            if((entry.getValue()-1)>=k)
            {
                res++;
            }
    }
    System.out.println(res);
}
}