import java.util.Scanner;

public class sumof2D {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of colums: ");
        int cols = scanner.nextInt();
        
        int [][] array = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter the elements of array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                array[i][j] = scanner.nextInt();
                sum += array[i][j];
            }
        }
        System.out.println("The sum of all elements in the 2D array is: " + sum);
        scanner.close();

    }
}
