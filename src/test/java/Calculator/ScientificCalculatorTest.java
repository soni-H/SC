package Calculator;

import Calculator.ScientificCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class ScientificCalculatorTest {
    private static final double DELTA = 1e-15;
    ScientificCalculator scientificCalculator = new ScientificCalculator();

    @Test
    public void squareRootTest(){
        assertEquals(Math.sqrt(5), scientificCalculator.getCalculations(5,0,1), DELTA);
        assertNotEquals(1, scientificCalculator.getCalculations(5,0,1), DELTA);
    }

    @Test
    public void factorialTest(){
        assertEquals( 720, scientificCalculator.getCalculations(6,0,2), DELTA);
        assertNotEquals( 24, scientificCalculator.getCalculations(5,0,2), DELTA);
    }

    @Test
    public void powerTest(){
        assertEquals( 1, scientificCalculator.getCalculations(5,0,4), DELTA);
        assertNotEquals( 64, scientificCalculator.getCalculations(5,0,4), DELTA);
    }

    @Test
    public void naturalLogTest(){
        assertEquals( Math.log(5), scientificCalculator.getCalculations(5,0,3), DELTA);
        assertNotEquals(1, scientificCalculator.getCalculations(5,0,3), DELTA);
    }




}
