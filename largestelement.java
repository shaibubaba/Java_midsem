import java.util.Scanner;

public class largestelement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for(int i = 1; i < size; i++){
            if (array[i] > max ){
                max = array[i];
            }
        }
        System.out.println("The largest element in the array is: "+ max);
        scanner.close();
    }
}


