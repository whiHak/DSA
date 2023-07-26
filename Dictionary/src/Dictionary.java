public class Dictionary {
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
 
    private Entry[] buckets;
    private int size;
  
    public Dictionary(int size) {
      this.size = size;
      this.buckets = new Entry[size];
    }
  
    // add words to the dictionary 
    public void put(String key, String value) {
      int index = getIndex(key);
      Entry head = this.buckets[index];
      while (head != null) {
        if (head.key.equals(key)) {
          head.value = value;
          return;
        }
        head = head.next;
      }
      this.buckets[index] = new Entry(key, value, buckets[index]);
    }
  
    // retrieve words from the dictionary 
    public String get(String key) {
      int index = getIndex(key);
      Entry head = buckets[index];
      while (head != null) {
        if (head.key.equals(key)) {
          return head.value;
        }
        head = head.next;
      }
      return null;
   }
  
   // calculate index positions 
   public int getIndex(String key) {
      return Math.abs(key.hashCode() % size);
    }
  
   // create an inner class Entry in MyDictionary 
   
  }