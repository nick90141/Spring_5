package Task_2;

public class Calculator {
    public int calculateSum(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Оба числа должны быть неотрицательными");
        }
        return a + b;
    }
}
