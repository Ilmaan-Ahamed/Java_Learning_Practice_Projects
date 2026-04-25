
import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

class ifelseComOper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Mark:");
        int mark = scan.nextInt();
        if (mark >35) 
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }    
}


class ifelseComOper1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Income:");
        int income = scan.nextInt();

        if (income>7000) 
        {
            System.out.println("Scholaship is available");        
        }
        else 
        {
            System.out.println("Scholaship is not available");
        }
    }
}

class logicalOper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Sports");

        boolean sports1 = scan.nextBoolean(); // Assuming input is true or false
        boolean sports2 = scan.nextBoolean(); // Assuming input is true or false
        if (sports1 && sports2) 
        {
            System.out.println("You are a sports person");
        }
        else 
        {
            System.out.println("You are not a sports person");
        }
    }
}

class divisal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num  = scan.nextInt();
        if(num % 3 == 0 && num % 5 ==0 )
        {
            System.out.println("Number is Divisible by 3 and 5");
        } 
        else 
        {
            System.out.println("Number is not Divisible by 3 and 5");
        }
    }
}

class evenodd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num = scan.nextInt();
        if(num % 2 ==0)
        {
            System.out.println("Number is Even");
        } 
        else 
        {
            System.out.println("Number is Odd");
        }
    }
}

// Nested ifelse Get boolean input
class Nestedifelse{
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String Username = scan.nextLine(); 

        System.out.println("Welcome " + Username + " to KFC");
        System.out.println("Are you like KFC true/false :");

        // Get Boolean Input
        Boolean userInput = scan.nextBoolean(); // Get Boolean Input 
        if (userInput== true)
        {
            System.out.println("Well Your in Best Place");
            System.out.println("Dear" +   Username  + "Do you like Chicken true/false ?");
            System.out.println("===================================");

            boolean chikInput = scan.nextBoolean(); // Get Boolean Input
            if (chikInput) {
                System.out.println("You are a Chicken Lover");
                System.out.println();
                System.out.println("Can You try Pepsi !");
                System.out.println("===================================");
                System.out.println("Do you Like Pepsi true/false");
                boolean pepsiInput = scan.nextBoolean(); // Get Boolean Input
                if (pepsiInput) {
                    System.out.println("You are a Pepsi Lover");
                    System.out.println("Please Visit Again");
                } else {
                    System.out.println("Well Try Pepsi Next Time");
                    System.out.println("Please Visit Again");
                    System.out.println("===================================");
                }
            } else {
                System.out.println("You are not a Chicken Lover");
                System.out.println("Please Visit Again");
                System.out.println("===================================");
            }
            
            if (!userInput) { // Replace else(userInput == false) with this condition
                System.out.println("Dear " + Username + ", You are not a KFC Lover");
                System.out.println("Please Visit Again");
            }
        }
        else{
            System.out.println("Dear " + Username + ", You are not a KFC Lover");
            System.out.println("Please Visit Again");
            } 
        
    }
}

class tenry{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the weather condition (true for rain, false for no rain):");
        boolean rain = scan.nextBoolean();
        
        
        String weather = rain ? "It's raining, take an umbrella!" : "It's not raining, no need for an umbrella.";
        System.out.println(weather);
    }
}

class tenry2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter num 2: ");    
        int num2 = scan.nextInt();


        String lagest = (num1 > num2) ? "num1 " + num1 + " is big" : "num2 " + num2 + " is big";
        System.out.println(lagest);
    }
}

class floo{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            {
                System.out.println("Hello World " + i);
            }
    }
}

class batch{

    batch(String name)
        {
            System.out.println(name);
        }
    }
class Department extends batch{
    Department()
        {
            super("ilmaan");
            System.out.println("IT SOFTWARE ENGINEERING");
        }

    public static void main(String[] args) {
       
        Department d1 = new Department();

     System.out.println(d1);
    }
}