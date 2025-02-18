import java.util.Scanner;
public class speedofmotor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input voltage (V): ");
        double voltage = scanner.nextDouble();
        
        System.out.print("Enter the back EMF (V): ");
        double backemf =scanner.nextDouble();

        System.out.print("Enter the motor constant (V/rpm): ");
        double motorconstant = scanner.nextDouble();
        if (motorconstant <= 0){
            System.out.println("Error: Motor constant must be greater than zero to avoid division by zero.");
        }else if (voltage < backemf){
            System.out.println("Error: input voltage cannot be less than back EMF. ");

        }else{
            double speed =(voltage - backemf)/motorconstant;
            System.out.println("The motor speed is: " + speed + " RPM");
        }
        scanner.close();

    }
}
