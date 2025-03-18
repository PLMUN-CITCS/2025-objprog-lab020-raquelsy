import java.util.Scanner;

public class MenuHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Clear invalid input
            }
        }
    }
    
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
    }
    
    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        
        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
    
    public static void greetUser() {
        System.out.println("Hello! Hope you're having a great day!");
    }
    
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is an even number.");
            } else {
                System.out.println(num + " is an odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
    }
}
