import java.util.HashMap;

public class hash1 {

    public static void main(String[] args) {
        
        // Create a hash map to store book titles and shelf number 
        HashMap<String , Integer> library = new HashMap<>();

        // Add book to the library 
        library.put("Harry Potter" , 1);
        library.put("Hopper and Bolt" , 2);
        library.put("Majesty and City", 3);
        library.put("The Avengers" ,4);
        library.put("Super Man & Batman" , 5);
        library.put("Wonder Woman", 6);


        // Find a book's Shelf 
        System.out.println("Harry Potter is on Shelf : " + library.get("Harry Potter"));
        System.out.println("Hopper and Bolt is on Shelf : " + library.get("Hopper and Bolt"));
        System.out.println("Majesty and City is on Shelf : " + library.get("Majesty and City"));
        System.out.println("The Avengers : " + library.get("The Avengers"));
        System.out.println("Super Man & Batman : " + library.get("Super Man & Batman"));
        System.out.println("Wonder Woman : " + library.get("Wonder Woman"));
        
    }
}