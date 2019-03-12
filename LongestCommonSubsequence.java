// Longest common subsequence!!

import java.io.*;
import java.util.*;

class LongestCommonSubsequence
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int count=LCS(s1,s2,0,0);
        System.out.print(count);
    }
    static int LCS(String s1,String s2,int i,int j)
    {
        if(i==s1.length() || j==s2.length())
        {
            return 0;
        }
        else if(s1.charAt(i)==s2.charAt(j))
        {
            return 1+LCS(s1,s2,i+1,j+1);
        }
        else
        {
            return Math.max(LCS(s1,s2,i+1,j),LCS(s1,s2,i,j+1));
        }
    }
}
