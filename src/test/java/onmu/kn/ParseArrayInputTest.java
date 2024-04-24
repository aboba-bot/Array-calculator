package test.java.onmu.kn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ArrayParserTest {

    @Test
    public void testParseArrayInput_ValidInput() {
        // Setting the input data for the method parseArrayInput
        String input = "1 2 3 4 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Expected Result
        int[] expected = {1, 2, 3, 4, 5};

        // Calling the method we are testing
        int[] result = ArrayParser.parseArrayInput(5, "test");

        // Check that the result matches the expected result
        assertArrayEquals(expected, result);
    }

    @Test
    public void testParseArrayInput_InvalidInputLength() {
        // Setting the input data for the parseArrayInput method
        String input = "1 2 3 4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Expected result - the program should exit with code 1
        int expectedExitCode = 1;

        // We run the method and check that the program ends with the required code
        assertThrows(SecurityException.class, () -> {
            ArrayParser.parseArrayInput(5, "test");
        });
    }
}
