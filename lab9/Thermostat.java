class InvalidInitialTemperatureException extends Exception{
    private int temp;
    InvalidInitialTemperatureException(int temp){
        this.temp=temp;
    }
    public String toString(){
        return "InvalidInitialTemperatureException : "+this.temp;
    }
}
class HighTemperatureException extends Exception{
    HighTemperatureException(){

    }
    public String toString(){
        return "\nHigh Temperature Exception : Cooling down\n";
    }
}
class LowTemperatureException extends Exception{
    LowTemperatureException(){

    }
    public String toString(){
        return"\nLow Temperature Exception : Heating\n";
    }
}
public class Thermostat{
    private int temperature;
    static final int LOWER_LIM=50;
    static final int UPPER_LIM=100;
    Thermostat(int initTemp) throws InvalidInitialTemperatureException{
        if(initTemp >= LOWER_LIM && initTemp <= UPPER_LIM){
            this.temperature=initTemp;
            System.out.println("Starting thermostat with inital temperature: "+temperature);
        }
        else{
            throw new InvalidInitialTemperatureException(initTemp);
        }
    }
    public void startThermostat() throws HighTemperatureException,InterruptedException{
        System.out.println("*****************Thermostat Started*************************");
        while(true){
            if(temperature<=UPPER_LIM){
                temperature++;
            }
            else{
                throw new HighTemperatureException();
            }
            Thread.sleep(1000);
        }
    }
    public void stopThermostat() throws LowTemperatureException,InterruptedException{
        System.out.println("*****************Thermostat Stopping*************************");
        while(true){
            if(temperature>=LOWER_LIM){
                temperature--;
            }
            else{
                throw new LowTemperatureException();
            }
            Thread.sleep(1000);
        }
    }
}
class ThermostatDriver{
    public static void main(String[] args) throws InvalidInitialTemperatureException{
        Thermostat t=new Thermostat(55);
        while(true)
        {
            try{
                try{
                    t.startThermostat();
                }catch(HighTemperatureException e){
                    System.out.println(e);
                }
                try{
                    t.stopThermostat();
                }catch(LowTemperatureException e){
                    System.out.println(e);
                }
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}