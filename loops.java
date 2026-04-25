import java.util.Random;
import java.util.Scanner;


// Nested For Loop 

// Teacher 1 : Asked you wirte the word pen 5 times
// Teacher 2 : Asked you wirte the word pen 5 times
class NestForLoop1 {
    public static void main(String[] args) {
        
        for(int Teacher=1; Teacher<=2; Teacher=Teacher+1)
            {
                for(int count=1; count<=5; count=count+1)
                    {
                        System.out.println("Pen");
                    }
                System.out.println("-----");
            }
    }
    
}

//  *  *  *
//  *  *  *
//  *  *  *
class NestForLoop2{
    public static void main(String[] args) {
    
        String s = "* ";
        for(int j = 1; j <= 3; j++)
            {
                for(int i = 1; i <= 3; i++)
                    { 
                        System.out.print("* ");

                    }
                    System.out.println();
            }
    }
}


// *
// * *
// * * *
class NestForLoop3{
    public static void main(String[] args) {
        for(int j=1; j<=3; j=j+1)
            {
                for(int i=1; i<=j; i=i+1)
                    {
                        System.out.print("* ");
                    }
                System.out.println();
            }
    }
}

//  -- While Loop --
// Print 1 to 10 in while loop

class Whileloop1{
    public static void main(String[] args) {
        
        int j = 1;
        while(j <= 10){
                System.out.println(j);
                j=j+1;
    }
    }
}


// Generate a random number until the number generated random number is 5

class Whileloop2{
    public static void main(String[] args) {
        Random rand = new Random();
        int num = 0;  // Frist number

        while (num != 5)  
            {
                num = rand.nextInt(11); // last number
                System.out.println(num);
            }
    }
}

//  --- Do While loop ---

class DoWhileLoop{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        do{
            System.out.println("Enter the Number > 10 : ");
            count =scan.nextInt();
          }
          while (count < 10); // Correctly use lowercase 'while'

          System.out.println("You entered a valid number: " + count);
          scan.close(); // Close the scanner to avoid resource leaks
      }
    }

// Enhanced for loop 
class Enhancedforloop{
    public static void main(String[] args) {
        
        int num[] = {12,34,56,78,54,21};
        System.out.println(num);
        
        for(int Var : num)
            {
                System.out.println(Var);
            }

    }
}