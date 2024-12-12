

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class UtilityTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class UtilityTest
{
    final String sorted = "[1, 2, 3]";
    final int x1 = 3;
    final int x2 = 1;
    final int x3 = 2;
    final double xTotal = 6.0;
    final double n1 = 3.5;
    final double n2 = 4.5;
    final double nTotal = 8.0;
    
    ArrayList<Integer> intList;
    ArrayList<Double> numList;
    ArrayList<Integer> blankInt;
    ArrayList<Double> blankNum;
    /**
     * Default constructor for test class UtilityTest
     */
    public UtilityTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        intList = new ArrayList<Integer>();
        intList.add(x1);
        intList.add(x2);
        intList.add(x3);
        numList = new ArrayList<Double>();
        numList.add(n1);
        numList.add(n2);
        
        blankInt = new ArrayList<Integer>();
        blankNum = new ArrayList<Double>();
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    // normal cases
    @Test
    public void testSort()
    {
        String expected = sorted;
        Utility.sort(intList);
        
        String actual = intList.toString();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSumOfNumberListInt()
    {
        double expected = xTotal;
        double actual = Utility.sumOfNumberList(intList);
        
        assertEquals(expected, actual);        
    }
    
    @Test
    public void testSumOfNumberListDouble()
    {
        double expected = nTotal;
        double actual = Utility.sumOfNumberList(numList);
        
        assertEquals(expected, actual);        
    }    
    // exception cases
    @Test
    public void testEmptySort()
    {
        String expected = "[]";
        Utility.sort(blankInt);
        String actual = blankInt.toString();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEmptySumOfNumberListInt()
    {
        double expected = 0.0;
        
        double actual = Utility.sumOfNumberList(blankInt);
        
        assertEquals(expected, actual);        
    }
    
    @Test
    public void testEmptySumOfNumberListDouble()
    {
        double expected = 0.0;
        double actual = Utility.sumOfNumberList(blankNum);
        
        assertEquals(expected, actual);        
    }        
    
    
}
