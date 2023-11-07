package Task_4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    private static MyService myService;

    @BeforeAll
    public static void setUp() {
        myService = new MyService();
    }

    @Test
    public void testDivide() {
        assertEquals(2, myService.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> myService.divide(4, 0));
    }

    @Test
    public void testGetDataFromDatabase() throws SQLException {
        String result = myService.getDataFromDatabase("SELECT * FROM my_table");
        assertEquals("Данные из базы данных", result);
    }

    @Test
    public void testGetDataFromDatabaseInvalidQuery() {
        assertThrows(SQLException.class, () -> myService.getDataFromDatabase("INVALID SQL"));
    }

    @Test
    public void testController1() {
        String result = myService.callController1();
        assertEquals("Ожидаемый результат 1", result);
    }

    @Test
    public void testController2() {
        String result = myService.callController2();
        assertEquals("Ожидаемый результат 2", result);
    }
}
