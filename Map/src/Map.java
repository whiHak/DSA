public class Map {
    //create an inner class Entry in MyMap
    private static class Entry {
    String key;
    String value;
    Entry next;
    
    private Entry(String key, String value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
    }
    private int size;
    private Entry[] buckets;

    public Map(int size) {
        this.size = size;
        this.buckets = new Entry[size];
    }

    //add elements to the Map
    public void put(String value, String key) {
        int index = getIndex(key);
        Entry head = buckets[index];
        while (head != null) {
        if (head.key.equals(key)) {
            head.value = value;
            return;
        }
        head = head.next;
        }
        buckets[index] = new Entry(key, value, buckets[index]);
    }

    //retrieve elements from the Map
    public String get(String key) {
        int index = getIndex(key);
        Entry head = buckets[index];
        while (head != null) {
        if (head.key.equals(key)) {
            return head.value;
        }
        head = head.next;
        }
        return "NO value associated with this " + key;
    }

    //calculate index positions
    private int getIndex(String key) {
        return Math.abs(key.hashCode() % size);
    }

    
}