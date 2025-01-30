
import java.util.Scanner;
public class questionTwoSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Consumer No.: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int prevMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currMonthReading = scanner.nextInt();

        // Calculate units consumed
        int unitsConsumed = currMonthReading - prevMonthReading;
        double billAmount = 0.0;

        // Validate readings
        if (unitsConsumed < 0) {
            System.out.println("Error: Current month reading cannot be less than previous month reading.");
            return;
        }

        // Compute bill based on commercial tariff
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 2.0;
        } else if (unitsConsumed <= 200) {
            billAmount = (100 * 2.0) + ((unitsConsumed - 100) * 4.50);
        } else if (unitsConsumed <= 500) {
            billAmount = (100 * 2.0) + (100 * 4.50) + ((unitsConsumed - 200) * 6.0);
        } else {
            billAmount = (100 * 2.0) + (100 * 4.50) + (300 * 6.0) + ((unitsConsumed - 500) * 7.0);
        }

        // Display the bill
        System.out.println("\nElectricity Bill (Commercial):");
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevMonthReading);
        System.out.println("Current Month Reading: " + currMonthReading);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Gh. " + billAmount);

        scanner.close();
    }
}
