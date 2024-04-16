package org.onmu.kn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumTest {

    @Test
    public void testFindMinimum() {
        int[] array1 = {5, 3, 7, 1};
        int[] array2 = {8, 2, 6, 4};

        int expected = 1;
        int actual = ArrayCalculator.findMinimum(array1, array2);

        assertEquals(expected, actual);
    }
}

