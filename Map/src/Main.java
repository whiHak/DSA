import java.util.Scanner;
// map file
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the map: ");
        int size = scanner.nextInt();
        Map map = new Map(size);

        while (true) {
            System.out.println("Enter an option:");
            System.out.println("1. Add an element to the map");
            System.out.println("2. Retrieve an element from the map");
            System.out.println("3. Quit");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter the key: ");
                String key = scanner.next();
                System.out.print("Enter the value: ");
                String value = scanner.next();
                map.put(value, key);
            } else if (option == 2) {
                System.out.print("Enter the key: ");
                String key = scanner.next();
                String value = map.get(key);
                if (value != null) {
                    System.out.println("Value for key " + key + ": " + value);
                } else {
                    System.out.println("Key not found");
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
