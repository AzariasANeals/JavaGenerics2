import java.util.*;

/**
 * This is my Stack class. It creates a Stack of items, and allows us to push
 * items onto that Stack. It will also throw an EmptyNullStackException if the stack is
 * empty and you attempt to pop an item off it.
 */
public class Stack<T>
{
    public static final int NO_ITEMS_ON_STACK = 0;
    private List<T> stack;
    private int numberOfItems;
    private boolean isEmpty;
    
    public Stack()
    {
        stack = new ArrayList<T>();
        numberOfItems = 0;
        isEmpty = true;
    }

    public void push(T item)
    {
        stack.add(item);
        numberOfItems++;
        isEmpty = false;
    }
    
    public T pop() throws EmptyNullStackException
    {
        if(isEmpty)
        {
            throw new EmptyNullStackException("Stack is empty.\n", true);
        }
        T buf = stack.remove(numberOfItems - 1);
        numberOfItems--;
        if(numberOfItems <= NO_ITEMS_ON_STACK)
        {
            isEmpty = true;
        }
        return buf;
    }
    
    public boolean hasItems()
    {
        return !isEmpty;
    }
    
    public String toString()
    {
        return stack.toString();
    }
}
