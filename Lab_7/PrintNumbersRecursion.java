// import java.util.Scanner;

// public class PrintNumbersRecursion {

//     // Function to print numbers in ascending order
//     public static void printAscending(int n) {
//         if (n == 0) {
//             return;
//         }
//         printAscending(n - 1); // Recursive call to go down
//         System.out.print(n + " "); // Print after the recursive call
//     }

//     // Function to print numbers in descending order
//     public static void printDescending(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.print(n + " "); // Print before the recursive call
//         printDescending(n - 1); // Recursive call to go down
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number N: ");
//         int N = sc.nextInt();

//         System.out.print("Numbers in ascending order: ");
//         printAscending(N);

//         System.out.println(); // For new line

//         System.out.print("Numbers in descending order: ");
//         printDescending(N);
//     }
// }


import java.util.Scanner;

public class PrintNumbersRecursion {

    // Function to print numbers from 1 to N in ascending order
    public static void printAscending(int n) {
        if (n > 0) {
            printAscending(n - 1); // Recursive call
            System.out.print(n + " "); // Print current number after the recursive call
        }
    }

    // Function to print numbers from 1 to N in descending order
    public static void printDescending(int n) {
        if (n > 0) {
            System.out.print(n + " "); // Print current number before the recursive call
            printDescending(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        System.out.println("Numbers from 1 to " + N + " in ascending order:");
        printAscending(N);
        
        System.out.println("\nNumbers from 1 to " + N + " in descending order:");
        printDescending(N);
        
        scanner.close();
    }
}