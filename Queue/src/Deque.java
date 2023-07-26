public class Deque {
    String [] arr;
    private int front = -1;
    private int rear = -1;
    private int size;

    Deque(int size){
        this.size= size;
        String [] arr = new String [size];
        this.arr = arr;
    }

    public int size(){
        int i = front, j = 0 ;

        while(arr[i] != null){
            i++;
            j++; // two condition because in case we use removeFront() front may not be equal to 0
        }                       
        return j;
        
    }

    public boolean isEmpty(){
        return  (front == -1 && rear == -1) || size() == 0;
    }

    public void addRear(String item){
        if ((rear+1 == size))
            return;
        else if (isEmpty())
            rear = front = 0;
        else
            rear++;
        
        arr[rear] = item;
    }
    
    public void addFront(String item){
        if(isEmpty())
            addRear(item);
        else{
            int i = rear;

            while(i >= 0){
                arr[i+1] = arr[i]; // shifts all elements one index forward
                i--;
                 
            }
            rear++;
        }
        
       arr[0] = item;
 
    }
    
    public String removeFront() {
        String x = null;

        if( isEmpty() )
            return x;
        else{
            x = arr[front];
            front++;
        }
        return x;
    }
    public String removeRear(){
        String rItem = arr[rear];
        arr[rear] = null;
        rear--;
        return rItem;
    }
    
    
    public void display(){
        System.out.println("Queue list");
        if(size() == 0){
            System.out.println("Nothing to diplay!!!");
            return;
        }
        for(int i = front ; arr[i] != null; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Deque list = new Deque(10);
        list.addRear("10");
        list.addRear("20");
        list.addRear("cat");
        list.addRear("Dog");
        list.addRear("Rat");
        list.addRear("You");
        list.addFront("front");
        
        list.removeFront();
        list.removeFront();
        list.removeFront();
        list.removeRear();
        list.removeRear();
        list.removeFront();
        list.removeFront();


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.display();

    }

}