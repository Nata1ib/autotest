package homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
        import org.junit.jupiter.params.provider.CsvSource;
        import org.junit.jupiter.params.provider.ValueSource;

        import static org.junit.jupiter.api.Assertions.*;

class DivTest extends CalculatorTest {
    @ParameterizedTest
    @ValueSource(longs = {0, -1, 1, 12345, -12345})
    void testDivisionByZero(long input) {
        assertThrows(NumberFormatException.class, () -> calculator.div(input, 0));
    }

    @ParameterizedTest
    @ValueSource(longs = {0, -1, 1, 12345, -12345})
    void testDivisionByOne(long input) {
        assertEquals(input, calculator.div(input, 1));
    }

    @ParameterizedTest
    @CsvSource({"4, 20, 5", "-6, 36, -6", "-9, -72, 8"})
    void testGeneralCorrectness(long expected, long a, long b) {
        assertEquals(expected, calculator.div(a, b));
    }
}