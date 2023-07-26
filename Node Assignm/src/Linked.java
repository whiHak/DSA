
public class Linked {
    private class Node{
        public int value;
        int nodeNO;
        public Node next;
    
        public Node(int value){
            this.value = value;
            this.nodeNO = 0;
        }
    }
    private Node first;
    private Node last;

    public void add(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
            node.nodeNO = first.nodeNO + 1;
        } else {
            last.next = node;
            node.nodeNO = last.nodeNO + 1;
            last = node;
        }
    }

    private boolean isEmpty() {
        return (first == null);
    }
    void updateNodesNO(){
        var node = first;
        while(node.next != null){
            node.next.nodeNO = node.nodeNO + 1;
            node = node.next;
        }
        last = node;
    }

    public void deleteTheMiddle() {

        var node = first;
        int middleNodeNo = ((first.nodeNO + last.nodeNO) / 2) + 1;

        while (middleNodeNo != (node.next).nodeNO) { // got the previous node
            node = node.next;
        }

        var temp = node.next;
        node.next = temp.next;
        temp = null;
        updateNodesNO();
    }

    public void reverseLinkedList() {
        Node current = first;
        Node previous = null;

        while (current != null) {
            var temp = current.next;
            current.next = previous;

            previous = current;
            current = temp;
            
        }
        first = previous;
    }

    public void displayNodes() {
        var node = first;

        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }

    }
    public static void main(String[] arg) {
        Linked lists = new Linked();
        lists.add(10);
        lists.add(20);
        lists.add(30);
        lists.add(40);
        lists.add(50);
        lists.add(60);

        lists.deleteTheMiddle();
       // lists.deleteTheMiddle();
        lists.displayNodes();

    }
    
}


 
