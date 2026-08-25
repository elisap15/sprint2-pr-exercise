import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addReturnsSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void divideThrowsException() {
        assertThrows(IllegalArgumentException.class,
            () -> calculator.divide(10, 0));
    }
