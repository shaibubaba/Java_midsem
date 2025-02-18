import java.util.Scanner;

public class reversearrray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the number of elements in the array: ");
     int size =scanner.nextInt();
     int[] array = new int[size];
     System.out.println("Enter " + size +" elements");
     for(int i = 0; i < size; i++){
        array[i] = scanner.nextInt();    }
        System.out.println("Reversed array: ");
        for(int i= size - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
    
}
