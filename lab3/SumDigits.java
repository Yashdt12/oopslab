class SumDigits
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]),d,sum=0;
        while(n>0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println("Sum of digits is = "+sum);
    }
}