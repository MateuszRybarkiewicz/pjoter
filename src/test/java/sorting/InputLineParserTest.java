package sorting;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InputLineParserTest {
    private InputLineParser parser = new InputLineParser();
    private static Random r = new Random();
    private static String input;

    @BeforeClass
    public static void setup() {
        input = generateInput(100);
    }

    @Test(expected = InputParseException.class)
    public void givenInvalidInputExceptionIsThrown_invalid() throws InputParseException {
        parser.parseInput("1, 2");
    }

    @Test(expected = InputParseException.class)
    public void givenInvalidInputExceptionIsThrown_char() throws InputParseException {
        parser.parseInput("1 a 3");
    }

    @Test
    public void givenValidInputItIsParsed() throws InputParseException {
        Integer[] parsedInput = parser.parseInput(input);

        String[] expectedResult = input.split(" ");
        assertEquals(expectedResult.length, parsedInput.length);
        assertValuesAndOrderIsPreserved(parsedInput, expectedResult);
    }

    private void assertValuesAndOrderIsPreserved( Integer[] parsedInput, String[] expectedResult) {
        AtomicInteger counter = new AtomicInteger(0);
        Arrays.stream(expectedResult).forEach(integer -> {
            int inputAsInt = Integer.parseInt(integer);
            Integer intFromParsed = parsedInput[counter.get()];
            assertTrue(inputAsInt == intFromParsed);
            counter.incrementAndGet();
        });
    }

    private static String generateInput(int length) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {
            result.append(r.nextInt(Integer.MAX_VALUE));
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
