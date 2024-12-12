
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StackTest
{
    Stack<String> testerOne;
    Stack<Double> testerTwo;
    Stack<Object> testerThree;

    double numOne = 2.2;
    double numTwo = 3.3;
    double numThree = 9.7;
    double numFour = 0.1;
    String itemOne = "Chair";
    String itemTwo = "Dresser";
    String itemThree = "Stool";
    String itemFour = "Chest";
    String itemFive = "Table";
    int x1 = 5;
    int x2 = 3;
    int x3 = 9;
    int x4 = 1001;
    /**
     * Default constructor for test class StackTest
     */
    public StackTest()
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
        testerOne = new Stack<String>();
        testerTwo = new Stack<Double>();
        testerThree = new Stack<>();
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
    public void testPushDoubleOnly()
    {
        boolean expected = true;
        boolean actual = false;
        testerTwo.push(numFour);
        actual = testerTwo.hasItems();
        assertEquals(expected, actual);       
    }

    @Test
    public void testPushStringOnly()
    {
        boolean expected = true;
        boolean actual = false;
        testerOne.push(itemThree);
        actual = testerOne.hasItems();
        assertEquals(expected, actual);       
    }

    @Test
    public void testPopDoubleOnly()
    {
        double expected = numThree;
        double actual = numOne;        
        testerTwo.push(numOne);
        testerTwo.push(numFour);
        testerTwo.push(numTwo);
        testerTwo.push(numThree);
        try
        {
            actual = testerTwo.pop();    
        }
        catch(EmptyNullStackException ex)
        {
            // do nothing
        }

        assertEquals(expected, actual);        
    }

    // edge cases
    @Test 
    public void testPushMultipleTypes()
    {
        double expected = numTwo;
        double actual = 0.0;
        testerThree.push(itemOne);
        testerThree.push(x2);
        testerThree.push(numTwo);
        try
        {
            actual = (Double)testerThree.pop();
        }
        catch(EmptyNullStackException ex)
        {
            // do nothing
        }

        assertEquals(expected, actual);        
    }  

    @Test
    public void testPopMultipleTypes()
    {
        int expected = x3;
        int actual = x1;
        testerThree.push(numThree);
        testerThree.push(itemTwo);
        testerThree.push(x3);
        try
        {
            actual = (Integer)testerThree.pop();
        }
        catch(EmptyNullStackException ex)
        {
            // do nothing
        }        
        assertEquals(expected, actual);        
    }    

    @Test
    public void testPopEmptyStack()
    {
        boolean expected = true;
        boolean actual = false;
        double junk = 0.0;
        try
        {
            junk = testerTwo.pop();
        }
        catch(EmptyNullStackException ex)
        {
            actual = true;
        }

        assertEquals(expected, actual);
    }    
}
