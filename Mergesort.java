import java.io.*;
import java.util.*;

class Mergesort
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
    Merge(a,0,n);
  }
  public static void Merge(int org[],int low,int high)
  {
    int N = high - low;
    if (N <= 1)
        return;
    int mid=low+N/2;
    Merge(org,low,mid);
    Merge(org,mid,high);
    int temp[]=new int[N];
    int i=low,j=mid;
    for(int k=0;k<N;k++)
    {
      if(i==mid)
      {
        temp[k]=org[j++];
      }
      else if(j==high)
      temp[k]=org[i++];
      else if(org[i]>org[j])
      {
        temp[k]=org[j++];
      }
      else
      {
        temp[k]=org[i++];
      }
    }
    for(int p=0;p<N;p++)
    System.out.println(temp[p]);
  }
}
