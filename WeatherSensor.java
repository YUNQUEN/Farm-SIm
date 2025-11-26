import java.util.Scanner;

import java.util.ArrayList;
public class WeatherConditions implements Sensor 
{   
    Scanner input = new Scanner(System.in);
    
    ArrayList 
    @Override
    public String readWeatherCondition()
    {   
        System.out.println("What is the current weather condition: Sunny/Cloudy/rainy");
        String selection = input.nextLine();
        return selection;
    }
    
    @Override
    public double readMoistureLevel()
    {
        System.out.println("This sensor doesnt deal with moisture sensors.");
        return 0.0;
    }
    
    
    
    
    
    public boolean isValid(input)
    {
        
    }
}

