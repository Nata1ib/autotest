package homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumTest extends CalculatorTest {
    @ParameterizedTest
    @CsvSource({"1, -1, 2", "-1, 1, -2"})
    void testSignChangeOverZero(long expected, long a, long b) {
        assertEquals(expected, calculator.sum(a, b));
    }

    @ParameterizedTest
    @CsvSource({"-9223372036854775808, 9223372036854775807, 1", "9223372036854775807, -9223372036854775808, -1"})
    void testSignChangeOverMaxLong(long expected, long a, long b) {
        assertEquals(expected, calculator.sum(a, b));
    }

    @ParameterizedTest
    @CsvSource({"23, 17, 6", "-10, -8, -2"})
    void testGeneralCorrectness(long expected, long a, long b) {
        assertEquals(expected, calculator.sum(a, b));
    }
}