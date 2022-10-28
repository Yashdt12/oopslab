public abstract class Worker{
    String name;
    double salaryRate;
    public Worker(){
        this.name=null;
        this.salaryRate=0.0;
    }
    public Worker(String name,double salaryRate){
        this.name=name;
        this.salaryRate=salaryRate;
    }
    public String getName(){
        return name;
    }
    public double getSalaryRate(){
        return salaryRate;
    }
    abstract double computePay();
}