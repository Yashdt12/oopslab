class Average
{
    double a,b,avg;
    void setValue(double value1,double value2)
    {
        a=value1;
        b=value2;
    }
    void average()
    {
        avg=(a+b)/2;
    }
    void show()
    {
        System.out.println("Average of "+a+" and "+b+" is: "+avg);
    }
    public static void main(String args[])
    {
        Average obj=new Average();
        obj.setValue(10.5,10.9);
        obj.average();
        obj.show();      
    }
}