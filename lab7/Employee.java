public class Employee{
    private String name;
    private double salary;
    public Employee(){
        this.name=null;
        this.salary=0.0;
    }
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String toString(){
        return name+" "+salary;
    }
}