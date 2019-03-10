//Separate the Numbers

import java.io.*;
import java.util.*;
class SeparateNumber
{
public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    String s1=in.next();
    String n=Calculate(s1,s1.length());
    System.out.println(n);    
    }

    public static String Calculate(String s,int len)
    {
        if(s.charAt(0)=='0')
        {
            return "NO";
        }
        for (int i = 1; i * 2 <= len; i++) 
        {
			long temp = Long.parseLong(s.substring(0, i));
			StringBuilder temp2 = new StringBuilder();
			long num = temp;
            while (temp2.length() < s.length()) 
            {
				   temp2.append(num);
				   num++;
			}
                 if (temp2.toString().equals(s))
             {
                     return "YES";
			 }
	     }
          return "NO";
    }
        
    }
