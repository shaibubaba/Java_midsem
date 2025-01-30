import java.util.Scanner;

public class Converter {
    private double GHC, usd, euro, yen, km, m, miles;
    private int hours, minutes, seconds;

    private final Scanner scanner = new Scanner(System.in);

    // Currency conversion methods
    public void dollarToGh() {
        System.out.print("Enter amount in Dollars: ");
        usd = scanner.nextDouble();
        System.out.println( usd +" USD is equal to " + (usd * 15.13) + " GHC");
    }

    public void ghToDollar() {
        System.out.print("Enter amount in GHC: ");
        GHC = scanner.nextDouble();
        System.out.println( GHC +" GHC is equal to " + (GHC / 15.13) + " USD");
    }

    public void euroToGh() {
        System.out.print("Enter amount in Euros: ");
        euro = scanner.nextDouble();
        System.out.println( euro +" EUR is equal to " + (euro * 15.76) + " GHC");
    }

    public void ghToEuro() {
        System.out.print("Enter amount in GHC: ");
        GHC = scanner.nextDouble();
        System.out.println( GHC +" GHC is equal to " + (GHC / 15.76) + " EURO");
    }

    public void yenToGh() {
        System.out.print("Enter amount in Yen: ");
        yen = scanner.nextDouble();
        System.out.println( yen +" YEN is equal to " + (yen * 0.097) + " GHC");
    }

    public void ghToYen() {
        System.out.print("Enter amount in GHC: ");
        GHC = scanner.nextDouble();
        System.out.println( GHC +" USD is equal to " + (GHC / 0.097) + " GHC");
    }

    // Distance conversion methods
    public void meterToKm() {
        System.out.print("Enter distance in meters: ");
        m = scanner.nextDouble();
        System.out.println(m + " Meter(s) is equal to " + (m / 1000) + " Kilometer(s).");
    }                                //m + " Meter(s) is equal to " + (m / 1000) + " Kilometer(s)."

    public void kmToMeter() {
        System.out.print("Enter distance in kilometers: ");
        km = scanner.nextDouble();
        System.out.println(km + " Kilometer(s) is equal to " + (km * 1000) + " Meter(s).");
    }             //km + " Kilometer(s) is equal to " + (km * 1000) + " Meter(s)."

    public void milesToKm() {
        System.out.print("Enter distance in miles: ");
        miles = scanner.nextDouble();
        System.out.println(miles + " Miles is equal to " + (miles * 1.60934) + " Kilometers.");
    }        //miles + " Miles is equal to " + (miles * 1.60934) + " Kilometers."

    public void kmToMiles() {
        System.out.print("Enter distance in kilometers: ");
        km = scanner.nextDouble();
        System.out.println(km + " Kilometer(s) is equal to " + (km * 0.621371) + " Miles.");
    }             //km + " Kilometer(s) is equal to " + (km * 0.621371) + " Miles."

    // Time conversion methods
    public void hoursToMinutes() {
        System.out.print("Enter hours: ");
        hours = scanner.nextInt();
        minutes = hours * 60;
        System.out.println(hours + " hours is equal to " + minutes + " minutes.");
    }

    public void hoursToSeconds() {
        System.out.print("Enter hours: ");
        hours = scanner.nextInt();
        seconds = hours * 3600;
        System.out.println(hours + " hour(s) is equal to " + seconds + " seconds.");
    }

    public void minutesToHours() {
        System.out.print("Enter minutes: ");
        minutes = scanner.nextInt();
        hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println("Time: " + hours + " hour(s) and " + minutes + " minutes.");
    }

    public void secondsToHours() {
        System.out.print("Enter seconds: ");
        seconds = scanner.nextInt();
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;
        System.out.println("Time: " + hours + " hour(s): " + minutes + " minute(s): " + seconds + " seconds");
    }

    // Main method
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n=== Conversion Menu ===");
            System.out.println("1. Dollar to GHC");
            System.out.println("2. GHC to Dollar");
            System.out.println("3. Euro to GHC");
            System.out.println("4. GHC to Euro");
            System.out.println("5. Yen to GHC");
            System.out.println("6. GHC to Yen");
            System.out.println("7. Meters to Kilometers");
            System.out.println("8. Kilometers to Meters");
            System.out.println("9. Miles to Kilometers");
            System.out.println("10. Kilometers to Miles");
            System.out.println("11. Hours to Minutes");
            System.out.println("12. Hours to Seconds");
            System.out.println("13. Minutes to Hours");
            System.out.println("14. Seconds to Hours");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> converter.dollarToGh();
                case 2 -> converter.ghToDollar();
                case 3 -> converter.euroToGh();
                case 4 -> converter.ghToEuro();
                case 5 -> converter.yenToGh();
                case 6 -> converter.ghToYen();
                case 7 -> converter.meterToKm();
                case 8 -> converter.kmToMeter();
                case 9 -> converter.milesToKm();
                case 10 -> converter.kmToMiles();
                case 11 -> converter.hoursToMinutes();
                case 12 -> converter.hoursToSeconds();
                case 13 -> converter.minutesToHours();
                case 14 -> converter.secondsToHours();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
