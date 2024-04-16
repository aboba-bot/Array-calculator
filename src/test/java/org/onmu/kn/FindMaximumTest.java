package org.onmu.kn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaximumTest {

    @Test
    public void testFindMaximum() {
        int[] array1 = {5, 10, 15, 20};
        int[] array2 = {8, 12, 16, 24};

        assertEquals(24, ArrayCalculator.findMaximum(array1, array2));
    }
}
