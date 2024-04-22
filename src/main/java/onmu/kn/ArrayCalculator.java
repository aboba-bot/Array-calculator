package onmu.kn;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Array Calculator!");
        System.out.println("Please enter the length of the arrays:");
        int length = scanner.nextInt();

        int[] array1 = parseArrayInput(length, "first");
        int[] array2 = parseArrayInput(length, "second");

        System.out.println("Please choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Average");
        System.out.println("6. Sort");
        System.out.println("7. Find minimum number");
        System.out.println("8. Find maximum number");
        System.out.println("9. Calculation of the number of entered numbers");
        System.out.println("10. Deleting from an array of positive numbers");
        System.out.println("11. Exit");

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
                findMaximum(array1, array2);
                break;
            case 9:
                countNumbers(array1, array2);
                break;
            case 10:
                deletePositiveNumbersAndPrint(array1, array2);
                break;
            case 11:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please select a number from 1 to 10.");
        }
    }

    private static int[] parseArrayInput(int length, String ordinal) { //"Парсінг" вхідних даних
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the " + ordinal + " array separated by spaces:");
        int[] array = new int[length];
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        if (parts.length != length) {
            System.out.println("Invalid input length.");
            System.exit(1);
        }
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        return array;
    }
    private static void performAddition(int[] array1, int[] array2) { //Розрахунок суми введених чисел
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

    private static void performSubtraction(int[] array1, int[] array2) { //Операція віднімання елементів двох масивів
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

    private static void performMultiplication(int[] array1, int[] array2) { //Операція множення елементів двох масивів
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

    private static void performDivision(int[] array1, int[] array2) { //Операція ділення елементів двох масивів
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

    private static void calculateAverage(int[] array1, int[] array2) { //Розрахунок середнього арифметичного введених чисел
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

    private static void sortArray(int[] array1, int[] array2) { //Сортування масиву за зростанням та за спаданням
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sorting order ('asc' for ascending, 'desc' for descending):");
        String sortOrder = scanner.next();

        switch (sortOrder) {
            case "asc": //"ascending" (зростання)
                Arrays.sort(array1);
                Arrays.sort(array2);
                break;
            case "desc": //"descending" (спадання)
                Arrays.sort(array1);
                Arrays.sort(array2);
                reverseArray(array1);
                reverseArray(array2);
                break;
            default:
                System.out.println("Invalid sorting order. Please specify 'asc' for ascending or 'desc' for descending.");
                return;
        }

        System.out.println("Sorted arrays:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
            private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private static void findMinimum(int[] array1, int[] array2) { //Пошук найменшого числа
        int min1 = Arrays.stream(array1).min().getAsInt();
        int min2 = Arrays.stream(array2).min().getAsInt();

        System.out.println("Minimum number in array1: " + min1);
        System.out.println("Minimum number in array2: " + min2);
    }

    private static void findMaximum(int[] array1, int[] array2) { //Пошук найбільшого числа
        int max1 = Arrays.stream(array1).max().getAsInt();
        int max2 = Arrays.stream(array2).max().getAsInt();

        System.out.println("Maximum number in array1: " + max1);
        System.out.println("Maximum number in array2: " + max2);
    }

    private static void countNumbers(int[] array1, int[] array2) { //Розрахунок кількості введених чисел
        System.out.println("Number of elements in array1: " + array1.length);
        System.out.println("Number of elements in array2: " + array2.length);
    }

    private static void deletePositiveNumbersAndPrint(int[] array1, int[] array2) {
        // Викликаємо метод deletePositiveNumbers з класу PositiveNumberDeleter для обох масивів
        int[][] deletionResult1 = PositiveNumberDeleter.deletePositiveNumbers(array1);
        int[][] deletionResult2 = PositiveNumberDeleter.deletePositiveNumbers(array2);

        // Отримуємо оновлені масиви після видалення позитивних чисел
        array1 = deletionResult1[0];
        array2 = deletionResult2[0];

        // Отримуємо масиви позитивних чисел, які були видалені
        int[] positiveNumbers1 = deletionResult1[1];
        int[] positiveNumbers2 = deletionResult2[1];

        // Виводимо видалені числа на екран
        System.out.println("Positive numbers deleted from array 1: " + Arrays.toString(positiveNumbers1));
        System.out.println("Positive numbers deleted from array 2: " + Arrays.toString(positiveNumbers2));

        // Виводимо очищені масиви на екран
        System.out.println("Arrays after deleting positive numbers:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    private static void printArray(int[] array) { //Допоміжна функція виводить масив на екран
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
