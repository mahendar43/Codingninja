//optimal strategy for game theory // recurive method ;; geeksforgeeks!!

import java.io.*;
import java.util.*;
class Winner
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

int profit=calculate(a,0,a.length-1);
System.out.println(profit);
}
public static int calculate(int a[],int i,int j)
{
  if(i==j)
  return a[i];
  if(i+1==j)
  return Math.max(a[i],a[j]);

  return Math.max(a[i]+Math.min(calculate(a,i+2,j),calculate(a,i+1,j-1)),a[j]+Math.min(calculate(a,i+1,j-1),calculate(a,i,j-2)));
}
}
