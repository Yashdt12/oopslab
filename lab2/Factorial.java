import java.util.Scanner;
class Factorial
{
    int n,factorial;
    void getValue()
    {
        factorial=1;
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
    }
    void calcFactorial()
    {
        for(int i=n;i>0;i--)
        {
            factorial*=i;
        }
    }
    void show()
    {
        System.out.println("Factorial of "+n+" is: "+factorial);
    }
    public static void main(String args[])
    {
        Factorial obj=new Factorial();
        obj.getValue();
        obj.calcFactorial();
        obj.show();
    }
}