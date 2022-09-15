class Factorial
{
    int n,factorial;
    void setValue(int value)
    {
        factorial=1;
        n=value;
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
        obj.setValue(5);
        obj.calcFactorial();
        obj.show();
    }
}