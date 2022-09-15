class SimpleInterest
{
    double principal,rate,time,interest;
    void setValue(double value1,double value2,double value3)
    {
        principal=value1;
        rate=value2;
        time=value3;
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
        obj.setValue(10000,10,2);
        obj.calcinterest();
        obj.show();
    }
}