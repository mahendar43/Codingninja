//Check given both strings are anagrams or not!!

import java.io.*;
import java.util.*;
class Anagram
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s1=in.next();
String s2=in.next();
char a[]=s1.toCharArray();
char b[]=s2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
int j=0;
for(int i=0;i<a.length;i++)
{
if(a[i]!=b[i])
{
System.out.println("false");
j=1;
break;
}
}
if(j==0)
System.out.println("true");
}
}
