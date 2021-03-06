import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before

    public void before(){
        calculator= new Calculator(5,11,15,2);
    }
    @Test
    public void addNumbers(){
        assertEquals(16,calculator.add());
    }

    @Test
    public void subtractNumbers(){
        assertEquals(6,calculator.subtract());
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(55,calculator.multiply());
    }

    @Test
    public void divideNumbers(){
    assertEquals(7.5,calculator.divide(),0.01);
    }

}
