import java.util.Scanner;
import java.util.ArrayList;


public class readWeatherCondition implements Sensor
{
    
    Scanner input = new Scanner(System.in);
    
    @Override
    public String readWeatherCondition(String input)
    {
        ArrayList<String> weatherConditions = new ArrayList<String>();
        
        weatherConditions.add("Rainy");
        weatherConditions.add("Cloudy");
        weatherConditions.add("Sunny");
        weatherConditions.add("Humid");

        
        if (weatherConditions.contains(input)){
            return input;
            
        }
        else
        {
            System.out.println("Please enter one of the displayed options\n");
            do
            {
                input.nextLine();
            }
        }
    }

    @Override
    public double readMoistureLevel()
    {
        System.out.println("This sensor doesnt deal with soil.");
        return 0.0;
    }

    
}
