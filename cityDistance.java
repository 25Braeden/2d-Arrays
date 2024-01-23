import java.util.Scanner;

public class cityDistance {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 171, 115, 141, 240},
                {171, 0, 103, 194, 333},
                {115, 103, 0, 120, 235},
                {141, 194, 120, 0, 104},
                {240, 333, 235, 104, 0}
        };

        System.out.println("To determine the mileage between cities, enter the numbers of two cities from the following list:");
        System.out.print("1: Albany\n2: Boston\n3: Hartford\n4: NY\n5: Phila\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city number: ");
        int city1 = scanner.nextInt();

        System.out.print("Enter the second city number: ");
        int city2 = scanner.nextInt();

        int distance = arr[city1 - 1][city2 - 1];
        System.out.println("The distance between selected cities is: " + distance);

        scanner.close();
    }
}
