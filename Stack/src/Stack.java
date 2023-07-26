public class Stack {
    private class Node{
        private int item;
        private Node next;
        private Node pre;

        public Node(int item){
            this.item = item;
        }
    };

    private Node top = null ;
    private Node bottom = null;
    // private Node stack = top;

    public void push(int item){
        var node = new Node(item);
        if(isEmpty()){
            top = bottom = node;
        }
        else{
            top.next = node;
            node.pre = top;
            top = node;
        }
        
    }
    
    public int pop(){
        int delVal = -1; 
        if (isEmpty()){
            System.out.println("Stack under flow");
        }
        else{
            delVal = top.item;
            Node temp = top.pre;
            top = temp;
            top.next = null;
        }
        return delVal;
    }

    public void display(){
        while(bottom != null){
            System.out.println(bottom.item);
            bottom = bottom.next;
        }
    }
    public boolean isEmpty(){
        return top == null;
    }
    
}





















