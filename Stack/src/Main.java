public class Main {
    public static void main(String arg[]){
        var stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();
        
    }
}
