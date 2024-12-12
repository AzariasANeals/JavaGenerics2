
/**
 * This is my EmptyNullStackException class. It extends Exception. 
 * This is our custom exception for the Stack, that is thrown when the Stack is empty
 * and a pop operation is run.
 */
public class EmptyNullStackException extends Exception
{
    private boolean useVerbose;
    private String verboseMessage;
    public static final String detailed = "You cannot remove items from an empty stack\n";

    /**
     * Constructor for objects of class EmptyNullStackException
     */
    public EmptyNullStackException(String message)
    {
        super(message);
        verboseMessage = "";
        useVerbose = false;
    }

    public EmptyNullStackException(String message, boolean useVerbose)
    {
        super(message);
        this.useVerbose = useVerbose;
        if(useVerbose)
        {
            verboseMessage = detailed + message;
        }
        else
        {
            verboseMessage = "";
        }
    }
    
    public String getVerboseMessage()
    {
        return this.verboseMessage;
    }

}
