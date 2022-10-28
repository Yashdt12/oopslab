public class FullTimeWorker extends Worker{
    private int hoursWorked;
    public FullTimeWorker(){
        super();
        hoursWorked=0;
    }
    public FullTimeWorker(String name,int hoursWorked){
        super(name,100.0);
        if(hoursWorked<=240){
            this.hoursWorked=hoursWorked;
        }
        else{
            System.out.println("Number of hours for Full time worker cannot exceed 240");
            System.exit(0);
        }
    }
    double computePay(){
        return (salaryRate*hoursWorked);
    }
}