import java.util.LinkedList;

class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class HashTable<K, V> {
    private LinkedList<KeyValuePair<K, V>>[] table;
    private int capacity;
    private int size;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new LinkedList[capacity];
    }

    private int hashFunction(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = hashFunction(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (KeyValuePair<K, V> pair : table[index]) {
            if (pair.getKey().equals(key)) {
                pair = new KeyValuePair<>(key, value);
                return;
            }
        }

        table[index].add(new KeyValuePair<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> list = table[index];

        if (list != null) {
            for (KeyValuePair<K, V> pair : list) {
                if (pair.getKey().equals(key)) {
                    return pair.getValue();
                }
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hashFunction(key);
        LinkedList<KeyValuePair<K, V>> list = table[index];

        if (list != null) {
            for (KeyValuePair<K, V> pair : list) {
                if (pair.getKey().equals(key)) {
                    list.remove(pair);
                    size--;
                    return;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

// Example usage
public class QuestionTwo {
    public static void main(String[] args) {
        HashTable<String, Integer> hashtable = new HashTable<>(10);

        hashtable.put("Harshal", 25);
        hashtable.put("Milind", 30);
        hashtable.put("Prabhu", 28);

        System.out.println("Hashals's age is: " + hashtable.get("Harshal"));

        hashtable.remove("Milind");

        System.out.println("Size of the hashtable: " + hashtable.size());
        System.out.println("Is the hashtable empty? " + hashtable.isEmpty());
    }
}
