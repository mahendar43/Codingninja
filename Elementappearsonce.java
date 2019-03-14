// Find the element that appears once in a sorted array
  
  import java.io.*;
  import java.util.*;

 class Elementappearsonce  
{ 
    public static void search(int[] arr, int low, int high) 
    { 
        if(low > high) 
            return; 
        if(low == high) 
        { 
            System.out.println("The required element is::"+arr[low]); 
            return; 
        } 
        int mid = (low + high)/2; 
        if(mid % 2 == 0) 
        { 
            if(arr[mid] == arr[mid+1]) 
                search(arr, mid+2, high); 
            else
                search(arr, low, mid); 
        } 
        else if(mid % 2 == 1) 
        { 
            if(arr[mid] == arr[mid-1]) 
                search(arr, mid+1, high); 
            else
                search(arr, low, mid-1); 
        } 
    } 
  
    public static void main(String[] args)  
    { 
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        
        search(arr, 0, arr.length-1); 
    }     
}