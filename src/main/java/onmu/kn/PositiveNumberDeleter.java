package onmu.kn;

public class PositiveNumberDeleter {
    public static int[] deletePositiveNumbers(int[] array) {
        int number = 0;
        for (int num : array) {
            if (num > 0) {
                number++;
            }
        }

        int[] resultat = new int[array.length - number];
        int index = 0; // Початковий ��ндекс результуючого м
        for (int num : array) {
            if (num <= 0) {
                resultat[index++] = num;
            }
        }

        return resultat;
    }
}
