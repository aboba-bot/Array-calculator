package onmu.kn;

public class PositiveNumberDeleter {
    public static int[][] deletePositiveNumbers(int[] array) {
        // Підрахувати кількість позитивних елементів
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            } }
        // Створення масивів для зберігання не додатних і додатних елементів
        int[] nonPositiveNumbers = new int[array.length - count];
        int[] positiveNumbers = new int[count];
        int indexNonPositive = 0;
        int indexPositive = 0;
        // Копіювати непозитивні та позитивні елементи у відповідні масиви
        for (int num : array) {
            if (num <= 0) {
                nonPositiveNumbers[indexNonPositive++] = num;
            } else {
                positiveNumbers[indexPositive++] = num;
            } }
        // Повертає масиви, що містять недодатні та додатні числа
        return new int[][] {nonPositiveNumbers, positiveNumbers};
    }
}
