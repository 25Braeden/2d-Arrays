> **Disclaimer** If you in my class and take my work thats not aloud
# Problem 1
```java
public class Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
# Problem 2
```java
public class Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i + j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
# Problem 3
```java
public class Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(j == i) {
                    arr[i][j] = j + 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
# Problem 4
> If you're in my class and taking my code, DO NOT copy paste this one. He gonna know I did some complex stuff.
```java
public class TriangleArray {

    public boolean testArray(int[][] x) {
        for (int i = 1; i < x.length; i++) {
            for (int j = 0; j < i; j++) {
                if (x[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TriangleArray triangleArray = new TriangleArray();
        int[][] arr = {
            {0, 171, 115, 141, 240},
            {171, 0, 103, 194, 333},
            {115, 103, 0, 120, 235},
            {141, 194, 120, 0, 104},
            {240, 333, 235, 104, 0}
        };
        int[][] arr2 = {
            {0, 1, 1, 1, 1},
            {0, 0, 1, 1, 1},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0}
        };

        boolean result1 = triangleArray.testArray(arr);
        boolean result2 = triangleArray.testArray(arr2);

        String print1 = (result1) ? "The first array is an upper triangular matrix." : "The first array is not an upper triangular matrix.";
        String print2 = (result2) ? "The second array is an upper triangular matrix." :  "The second array is not an upper triangular matrix.";
        System.out.printf("%s\n%s\n", print1, print2);
    }
}
```
# Problem 5
```java
int[][] distance = {
            {0, 171, 115, 141, 240},
            {171, 0, 103, 194, 333},
            {115, 103, 0, 120, 235},
            {141, 194, 120, 0, 104},
            {240, 333, 235, 104, 0}
        };
```
# Problem 6
```java
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
```