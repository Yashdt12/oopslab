class Calculator
{
    double a=10,b=5;
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
        obj.sum();
        obj.difference();
        obj.product();
        obj.division();
    }
}