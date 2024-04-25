package ua.or.onmu.KN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumTest {

    @Test
    public void testPerformAddition() {
        // Arrange
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] expectedResult = {5, 7, 9};

        // Act
        int[] actualResult = ArrayCalculator.performAddition(array1.clone(), array2.clone()); // Avoid modifying original arrays

        // Assert
        assertArrayEquals(expectedResult, actualResult);
    }

}