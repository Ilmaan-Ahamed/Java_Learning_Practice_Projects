import java.util.LinkedList;
import java.util.Scanner;

public class BookHashTable {
    private LinkedList<String>[] shelves;
    private int numShelves;
    
    // Constructor
    @SuppressWarnings("unchecked")
    public BookHashTable(int size) {
        this.numShelves = size;
        this.shelves = new LinkedList[size];
        
        // Initialize each shelf as an empty LinkedList
        for (int i = 0; i < size; i++) {
            shelves[i] = new LinkedList<>();
        }
    }
    
    // Hash function to determine shelf number
    private int hashFunction(String bookTitle) {
        int hash = 0;
        
        // Simple hash: sum of ASCII values of characters
        for (int i = 0; i < bookTitle.length(); i++) {
            hash += bookTitle.charAt(i);
        }
        
        // Use modulo to ensure the result fits within our shelf array
        return hash % numShelves;
    }
    
    // Your existing addBook method
    public void addBook(String bookTitle) {
        // Create the Shelf by BookTitle 
        int shelfNumber = hashFunction(bookTitle);
        
        // Add the book to divided shelves
        shelves[shelfNumber].addLast(bookTitle);
        System.out.println("Added '" + bookTitle + "' to shelf " + shelfNumber);
    }
    
    // Method to search for a book
    public boolean findBook(String bookTitle) {
        int shelfNumber = hashFunction(bookTitle);
        return shelves[shelfNumber].contains(bookTitle);
    }
    
    // Method to remove a book
    public boolean removeBook(String bookTitle) {
        int shelfNumber = hashFunction(bookTitle);
        boolean removed = shelves[shelfNumber].remove(bookTitle);
        if (removed) {
            System.out.println("Removed '" + bookTitle + "' from shelf " + shelfNumber);
        } else {
            System.out.println("Book '" + bookTitle + "' not found");
        }
        return removed;
    }
    
    // Method to display all books on each shelf
    public void displayAllBooks() {
        for (int i = 0; i < numShelves; i++) {
            System.out.println("Shelf " + i + ": " + shelves[i]);
        }
    }
    
    // Interactive method to get user input
    public void interactiveMode() {
        Scanner scanner = new Scanner(System.in);
        String command;
        
        System.out.println("Book Hash Table - Interactive Mode");
        System.out.println("Commands: add, find, remove, display, quit");
        
        while (true) {
            System.out.print("\nEnter command: ");
            command = scanner.nextLine().toLowerCase().trim();
            
            switch (command) {
                case "add":
                    System.out.print("Enter book title: ");
                    String bookToAdd = scanner.nextLine().trim();
                    addBook(bookToAdd);
                    break;
                    
                case "find":
                    System.out.print("Enter book title to search: ");
                    String bookToFind = scanner.nextLine().trim();
                    if (findBook(bookToFind)) {
                        System.out.println("Book found!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                    
                case "remove":
                    System.out.print("Enter book title to remove: ");
                    String bookToRemove = scanner.nextLine().trim();
                    removeBook(bookToRemove);
                    break;
                    
                case "display":
                    displayAllBooks();
                    break;
                    
                case "quit":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid command. Use: add, find, remove, display, quit");
            }
        }
    }
    
    // Simplified method to get book input from user
    public void getUserBooks() {
        Scanner scanner = new Scanner(System.in);
        String bookTitle;
        
        System.out.println("=== Book Library System ===");
        System.out.println("Enter book titles (type 'done' when finished):");
        
        while (true) {
            System.out.print("Enter book title: ");
            bookTitle = scanner.nextLine().trim();
            
            if (bookTitle.equalsIgnoreCase("done")) {
                break;
            }
            
            if (!bookTitle.isEmpty()) {
                addBook(bookTitle);
            } else {
                System.out.println("Please enter a valid book title.");
            }
        }
        
        System.out.println("\n=== Your Library ===");
        displayAllBooks();
        scanner.close();
    }
    
    // Main method - focuses on user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Let user choose number of shelves
        System.out.print("How many shelves would you like in your library? ");
        int numShelves = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Create hash table with user-specified size
        BookHashTable library = new BookHashTable(numShelves);
        
        // Get books from user
        library.getUserBooks();
        
        // Optional: Start interactive mode for more operations
        System.out.print("\nWould you like to continue with more operations? (y/n): ");
        String choice = scanner.nextLine().trim().toLowerCase();
        
        if (choice.equals("y") || choice.equals("yes")) {
            library.interactiveMode();
        } else {
            System.out.println("Thank you for using the Book Library System!");
            scanner.close();
        }
    }
}