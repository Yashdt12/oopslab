import java.util.Scanner;
class Item
{
    private String itemName;
    private String itemidNo;
    private int itemQuantity;
    private double itemPrice;
    Item(String itemName,String itemidNo,int itemQuantity,double itemPrice)
    {
        this.itemName=itemName;
        this.itemidNo=itemidNo;
        this.itemQuantity=itemQuantity;
        this.itemPrice=itemPrice;
    }
    Item(String itemName,String itemidNo,int itemQuantity)
    {
        this.itemName=itemName;
        this.itemidNo=itemidNo;
        this.itemQuantity=itemQuantity;
        itemPrice=500.0;
    }
    Item(String itemName,String itemidNo)
    {
        this.itemName=itemName;
        this.itemidNo=itemidNo;
        itemQuantity=1;
        itemPrice=500.0; 
    }
    public String getItemName()
    {
        return itemName; 
    }
    public String getItemidNo()
    {
        return itemidNo;
    }
    public int getItemQuantity()
    {
        return itemQuantity;
    }
    public double getItemPrice()
    {
        return itemPrice;
    }
    public void setItemName(String itemName)
    {
        this.itemName=itemName;
    }
    public void setItemidNo(String itemidNo)
    {
        this.itemidNo=itemidNo;
    }
    public void setItemQuantity(int itemQuantity)
    {
        this.itemQuantity=itemQuantity;
    }
    public void setItemPrice(double itemPrice)
    {
        this.itemPrice=itemPrice;
    }
}
class Customer
{
    private String name;
    private String idNo;
    private double balance;
    private Item item;
    Customer(String name,String idNo,double balance)
    {
        this.name=name;
        this.idNo=idNo;
        this.balance=balance;
    }
    Customer(String name,String idNo)
    {
        this.name=name;
        this.idNo=idNo;
        balance=5000.0;
    }
    public String getName()
    {
        return name;
    }
    public String getIdNo()
    {
        return idNo;
    }
    public double balance()
    {
        return balance;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setIdNo(String idNo)
    {
        this.idNo=idNo;
    }
    public void print()
    {
        System.out.println("Item purchased: "+item.getItemName());
        System.out.println("Item id number: "+item.getItemidNo());
        System.out.println("Number of items purchased: "+item.getItemQuantity());
        System.out.println("Price of item purchased: "+item.getItemPrice());
        System.out.println("Balance after purchasing item: "+balance);
    }
    public void buyItem(Item item)
    {
        if(balance >= item.getItemPrice()*item.getItemQuantity() && item.getItemQuantity() >= 1)
        {
            balance=balance-item.getItemPrice()*item.getItemQuantity();
            this.item=item;
            this.print();
        }
        else if(balance < item.getItemPrice()*item.getItemQuantity())
            System.out.println("Insufficient Balance");
        else
            System.out.println("Order is not valid");
    }
}
class TestStore
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name, ID number and Balance: ");
        String name=sc.next();
        String idNo=sc.next();
        double balance=sc.nextDouble();
        Customer c=new Customer(name,idNo,balance);
        System.out.println("Enter Item Name, Item ID number, Item quantity and Item price for 1st item: ");
        String itemName=sc.next();
        String itemIdNo=sc.next();
        int itemQuantity=sc.nextInt();
        double itemPrice=sc.nextDouble();
        Item i1=new Item(itemName,itemIdNo,itemQuantity,itemPrice);
        c.buyItem(i1);
        System.out.println("Enter Item Name, Item ID number, Item quantity and Item price for 2nd item: ");
        itemName=sc.next();
        itemIdNo=sc.next();
        itemQuantity=sc.nextInt();
        itemPrice=sc.nextDouble();
        Item i2=new Item(itemName,itemIdNo,itemQuantity,itemPrice);
        c.buyItem(i2);
    }
}