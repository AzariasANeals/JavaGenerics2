import java.util.*;

/**
 * This is the Utility class. This is where we will run our demos for 
 * our Multi-type generic pair method, 
 */
public class Utility
{

    public Utility()
    {

    }

    public static void run()
    {
        // testing Pair<K,V> class
        System.out.println("Demonstrating the Pair<K,V> class.");
        System.out.println("-------------------------------------------------------------------------------------");

        Pair<Integer, String> pair = new Pair(5, "chair");
        System.out.println(pair);
        System.out.println("Setting Key to 6\n");

        pair.setKey(6);
        System.out.println(pair);

        System.out.println("Getting value: " + pair.getValue() + "\n");
        System.out.println("Setting value to desk");
        System.out.println("");
        pair.setValue("desk");
        System.out.println(pair);

        // testing Stack<T> class
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Demonstrating our Stack<T> class.");
        System.out.println("");
        Stack<String> strStack = new Stack<>();
        Stack<Double> dblStack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();

        double numOne = 2.2;
        double numTwo = 3.3;
        double numThree = 9.7;
        double numFour = 0.1;
        String itemOne = "Chair";
        String itemTwo = "Dresser";
        String itemThree = "Stool";
        String itemFour = "Chest";
        String itemFive = "Table";

        System.out.println("Pushing Items onto the Stack");
        System.out.println("");

        System.out.println("Stack status before push: String Stack Items: " + strStack);
        System.out.println("Stack status before push: Double Stack Items: " + dblStack);
        strStack.push(itemOne);
        dblStack.push(numOne);
        System.out.println("");

        System.out.println("Stack status after push: String Stack Items: " + strStack);
        System.out.println("Stack status after push: Double Stack Items: " + dblStack);        
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("");

        System.out.println("Pushing more items on the stacks:");
        System.out.println("");

        System.out.println("Stack status before push: String Stack Items: " + strStack);
        System.out.println("Stack status before push: Double Stack Items: " + dblStack);        
        System.out.println("");

        strStack.push(itemTwo);
        strStack.push(itemThree);
        strStack.push(itemFour);
        strStack.push(itemFive);
        dblStack.push(numTwo);
        dblStack.push(numThree);
        dblStack.push(numFour);
        System.out.println("Stack status after push: String Stack Items: " + strStack);
        System.out.println("Stack status after push: Double Stack Items: " + dblStack);                
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Stack status before pop: String Stack Items: " + strStack);
        System.out.println("Stack status before pop: Double Stack Items: " + dblStack); 
        // stack() is a LIFO (last in, first off), this means that whatever goes last is
        // the first item to be popped off the stack. Notice here that the last item we pushed on
        // the stack is Table for the String stack and 0.1 for the Double stack. After we
        // pop one item off each stack, notice it's Table and 0.1 that are popped off.
        // pop() is when you take the last item off the stack

        // There is a try-catch that will print an error message if the stack is empty.
        // However, because there are values in the stack, no error message is shown.
        try
        {
            strStack.pop();
            dblStack.pop();
        }
        catch(EmptyNullStackException nex)
        {
            System.out.println(nex.getMessage());
        }        

        System.out.println("Stack status after pop: String Stack Items: " + strStack);
        System.out.println("Stack status after pop: Double Stack Items: " + dblStack);                
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Showing the error message when an empty stack is popped.");
        try
        {
            intStack.pop();
        }
        catch(EmptyNullStackException nex)
        {
            System.out.println("");

            System.out.println(nex.getMessage());            
        }
        System.out.println("-------------------------------------------------------------------------------------");

        // testing sort algorithm
        ArrayList<Integer>  intList = new ArrayList<Integer>();
        intList.add(14);
        intList.add(-21);
        intList.add(5);
        intList.add(61);

        ArrayList<Double> numList = new ArrayList<Double>();
        numList.add(3.8);
        numList.add(2.32);
        numList.add(-14.23);
        numList.add(0.5);
        numList.add(71.3);

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("chair");
        strList.add("apple");
        strList.add("pear");
        strList.add("cake");
        strList.add("peach");

        System.out.println("Testing our generic sort method On Integers.");
        System.out.println("");

        System.out.println("Original Order: " + intList);
        sort(intList);
        System.out.println("Sorted: " + intList);
        System.out.println("");

        System.out.println("Testing our generic sort method On Doubles.");
        System.out.println("Original Order: " + numList);
        sort(numList);
        System.out.println("Sorted: " + numList);

        System.out.println("");
        System.out.println("Testing our generic sort method On Strings.");
        System.out.println("Original Order: " + strList);
        sort(strList);
        System.out.println("Sorted: " + strList);        
        System.out.println("-------------------------------------------------------------------------------------");

        // testing print collection method
        System.out.println("Testing our print collection method");
        printCollection(intList);
        System.out.println("-------------------------------------------------------------------------------------");
        printCollection(numList);
        System.out.println("-------------------------------------------------------------------------------------");
        printCollection(strList);
        System.out.println("-------------------------------------------------------------------------------------");

        // testing our sum method
        System.out.println("Testing our Sum Method");
        double total = sumOfNumberList(numList);
        System.out.println("List: " + numList + " Total: " + total);
        total = sumOfNumberList(intList);
        System.out.println("List: " + intList + " Total: " + total);
        System.out.println("-------------------------------------------------------------------------------------");

        // testing our cache
        System.out.println("Testing our Cache<T> class");
        Cache<Integer> intCacheOne = new Cache<>();
        Cache<Integer> intCacheTwo = new Cache<>();
        Cache<Integer> copyIntCacheOne = new Cache();
        int i1 = 14;
        int i2 = 8;
        int i3 = 11;
        int i4 = 77;

        System.out.println("Testing first Integer cache.");
        System.out.println("Will insert value: " + i1);
        System.out.println("Cache Status Before Add - Empty: " + intCacheOne.isEmpty());
        System.out.println("Cache Status Before Add - Cached Item Count: " + intCacheOne.getNumberOfCacheItems());
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------");

        int key1 = intCacheOne.add(i1);
        System.out.println("Cache Status After Add - Empty: " + intCacheOne.isEmpty());
        System.out.println("Cache Status After Add - Cached Item Count: " + intCacheOne.getNumberOfCacheItems());
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Adding three more items " + i2 + ", " + i3 + ", " + i4);
        int key2 = intCacheOne.add(i2);
        int key3 = intCacheOne.add(i3);
        int key4 = intCacheOne.add(i4);
        System.out.println("Cache Status After Add - Cached Item Count: " + intCacheOne.getNumberOfCacheItems());
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("");
        System.out.println("Testing copying all to Second Integer cache");
        System.out.println("Cache Status Before Add - Empty: " + intCacheTwo.isEmpty());
        System.out.println("Cache Status Before Add - Cached Item Count: " + intCacheTwo.getNumberOfCacheItems());        
        // Here we copy the values of Cache One into Cache Two.
        intCacheOne.addAll(intCacheTwo);

        System.out.println("Cache Status After Add - Empty: " + intCacheTwo.isEmpty());
        System.out.println("Cache Status After Add - Cached Item Count: " + intCacheTwo.getNumberOfCacheItems());
        System.out.println("Cache One: " + intCacheOne);
        System.out.println("Cache Two: " + intCacheTwo);
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("Testing item retrieval from cache - First Entry: " + intCacheOne.retrieve(key1));
        System.out.println(""); 
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Testing Removal of Item from Cache One");
        System.out.println("Cache One contents before removal");
        System.out.println("Cache One: " + intCacheOne);
        System.out.println("Removing Longest Entry: " + i1);

        // This is a first-in first-out, so the first entry will be removed. In this case 14.
        int removed = intCacheOne.remove();
        System.out.println("Cache One contents after removal");
        System.out.println("Cache One: " + intCacheOne);        
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("Testing clearing of the cache");
        System.out.println("Cache Status Before Clearing - Empty: " + intCacheTwo.isEmpty());
        System.out.println("Cache Status Before Clearing - Cached Item Count: " + intCacheTwo.getNumberOfCacheItems());                
        System.out.println("Cache Two: " + intCacheTwo);
        intCacheTwo.clear();
        System.out.println("Cache Status After Add Clearing - Empty: " + intCacheTwo.isEmpty());
        System.out.println("Cache Status After Add Clearing - Cached Item Count: " + intCacheTwo.getNumberOfCacheItems());
        System.out.println("Cache Two: " + intCacheTwo);
        System.out.println("-------------------------------------------------------------------------------------");

        Cache<String> strCacheOne = new Cache<>();
        Cache<String> strCacheTwo = new Cache<>();
        String s1 = "chairs";
        String s2 = "boxes";
        String s3 = "keyboards";
        String s4 = "mice";

        System.out.println("Testing first String cache.");
        System.out.println("Will insert value: " + s1);
        System.out.println("Cache Status Before Add - Empty: " + strCacheOne.isEmpty());
        System.out.println("Cache Status Before Add - Cached Item Count: " + strCacheOne.getNumberOfCacheItems());
        System.out.println("Cache One: " + strCacheOne);

        System.out.println("");
        int skey1 = strCacheOne.add(s1);
        System.out.println("Cache Status After Add - Empty: " + strCacheOne.isEmpty());
        System.out.println("Cache Status After Add - Cached Item Count: " + strCacheOne.getNumberOfCacheItems());
        System.out.println("Cache One: " + strCacheOne);

        System.out.println("");
        System.out.println("Adding three more items " + s2 + ", " + s3 + ", " + s4);
        int skey2 = strCacheOne.add(s2);
        int skey3 = strCacheOne.add(s3);
        int skey4 = strCacheOne.add(s4);
        System.out.println("Cache Status After Add - Cached Item Count: " + strCacheOne.getNumberOfCacheItems());
        System.out.println("Cache One: " + strCacheOne);

        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Testing copying all to Second Integer cache");
        System.out.println("Cache Status Before Add - Empty: " + strCacheTwo.isEmpty());
        System.out.println("Cache Status Before Add - Cached Item Count: " + strCacheTwo.getNumberOfCacheItems());        
        strCacheOne.addAll(strCacheTwo);

        System.out.println("Cache Status After Add - Empty: " + strCacheTwo.isEmpty());
        System.out.println("Cache Status After Add - Cached Item Count: " + strCacheTwo.getNumberOfCacheItems());
        System.out.println("Cache One: " + strCacheOne);
        System.out.println("Cache Two: " + strCacheTwo);

        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Testing item retrieval from cache - First Entry: " + strCacheOne.retrieve(skey1));
        System.out.println(""); 
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("Testing Removal of Item from Cache One");
        System.out.println("Cache One contents before removal");
        System.out.println("Cache One: " + strCacheOne);
        System.out.println("Removing Longest Entry: " + s1);
        String removedString = strCacheOne.remove();
        System.out.println("Cache One contents after removal");
        System.out.println("Cache One: " + strCacheOne);        
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("Testing clearing of the cache");
        System.out.println("Cache Status Before Clearing - Empty: " + strCacheTwo.isEmpty());
        System.out.println("Cache Status Before Clearing - Cached Item Count: " + strCacheTwo.getNumberOfCacheItems());                
        System.out.println("Cache Two: " + strCacheTwo);
        strCacheTwo.clear();
        System.out.println("Cache Status After Add Clearing - Empty: " + strCacheTwo.isEmpty());
        System.out.println("Cache Status After Add Clearing - Cached Item Count: " + strCacheTwo.getNumberOfCacheItems());
        System.out.println("Cache Two: " + strCacheTwo);        
        System.out.println("-------------------------------------------------------------------------------------");

    }

    // Our sort method. It takes in an ArrayList object and sorts it using Collections.
    public static <T extends Comparable<T>> void sort(ArrayList<T> array)
    {
        Collections.sort(array);
    }

    // Our return Collection, it returns a string and uses an iterator to iterate through it.
    // It also has a wildcard generic with a bound.
    public static <T extends Collection<?>> String returnCollection(T bag)
    {
        StringBuilder sb = new StringBuilder();
        Iterator iter = bag.iterator();
        while(iter.hasNext())
        {
            sb.append(iter.next());
            sb.append("\n");
        }

        return sb.toString();
    }

    // This is our printCollection, it will print out whatever is in the collection.
    public static <T extends Collection<?>> void printCollection(T bag)
    {
        System.out.println(returnCollection(bag));
    }

    // This is our sumOfNumberList, it will take in a list of T, if T is a sub-class
    // of Number or Number itself. So it will not take in Strings. the <? extends Number>
    // prevents that.
    public static <T extends List<? extends Number>>double sumOfNumberList(T list)
    {
        double sum =  0.0;
        Iterator iter = list.iterator();
        while(iter.hasNext())
        {
            sum += ((Number)iter.next()).doubleValue();
        }

        return sum;
    }

}
