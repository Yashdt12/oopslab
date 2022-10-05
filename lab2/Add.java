import java.util.Scanner;
class Add
{
	int a,b,sum;
	void getValue()
	{
		System.out.print("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void add()
	{
		sum=a+b;
	}
	void show()
	{
		System.out.println("Sum is: "+(a+b));
	}
	public static void main(String args[])
	{
		Add obj=new Add();
		obj.getValue();
		obj.add();
		obj.show();
	}
}
