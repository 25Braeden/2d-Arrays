public class GenerateArray {

    public static void main(String[] args) {
        int size = 5;
        int[][] arr = generateArray(size);

        // Print the generated array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateArray(int size) {
        int[][] arr = new int[size][size];
        int[] values = {0, 171, 115, 141, 240, 103, 194, 120, 235, 104};

        // Fill in the values for the upper triangular part
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                arr[i][j] = getCellValue(values, i, j);
            }
        }

        // Mirror the values to the lower triangular part
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = arr[j][i];
            }
        }

        return arr;
    }

    public static int getCellValue(int[] values, int i, int j) {
        int index = i * (2 * values.length - i - 1) / 2 + j - i - 1;
        return values[index];
    }
}
