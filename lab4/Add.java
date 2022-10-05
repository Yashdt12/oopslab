import java.io.*;
class Add
{
    int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
    int sum;
    void getValue() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter 10 numbers: ");
        n1=Integer.parseInt(br.readLine());
        n2=Integer.parseInt(br.readLine());
        n3=Integer.parseInt(br.readLine());
        n4=Integer.parseInt(br.readLine());
        n5=Integer.parseInt(br.readLine());
        n6=Integer.parseInt(br.readLine());
        n7=Integer.parseInt(br.readLine());
        n8=Integer.parseInt(br.readLine());
        n9=Integer.parseInt(br.readLine());
        n10=Integer.parseInt(br.readLine());
    }
    void add()
    {
        sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
    }
    void show()
    {
        System.out.println("Sum of 10 numbers is: "+sum);
    }
    public static void main(String args[]) throws IOException
    {
        Add obj=new Add();
        obj.getValue();
        obj.add();
        obj.show();
    }
}