

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CacheTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CacheTest
{
    Cache<String> testerOne;
    Cache<Integer> testerTwo;
    final String s1 = "monopoly";
    final String s2 = "yahtzee";
    final String s3 = "chess";
    final String s4 = "checkers";
    final int i1 = 1;
    final int i2 = 2;
    final int i3 = 3;
    final int i4 = 5;
    final int i5 = 8;
    final int i6 = 13;
    
    
    /**
     * Default constructor for test class CacheTest
     */
    public CacheTest()
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
         testerOne = new Cache<String>();
         testerTwo = new Cache<Integer>();
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

    // 3 normal
    @Test
    public void testAddOneStringElement()
    {
        int expected = 1;
        int actual = testerOne.add(s1);
        
        assertEquals(expected, actual);
    }

    @Test
    public void testAddThreeStringElements()
    {
        int expected = 3;
        int actual = testerOne.add(s1);
        actual = testerOne.add(s2);
        actual = testerOne.add(s3);
        
        assertEquals(expected, actual);
    }    
    
    @Test
    public void testGetNumberOfCacheItems()
    {
        int expected = 3;
        testerTwo.add(i6);
        testerTwo.add(i5);
        testerTwo.add(i4);
        testerTwo.add(i3);
        testerTwo.add(i2);
        testerTwo.add(i1);
        int sink = testerTwo.remove();
        sink = testerTwo.remove();
        sink = testerTwo.remove();
        
        int actual = testerTwo.getNumberOfCacheItems();
        
        assertEquals(expected, actual);
    }    
    
    // 3 edge cases
    @Test
    public void testClearAlreadyEmptyCache()
    {
        int expected = 0;
        testerOne.clear();
        int actual = testerOne.getCurrentCacheKey();
        
        assertEquals(expected, actual);
    }  
    
    @Test
    public void testRemoveWhenCacheIsEmpty()
    {
        int expected = 0;
        testerOne.remove();
        int actual = testerOne.getCurrentCacheKey();
        
        assertEquals(expected, actual);
    }   
    
    @Test
    public void testAddAfterRemove()
    {
        int expected = 7;
        int actual = 2;
        testerTwo.add(i6);
        testerTwo.add(i5);
        testerTwo.add(i4);
        testerTwo.add(i3);
        testerTwo.add(i2);
        testerTwo.add(i1);
        int sink = testerTwo.remove();
        sink = testerTwo.remove();
        testerTwo.add(i3);
        actual = testerTwo.getCurrentCacheKey();
        assertEquals(expected, actual);
    }    
}
