package onmu.kn;

public class PositiveNumberDeleter {
    public static int[] deletePositiveNumbers(int[] array) {
        // Count the number of positive elements
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        // Create a new array with size equal to the count of non-positive elements
        int[] result = new int[array.length - count];
        int index = 0;

        // Copy non-positive elements to the result array
        for (int num : array) {
            if (num <= 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
