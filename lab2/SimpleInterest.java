import java.util.Scanner;
class SimpleInterest
{
    double principal,rate,time,interest;
    void getValue()
    {
        System.out.print("Enter principal,rate of interest and time: ");
        Scanner sc=new Scanner(System.in);
        principal=sc.nextDouble();
        rate=sc.nextDouble();
        time=sc.nextDouble();
    }
    void calcinterest()
    {
        interest=(principal*rate*time)/100;
    }
    void show()
    {
        System.out.println("Interest is: "+interest);
    }
    public static void main(String args[])
    {
        SimpleInterest obj=new SimpleInterest();
        obj.getValue();
        obj.calcinterest();
        obj.show();
    }
}