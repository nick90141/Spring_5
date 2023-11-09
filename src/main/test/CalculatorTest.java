package Task_2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculateSum_Positive() {
        assertEquals(5, calculator.calculateSum(2, 3));
    }

    @Test
    public void testCalculateSum_Exception() {
        try {
            calculator.calculateSum(-2, 3);
            fail("Очікувалося, що виникне IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Оба числа должны быть неотрицательными", e.getMessage());
        }
    }
}
