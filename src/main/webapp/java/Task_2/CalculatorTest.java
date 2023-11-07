package Task_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalculateSum() {
        Calculator calculator = new Calculator();

        // Позитивный тест
        assertEquals(5, calculator.calculateSum(2, 3));

        // Тест на исключение
        try {
            calculator.calculateSum(-2, 3);
        } catch (IllegalArgumentException e) {
            assertEquals("Оба числа должны быть неотрицательными", e.getMessage());
        }
    }
}
