class Fibonacci
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int a=0,b=1,c;
        double sum=1,average;
        System.out.print("The first "+n+" Fibonacci numbers are:\n"+a+" "+b+" ");
        for(int i=1;i<20;i++)
        {
            c=a+b;
            sum+=c;
            System.out.print(""+c+" ");
            a=b;
            b=c;
        }
        average=sum/n;
        System.out.println("\nThe average is "+average);
    }
}