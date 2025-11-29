import java.util.Scanner;

public class readMoistureLevel implements Sensor {
    
    Scanner input = new Scanner(System.in);
    
    @Override
    public double readMoistureLevel() {
        System.out.println("What is the current moisture level?:");
        double moisture = input.nextDouble();
        do{
            
            if (moisture < 0 || moisture > 100)
            {
                
                return moisture = input.nextDouble(); 
            }
            else
            {
                System.out.println("Please provide a real number over 0 and below 100.");
                moisture = input.nextDouble();
            }
        } while (false);
    }
}
