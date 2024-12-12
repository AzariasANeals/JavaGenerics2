

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PairTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PairTest
{
    Pair<Integer,String> testerOne;
    Pair<String,String> testerTwo;
    Pair<String, String> nullPair;
    int keyOne = 14;
    String keyTwo = "15G";
    String valueOne = "Hammer";
    String valueTwo = "Chair";
    int newKeyOne = 16;
    String newKeyTwo = "A15Z";
    String newValueOne = "Screwdriver";
    String newValueTwo = "Desk";
    /**
     * Default constructor for test class PairTest
     */
    public PairTest()
    {
        testerOne = new Pair(keyOne, valueOne);
        testerTwo = new Pair(keyTwo, valueTwo);
        nullPair = new Pair(null, null);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
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
    
    // normal tests
    @Test
    public void testGetValue()
    {
        String expected = valueOne;
        String actual = testerOne.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetKey()
    {
        String expected = keyTwo;
        String actual = testerTwo.getKey();
        assertEquals(expected, actual);        
    }   
    
    @Test
    public void testToString()
    {
        boolean expected = true;
        boolean actual = false;
        String itemToFind = "Chair";
        String serPairTwo = testerTwo.toString();
        actual = serPairTwo.contains(itemToFind);
        assertEquals(expected, actual);
    }
    
    // edge case tests
    @Test
    public void testNullGetValue()
    {
        String expected = null;
        String actual = nullPair.getValue();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNullGetKey()
    {
        String expected = null;
        String actual = nullPair.getKey();
        
        assertEquals(expected, actual);
    } 
    
    @Test
    public void testNullToString()
    {
        String expected = Pair.HEADING_BLURB + null + Pair.KEY_VAL_SEPARATOR + null + Pair.NEW_LINE;
        String actual = nullPair.toString();
        
        assertEquals(expected, actual);
    }    
}
