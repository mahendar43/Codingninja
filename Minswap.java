import java.io.*;
import java.util.*;
class Minswap
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s1=in.next();
char a[]=s1.toCharArray();
int count=0;
for(int i=1;i<a.length;i++)
{
if(a[i]=='}')
{
if(a[i-1]!='{')
count++;
}
}
System.out.println(count);
}
}
