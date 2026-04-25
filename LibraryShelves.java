import java.util.LinkedList;
import java.util.Scanner;

public class LibraryShelves {

    // Define a Hash table with linked lists for chaning 
    private LinkedList<String> [] shelves;

    public LibraryShelves(int size){

        // Conent the shevle variable to new linklist use parmertize fucntion size 
        shelves = new LinkedList[size];

        // iniziating size using for loop 
        for(int i=0; i<size; i++)
            {
                // Size by shelves index count 
                shelves[i] = new LinkedList<>();
            }
    }

    // Hash Fuction : calculate shelf number 
    private int hashFunction(String bookTitle){

        // get the book title(letters) and divied shelves size ______---
        return bookTitle.length() % shelves.length;
    }

    // Add a book to the hash Table the Variable is "Book title" 
    public void addBook(String bookTitle){

        // Create the Shelf by BookTitle 
        int shelfNumber = hashFunction(bookTitle);

        // add the book to divied shelves _______---
        shelves[shelfNumber].addLast(bookTitle);
    }

    // Display the books on each shelf
    public void displayShelves(){
        for (int i=0; i<shelves.length; i++)
            {
                System.out.println("Shelf " + i + " : " +shelves[i]);    
            }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in)

        // Create a library with 5 shelves / OBj for class 
        LibraryShelves library = new LibraryShelves(6);

        // Enter book name 
        System.out.println("Enter Book Name");
        String libinpu = scan.nextLine();

        // Connect the objet with 
        libinpu.has

        library.addBook("The Avengers");
        library.addBook("The Shannara Chronicles");
        library.addBook("National Treasure");
        library.addBook("Harry Potter");
        library.addBook("One Piece");

        // Display The Book on each shelf
        library.displayShelves();
        

    }
}