import java.util.Scanner;
class Average
{
    double a,b,average;
    void getValue()
	{
		System.out.print("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
	}
    void average()
    {
        average=(a+b)/2;
    }
    void show()
    {
        System.out.println("Average is: "+average);
    }
    public static void main(String args[])
    {
        Average obj=new Average();
        obj.getValue();
        obj.average();
        obj.show();
    }
}