import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the dictionary: ");
        int size = scanner.nextInt();
        Dictionary dictionary = new Dictionary(size);

        while (true) {
            System.out.println("Enter an option:");
            System.out.println("1. Add a word to the dictionary");
            System.out.println("2. Retrieve a word from the dictionary");
            System.out.println("3. Quit");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter the word: ");
                String word = scanner.next();
                System.out.print("Enter the definition: ");
                String definition = scanner.next();
                dictionary.put(word, definition);
            } else if (option == 2) {
                System.out.print("Enter the word: ");
                String word = scanner.next();
                String definition = dictionary.get(word);
                if (definition != null) {
                    System.out.println("Definition for " + word + ": " + definition);
                } else {
                    System.out.println("Word not found");
                }
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}