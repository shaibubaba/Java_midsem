import java.util.Scanner;

public class ohmslaw{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ohms law ");
        System.out.println("chose the parameter to calculate(V for 
        voltage,I for Current, R for resistance): ) ");
        String choice = scanner.next().toUpperCase();
        double voltage,current,resistance;
        switch (choice){
            case "V":
            System.out.print("Enter current (I) in Amperes: ");
            current = scanner.nextDouble();
            System.out.print("Enter resistance (R)in ohms:");
            resistance = scanner.nextDouble();
            voltage = current*resistance;
            System.out.print("Voltage (v) ="+ voltage +"v");
            break;

            case "I":
            System.out.print("Enter voltage(V) in volts: ");
            voltage = scanner.nextDouble();
            System.out.print("Enter resistance (R) in ohms: ");
            resistance = scanner.nextDouble();
            if(resistance != 0){
                current = voltage/resistance;
                System.out.println( "Current(I) = "+ current + "A");
            }else{
                System.out.println("Error: resistance cannot be zero.");
        }break;
        
        case "R":
        System.out.print( "Enter voltage(V) in volts: ");
        voltage = scanner.nextDouble();
        System.out.print("Enter current(I) in Amperes: ");
        current = scanner.nextDouble();
        if( current != 0){
            resistance =  voltage/current;
            System.out.print("Resistance (R) ="+ resistance +"ohms");
        }else{
            System.out.print("Error: current cannot be zero");
        }break;
        default:
        System.out.print("Invalid choice. Please enter V, I, or R");
        }
        scanner.close();
    }
    
}