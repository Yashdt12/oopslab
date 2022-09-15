class Add
{
    int a,b,sum;
    void setValue(int value1,int value2)
    {
        a=value1;
        b=value2;
    }
    void add()
    {
        sum=a+b;
    }
    void show()
    {
        System.out.println("Sum of "+a+" and "+b+" is: "+sum);
    }
    public static void main(String args[])
    {
        Add obj=new Add();
        obj.setValue(5,10);
        obj.add();
        obj.show();
    }
}