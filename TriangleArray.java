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
