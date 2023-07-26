
public class Main {
    public static void main(String[] arg){
        Doubly lists = new Doubly();
        //Singly list = new Singly();
        lists.addLast(10);
        lists.addLast(20);
        lists.addLast(30);
        lists.addLast(40);

        lists.displayNodes();
        lists.removeItem(40);
        lists.displayNodes();
        
    }

}
