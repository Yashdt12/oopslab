public class Driver2{
    public static void main(String[] args){
        Worker w1=new FullTimeWorker("Ram",100);
        Worker w2=new HourlyWorker("Shyam",30);
        System.out.println("Pay of "+w1.getName()+" is: "+w1.computePay());
        System.out.println("Pay of "+w2.getName()+" is: "+w2.computePay());
    }
}