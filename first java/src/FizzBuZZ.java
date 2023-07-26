import java.util.Scanner;

public class FizzBuZZ {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Number: ");
        int number = scanner.nextInt();

        String outPut = (number % 5 == 0) && (number % 3 == 0) ?  "FizzBuzz" : "Buzz";
        outPut = (number % 5 == 0) && (number % 3 != 0) ? "fizz" : outPut;
        outPut = (number % 3 != 0) && (number % 5 != 0) ? "" + number : outPut;

        System.out.println(outPut); 
    }
    
}
