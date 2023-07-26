class Doubly extends Singly {
    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node(item);

        if(first  == null)
            first = last = node;
        else{
            last.next = node;
            node.pre = last;
            last = node;    
        }

    }

    public void addFirst(int item){
        var node = new Node(item);

        if(first == null){
            first = last = node;
        }
        else{
            first.pre = node;
            node.next = first;
            first = node;
        }
    }
    
    public void removeItem(int item){
        
    }
    public void displayNodes(){
        var node = first;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
        
    }
}
