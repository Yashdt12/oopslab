import java.util.Scanner;
class Add{
	public int a,b,sum;
	public void getValue()
	{
		System.out.print("Enter two numbers: ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void add()
	{
		sum=a+b;
	}
	public void show()
	{
		System.out.println("Sum is: "+(a+b));
	}
}
class Display
{
	public static void main(String args[]){
		Add obj=new Add();
		obj.getValue();
		obj.add();
		obj.show();
	}
}
