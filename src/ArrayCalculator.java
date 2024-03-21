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
        System.out.println("5. Exit");

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
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please select a number from 1 to 5.");
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

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
