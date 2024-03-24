import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Array Calculator!");
        System.out.println("Please enter the length of the arrays:");
        int length = scanner.nextInt();

        int[] array1 = new int[length];
        int[] array2 = new int[length];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < length; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Please choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Average");
        System.out.println("6. Sort");
        System.out.println("7. Find minimum number");
        System.out.println("8. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performAddition(array1, array2);
                break;
            case 2:
                performSubtraction(array1, array2);
                break;
            case 3:
                performMultiplication(array1, array2);
                break;
            case 4:
                performDivision(array1, array2);
                break;
            case 5:
                calculateAverage(array1, array2);
                break;
            case 6:
                sortArray(array1, array2);
                break;
            case 7:
                findMinimum(array1, array2);
                break;
            case 8:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please select a number from 1 to 8.");
        }
    }

    private static void performAddition(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for addition.");
            return;
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        System.out.println("Result of addition:");
        printArray(result);
    }

    private static void performSubtraction(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for subtraction.");
            return;
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        System.out.println("Result of subtraction:");
        printArray(result);
    }

    private static void performMultiplication(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for multiplication.");
            return;
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }
        System.out.println("Result of multiplication:");
        printArray(result);
    }

    private static void performDivision(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for division.");
            return;
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                System.out.println("Error! Division by zero.");
                return;
            }
            result[i] = array1[i] / array2[i];
        }
        System.out.println("Result of division:");
        printArray(result);
    }

    private static void calculateAverage(int[] array1, int[] array2) {
        int sum1 = 0, sum2 = 0;
        for (int num : array1) {
            sum1 += num;
        }
        for (int num : array2) {
            sum2 += num;
        }
        double avg1 = (double) sum1 / array1.length;
        double avg2 = (double) sum2 / array2.length;
        System.out.println("Average of array1: " + avg1);
        System.out.println("Average of array2: " + avg2);
    }

    private static void sortArray(int[] array1, int[] array2) {
        Arrays.sort(array1);  // Use Arrays.sort for efficient sorting
        Arrays.sort(array2);

        System.out.println("Sorted arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    private static void findMinimum(int[] array1, int[] array2) {
        int min1 = Arrays.stream(array1).min().getAsInt();
        int min2 = Arrays.stream(array2).min().getAsInt();

        System.out.println("Minimum number in array1: " + min1);
        System.out.println("Minimum number in array2: " + min2);
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
