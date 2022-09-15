import java.util.Scanner;
class Average
{
    private float a,b,average;
    public void getValue()
	{
		System.out.print("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
	}
    public void average()
    {
        average=(a+b)/2;
    }
    public void show()
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