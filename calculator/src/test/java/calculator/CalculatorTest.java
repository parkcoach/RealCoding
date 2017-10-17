package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Test
    public void plus(){
        Calculator cal = new Calculator();
        int result = cal.addTwoInteger(2, 4);
        assertTrue(result == 6);
    }

    @Test
    public void plus_minus(){
        Calculator cal = new Calculator();
        int result = cal.addTwoInteger(-2, -4);
        assertTrue(result == -6);
    }

    @Test
    public void division() throws Exception {
        Calculator cal = new Calculator();
        double result = cal.division(6, 4);
        assertTrue(result==6.0/4.0);
    }

    @Test
    public void division_zero() throws Exception {
        Calculator cal = new Calculator();
        dou
    }
}
