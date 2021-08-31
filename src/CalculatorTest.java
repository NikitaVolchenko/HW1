import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void test() {

        Calculator calculator = new Calculator();
        Calculator calculator1 = new Calculator();

        calculator1.setValue(25);
        calculator = calculator.add(calculator1);
        assertEquals(25, calculator.getValue());

        calculator1.setValue(2);
        calculator = calculator.mult(calculator1);
        assertEquals(50, calculator.getValue());

        calculator1.setValue(10);
        calculator = calculator.div(calculator1);
        assertEquals(5, calculator.getValue());

        calculator1.setValue(5);
        calculator = calculator.sub(calculator1);
        assertEquals(0, calculator.getValue());
    }

}