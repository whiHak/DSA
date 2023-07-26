public class ArrayList {
    private int[] array;
    private int size;

    ArrayList(int size) {
        this.array = new int[size];
        this.size = 0;
    }

    // add elements to the list
    public void add(int element) {
        if (this.size == this.array.length) {
            int[] tempArray = new int[(this.array.length) * 2];
            System.arraycopy(this.array, 0, tempArray, 0, this.array.length);
            this.array = tempArray;
        }
        this.array[this.size] = element; 
        this.size++;
    }

    // retrieve elements from the list
    public int get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[index];
    }
}