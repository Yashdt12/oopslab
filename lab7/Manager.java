public class Manager extends Employee{
    private String dept;
    public Manager(){
        super();
        dept=null;
    }
    public Manager(String name,double salary,String dept){
        super(name,salary);
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public String toString(){
        return super.toString()+" "+dept;
    }
}