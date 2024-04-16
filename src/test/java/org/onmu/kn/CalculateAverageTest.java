package org.onmu.kn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CalculateAverageTest {

    @Test
    public void testCalculateAverage() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        double[] expected = {2.0, 5.0};
        double[] actual = ArrayCalculator.calculateAverage(array1, array2);

        assertArrayEquals(expected, actual, 0.0001);
    }
}

