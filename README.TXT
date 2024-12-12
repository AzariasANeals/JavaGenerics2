This is my Java Generics 2 program. To run it simply go to the Application class,
right click it and click on "void(String[] args)" and the program demo will run.

There are 3 parts to it.
Part 1: Implementing Complex Data Structures

        1. Multi-Type Generic Pair
        
            - Implement a generic Pair<K,V> class where K represents the key type
            and V represents the value type
            
            - Implement methods to get and set the key and value, as well as a toString()
            method to print the key-value pair.
            
        2. Generic Stack
        
            - Develop a generic Stack<T> class that allows pushing and popping elements of any
            type
            
            - Implement methods for push, pop, and checking if the stack is empty.
            
            - Ensure that the stack gracefully handles underflow (when popping an empty stack)
            by throwing an appropriate exception.
            
Part 2: Wildcard Usage in Methods

        1. Generic Sort Utility
        
            - Write a static generic method sort in a utility class that sorts an ArrayList<T> 
            where T extends Comparable<T>
            
            - Demonstrate the usage of this method by sorting lists of various comparable types,
            such as Integer, String, and a custom class that implements Comparable.
        
        2. Wildcard Usage in Methods
        
            - Write a method printCollection that accepts a Collection<?> and prints each item in
            the collection.
            
            - Extend this by writing a method sumOfNumberList that accepts a List<? extends Number> and
            returns the sum of the elements.

Part 3: Complex Generic Scenarios

        1. Generic Cache Implementation
        
            - Design and implement a Cache<T> class that can store instances of type T. The cache
            should have methods to add items, retrieve items by key, and clear the cache.
            
            - Utilize bounded wildcards to implement a method addAll that can add all items from one
            cache to another, provided they are of compatible types.
