package onmu.kn;

public class PositiveNumberDeleter {
    public static int[][] deletePositiveNumbers(int[] array) {
        // Count the number of positive elements
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }

        // Create arrays to store non-positive and positive elements
        int[] nonPositiveNumbers = new int[array.length - count];
        int[] positiveNumbers = new int[count];
        int indexNonPositive = 0;
        int indexPositive = 0;

        // Copy non-positive and positive elements to the respective arrays
        for (int num : array) {
            if (num <= 0) {
                nonPositiveNumbers[indexNonPositive++] = num;
            } else {
                positiveNumbers[indexPositive++] = num;
            }
        }

        // Return the arrays containing non-positive and positive numbers
        return new int[][] {nonPositiveNumbers, positiveNumbers};
    }
}
