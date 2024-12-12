

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EmptyNullStackExceptionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EmptyNullStackExceptionTest
{
    public class MockStack
    {
        public static final String mockStr = "Test Mock";
        public static final String verboseStr = "Verbose It Is";
        
        public String popString() throws EmptyNullStackException
        {
            throw new EmptyNullStackException(mockStr);
        }
        
        public String popVerboseString() throws EmptyNullStackException
        {
            throw new EmptyNullStackException(verboseStr, true);
        }
        
        public String popNullMsg() throws EmptyNullStackException
        {
            throw new EmptyNullStackException(null);
        }
        
        public String popEmptyMsg() throws EmptyNullStackException
        {
            throw new EmptyNullStackException("");
        }
        
        public String popNullVerboseMsg() throws EmptyNullStackException
        {
            throw new EmptyNullStackException(null, true);
        }
        
        public String popEmptyVerboseMsg() throws EmptyNullStackException
        {
            throw new EmptyNullStackException("", true);
        }        
    }
    
    MockStack tester;
    Stack<Integer> testStackInt;
    /**
     * Default constructor for test class EmptyNullStackExceptionTest
     */
    public EmptyNullStackExceptionTest()
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
        tester = new MockStack();
        testStackInt = new Stack<Integer>();
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
    
    // normal
    @Test
    public void testNormalThrowNonVerbose()
    {
        String expected = MockStack.mockStr;
        String actual = "";
        
        try
        {
             tester.popString();  
        }
        catch(EmptyNullStackException ex)
        {
            actual = ex.getMessage();
        }
        
        assertEquals(expected, actual);        
    }
    
    @Test
    public void testNormalThrowVerbose()
    {
        String expected = MockStack.verboseStr;
        String actual = "";

        try
        {
             tester.popVerboseString();  
        }
        catch(EmptyNullStackException ex)
        {
            actual = ex.getMessage();
        }        
        
        assertEquals(expected, actual);        
    }    
     
    @Test
    public void testGetVerboseMessage()
    {
        String expected = EmptyNullStackException.detailed + MockStack.verboseStr;
        String actual = "";
        try
        {
             tester.popVerboseString();  
        }
        catch(EmptyNullStackException ex)
        {
            actual = ex.getVerboseMessage();
        }        
        assertEquals(expected, actual);        
    }    
    
    // edge cases
    @Test
    public void testNullThrowNonVerbose()
    {
        String expected = null;
        String actual = "";
         try
        {
             tester.popNullMsg();  
        }
        catch(EmptyNullStackException ex)
        {
            actual = ex.getMessage();
        }       
        assertEquals(expected, actual);        
    }
    
    @Test
    public void testNullThrowVerbose()
    {
        String expected = null;
        String actual = "";
        try
        {
             tester.popNullVerboseMsg();  
        }
        catch(EmptyNullStackException ex)
        {
            actual = ex.getMessage();
        }        
        assertEquals(expected, actual);        
    }    
     
    @Test
    public void testNullGetVerboseMessage()
    {
        String expected = EmptyNullStackException.detailed + null;
        String actual = "";
        try
        {
             tester.popNullVerboseMsg();  
        }
        catch(EmptyNullStackException ex)
        {
            actual = ex.getVerboseMessage();
        }        
        assertEquals(expected, actual);        
    }       
}
