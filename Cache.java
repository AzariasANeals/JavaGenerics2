import java.util.*;

/**
 * This is my Cache class. It uses a HashMap to maintain the Cache contents.
 * You can add items to the cache and clear the cache, and retrieve items from the cache.
 * When you remove an item, it removes the first item put on the cache. Mimicking a cache where
 * the longest unused item is popped off when the cache runs out of memory.
 */
public class Cache<T>
{
    public static final int START_KEY_VALUE = 0;
    HashMap<Integer, T> cache;
    private int key;
    public Cache()
    {
        cache = new HashMap<Integer, T>();
        key = 0;
    }
    
    public int add(T item)
    {
        key++;
        cache.put(key, item);
        return key;
    }
    
    public void clear()
    {
        cache.clear();
        // reset key to 0
        key = START_KEY_VALUE;
    }
    
    public T retrieve(int key)
    {
        return cache.get(key);
    }
    
    public boolean isEmpty()
    {
        // If the cache is empty it will return true, else it will return false.
        return key == START_KEY_VALUE? true: cache.isEmpty();
    }
    
    public T remove()
    {
        T buf = null;
        int i = 1;
        // This will check to see if a cache contains a Key that we want removed. If it does it removes the Key from the cache.
        // This mimics the FIFO because if two items are removed from the cache then the first and second key will not be present.
        // but the third and subsequent keys will still exist, so on the next removal it needs to check to make sure that the key exists
        // before trying to remove it. And it will continue to look for an existing key in the order the keys were added to the stack.
        for(; i <= key; i++)
        {
            if(cache.containsKey(i))
            {
                buf = cache.remove(i);
                break;
            }
        }
        if(i == key)
        {
            clear();
        }
        
        return buf;
    }
    
    public int getNumberOfCacheItems()
    {
        return cache.size();
    }
    
    public int getCurrentCacheKey()
    {
        return key;
    }
    
    public <P extends Cache<T> > void addAll(P otherCache)
    {
        if(!isEmpty())
        {
            for(Integer k: cache.keySet())
            {      
                otherCache.add(cache.get(k));
            }
        }
    }
    
    public String toString()
    {
        return cache.toString().replace("=",":");
    }
}
