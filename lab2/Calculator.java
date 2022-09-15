import java.util.Scanner;
class Calculator
{
    double a,b;
    void getValue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
    }
    void sum()
    {
        System.out.println("Sum is: "+(a+b));
    }
    void difference()
    {
        System.out.println("Difference is: "+(a-b));
    }
    void product()
    {
        System.out.println("Product is: "+(a*b));
    }
    void division()
    {
        System.out.println("Division is: "+(a/b));
    }
    public static void main(String args[])
    {
        Calculator obj=new Calculator();
        obj.getValue();
        obj.sum();
        obj.difference();
        obj.product();
        obj.division();
    }
}