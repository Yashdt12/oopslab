public class HourlyWorker extends Worker{
    private int hoursWorked;
    public HourlyWorker(){
        super();
        hoursWorked=0;
    }
    public HourlyWorker(String name,int hoursWorked){
        super(name,50.0);
        if(hoursWorked<=60){
            this.hoursWorked=hoursWorked;
        }
        else{
            System.out.println("Number of hours for Hourly worker cannot exceed 240");
            System.exit(0);
        }
    }
    double computePay(){
        return (salaryRate*hoursWorked);
    }
}