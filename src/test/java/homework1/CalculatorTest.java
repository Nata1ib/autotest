package homework1;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest{
    protected static Calculator calculator;
    protected static final double DELTA = 0.1;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }
}
