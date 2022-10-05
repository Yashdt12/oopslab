import java.lang.Math;
class Car
{
    private int year;
    private String make;
    private double speed;
    Car(){}
    Car(int year,String make,double speed)
    {
        this.year=year;
        this.make=make;
        this.speed=speed;
    }
    public int getYear()
    {
        return year;
    }
    public String getMake()
    {
        return make;
    }
    public double getSpeed()
    {
        return speed;
    }
    public void accelerate()
    {
        speed+=1;
    }
    public void accelerate(int increment)
    {
        speed+=increment;
    }
    public void brake(int b)
    {
        speed-=Math.sqrt(b);
    }
}
class RaceTrack
{
    public static void main(String args[])
    {
        Car car=new Car(2000,"Tata",50.0);
        System.out.println("The year of manufacture, manufacturer and speed of car is: "+car.getYear()+", "+car.getMake()+" and "+car.getSpeed());
        car.accelerate();
        System.out.println("The car's speed after accelerating is: "+car.getSpeed());
        car.accelerate(10);
        System.out.println("The car's speed after accelerating again is: "+car.getSpeed());
        car.brake(4);
        System.out.println("The car's speed after braking is: "+car.getSpeed());
        Car car2=new Car();
        System.out.println("The year of manufacture, manufacturer and speed of 2nd car is: "+car2.getYear()+", "+car2.getMake()+" and "+car2.getSpeed());
    }
}