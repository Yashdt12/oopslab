import java.util.Scanner;
class TaxOnSalary
{
    private double salary;
    private boolean isPANsubmitted;
    TaxOnSalary()
    {
        this.isPANsubmitted=false;
        salary=0.0;
    }
    TaxOnSalary(boolean isPANsubmitted)
    {
        this.isPANsubmitted=isPANsubmitted;
        salary=1000.00;
    }
    public double getSalary()
    {
        return salary;
    }
    public boolean getIsPanSubmitted()
    {
        return isPANsubmitted;
    }
    public double calculateTax()
    {
        double tax=0.0;
        if(salary<180000 && isPANsubmitted)
            tax=0.0;
        else if(salary<180000 && (!isPANsubmitted))
            tax=0.05*salary;
        else if(salary<500000)
            tax=0.1*salary;
        else if(salary<1000000)
            tax=0.2*salary;
        else if(salary>1000000)
            tax=0.3*salary;
        return tax;
    }
    public void inputSalary()
    {
        System.out.println("Enter your salary: ");
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        this.salary=salary;
    }
}
class TestTax
{
    public static void main(String args[])
    {
        TaxOnSalary tax1=new TaxOnSalary();
        TaxOnSalary tax2=new TaxOnSalary(true);
        tax1.inputSalary();
        tax2.inputSalary();
        System.out.println("Taxes for respective entries are: "+tax1.calculateTax()+" and "+tax2.calculateTax());
    }
}