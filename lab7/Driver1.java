class Driver1{
    public static void main(String[] args){
        Employee e1=new Employee("Yash",100.00);
        System.out.println(e1.toString());
        Employee e2=new Manager("Kashish",1000.00,"Sales");
        System.out.println(e2.toString());
    }
}