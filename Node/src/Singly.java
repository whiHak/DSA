class Singly extends Linked{
    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);
        
        if (isEmpty())
            first = last = node;
        else 
            last.next = node;
            last = node;
   }
  
   public void addFirst(int item){
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
    }
    
    private boolean isEmpty(){
        return (first == null);
    }
    
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while(current != null){
            if (current.value == item) 
                return index;
            current = current.next;
            index++;
        }
        return -1;

    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        // [ 10 -> 20 -> 30]
        if(first == last){
            first = last = null;
        }
        else{ 
            var temp = first.next;
            first.next = null;
            first = temp; 
        }
    }

    public void removeLast(){
        var current = first; 

        if (first == last){
            first = last = null;
            return;
        }

        while(current.next != null ){
            if(current.next == last){
                last = current;
                break;
            }   
            current = current.next;
        }
        last.next =null;
    }

    public void removeItem(int item){
        //[10 -> 20 -> 30 ]
        var current = first.next;
        var previous = first;

        while(current != null){
            if(item == first.value){
                first = current;
                previous = null;
                 break;
            }
            if(current.value == item){
                previous.next = current.next;
                current = null;
                break;
            }

            current = current.next;
            previous = previous.next;       
        }
    }

    public void displayNodes(){
        var node = first;
        
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
        
    }

}
