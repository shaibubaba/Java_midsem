

import java.util.Scanner;


class ElectricityBill {
   
    private int consumerNo;
    private String consumerName;
    private int prevMonthReading;
    private int currMonthReading;
    private String ebConnectionType; 

    
    public ElectricityBill(int consumerNo, String consumerName, int prevMonthReading, int currMonthReading, String ebConnectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.prevMonthReading = prevMonthReading;
        this.currMonthReading = currMonthReading;
        this.ebConnectionType = ebConnectionType;
    }

    
    public double calculateBillAmount() {
        
        int unitsConsumed = currMonthReading - prevMonthReading;
        double billAmount = 0.0;

        if (unitsConsumed < 0) {
            System.out.println("Error: Current month reading cannot be less than previous month reading.");
            return 0;
        }

        
        if (ebConnectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1.0;
            } else if (unitsConsumed <= 200) {
                billAmount = 100 * 1.0 + (unitsConsumed - 100) * 2.50;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 1.0 + 100 * 2.50 + (unitsConsumed - 200) * 4.0;
            } else {
                billAmount = 100 * 1.0 + 100 * 2.50 + 300 * 4.0 + (unitsConsumed - 500) * 6.0;
            }
        } else {
            System.out.println("Error: Unsupported connection type. Currently only 'domestic' is supported.");
        }

        return billAmount;
    }

    
    public void displayBill() {
        System.out.println("\nElectricity Bill:");
        System.out.println("Consumer No.: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + prevMonthReading);
        System.out.println("Current Month Reading: " + currMonthReading);
        System.out.println("Type of EB Connection: " + ebConnectionType);
        System.out.println("Bill Amount: Gh. " + calculateBillAmount());
    }
}


public class QuestionOneSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Consumer No.: ");
        int consumerNo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int prevMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currMonthReading = scanner.nextInt();

        System.out.print("Enter Type of EB Connection (domestic/commercial): ");
        String ebConnectionType = scanner.next();

        
        ElectricityBill bill = new ElectricityBill(consumerNo, consumerName, prevMonthReading, currMonthReading, ebConnectionType);

        
        bill.displayBill();

        
        scanner.close();
    }
}
