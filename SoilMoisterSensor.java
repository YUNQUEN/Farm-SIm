import java.util.Scanner;

public class SoilMoisterSensor implements Sensor 
{
    @Override
    public double readMoistureLevel()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the moistureLevel please provide a decimal: ex: 0.1, 0.3 this are the same as 10% and 30% just in decimal form.");
        double moistureLevel = input.nextDouble();
        return moistureLevel;
    }
    
    public String readWeatherCondition()
    {
        System.out.println("This sensor does not deal weather information.")
        return "N/A";
    }
    
    
    
    public static void main(String[] arg)
    {
        SoilMoisterSensor sensor = new SoilMoisterSensor();
        System.out.println(sensor.readMoistureLevel());
    }   
}
