
/**
 * This is my Pair<K, V> class. K represents the key type and V represents
 * the value type. There are also getters and setters for the key and values and 
 * a toString() method to print the key-value pair.
 */
public class Pair<K, V>
{
    private K key;
    private V value;
    public static final String HEADING_BLURB = "Key:Value Pair - ";
    public static final String KEY_VAL_SEPARATOR = ":";
    public static final String NEW_LINE = "\n";
        
    public Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    
    public void setKey(K newKey)
    {
        key = newKey;
    }

    public void setValue(V newValue)
    {
        value = newValue;
    }
    
    public K getKey()
    {
        return key;
    }
    
    public V getValue()
    {
        return value;
    }
    
    public String toString()
    {
        return HEADING_BLURB + key + KEY_VAL_SEPARATOR + value + NEW_LINE;
    }
}
