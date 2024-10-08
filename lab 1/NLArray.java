public class NLArray {

    // Method to extract and print the boundaries of the array
    public void extractBoundaries(int arr[][]) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        int rows = arr.length;
        int cols = arr[0].length;

        // Print first row
        System.out.print("First row: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();

        // Print first column
        System.out.print("First column: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();

        // Print last row
        System.out.print("Last row: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[rows - 1][j] + " ");
        }
        System.out.println();

        // Print last column
        System.out.print("Last column: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(arr[i][cols - 1] + " ");
        }
        System.out.println();
    }

    // Method to extract and print the center part of the array
    public void cropCenterPart(int arr[][]) {
        if (arr == null || arr.length <= 2 || arr[0].length <= 2) {
            System.out.println("Array is too small to have a center part.");
            return;
        }

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Center part:");

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        NLArray nLArray = new NLArray();
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        nLArray.extractBoundaries(array);
        System.out.println();
        nLArray.cropCenterPart(array);
    }
}
