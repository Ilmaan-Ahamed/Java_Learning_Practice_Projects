import java.util.HashMap;
import java.util.Scanner;

class hash2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap <String, String> movielist = new HashMap<>();

        // Add Movies  
        movielist.put("Master", "Screen 1 ");
        movielist.put("Retro", "Screen 2 ");
        movielist.put("Kalki", "Screen 3 ");
        movielist.put("War 2", "Screen 4");
        movielist.put("Coolie", "Screen 5");

        // System.out.println("Master Movie is playing on : "+ movielist.get("Master"));
        // System.out.println("Retro Movie is playing on : "+ movielist.get("Retro"));
        // System.out.println("kalki  Movie is playing on : "+ movielist.get("kalki"));
        // System.out.println("War 2  Movie is playing on : "+ movielist.get("War 2"));
        // System.out.println("Coolie  Movie is playing on : "+ movielist.get("Coolie"));

        // Check for a Movie using if contiion & Scanner
        // To get the input
        System.out.println("Enter Movie Name : ");
        String movlist = scan.nextLine();

        // Set var for if & connet the input
        String Sermov = movlist;

        if (movielist.containsKey(Sermov)) 
            {
                System.out.println(Sermov + " This Movie playing on " + movielist.get(Sermov));
            }
        else
            {
                System.out.println(Sermov + " This Movie Not Avalivable ");
            }

        // Display all movies 

        System.out.println("\nAll Today Playing Movies :");
            for(String name : movielist.keySet())
                {
                    System.out.println("Movie: " + name + " Location : " + movielist.get(name));
                }
    

    }
}