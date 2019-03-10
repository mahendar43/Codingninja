//Check whether XOR of all numbers in a given range is even or odd

class XorEvenOdd
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int end=in.nextInt();
        int odd=0;
        if(start%2==0)
        {
             odd=(end-start)/2;
        }
        else
        {
             odd=(end-start)/2;
            odd=odd+1;
        }
        if(odd%2!=0)
        System.out.println("ODD");
        else
        System.out.println("EVEN");
        
    }
}