import java.util.Scanner;
import java.net.Socket;
import java.util.ArrayList;

class codechallange1 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your score: ");
    int Score = scan.nextInt();

    
    if(Score >=70)
    {
        System.out.println("Excellent Performance");
    }
        else if(Score >=50 && Score <= 70)
        {
            System.out.println("Good Performance");
        }
        else if(Score <= 50)
        {
            System.out.println("You need to improve your performance");
        }
    else
    {
        System.out.println("Invalid Score");
    }
    }
}

class codechallange2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int a = scan.nextInt();

        System.out.println("Enter Second Number : ");
        int b = scan.nextInt();

        for(int i=a; i<=b; i++)
        {
            System.out.println("Number is: "+ i);
        }

    }
}

// Print Even Number Between 1 to 10 using for loop & if else
class codechallange3 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i=i+2)
            {
                System.out.println("Even num of 0 to 10 " +i );
            }
    }
}

// Count the number of odd number form 1 to 10
class codechallange4{
    public static void main(String[] args) {
        int  oddcount = 0;
        int  evencount =0;

        for(int i=1; i<=10; i=i+1)
            {
                if(i%2==0)
                    {
                        System.out.println("even number " +i);
                        evencount = evencount +1;
                    }
                else
                    {
                        oddcount = oddcount+1;
                        System.out.println("Odd number " +i);
                    }
                System.out.println("The odd count of 1-10: " +oddcount);
                System.out.println("The even count of 1-10: " +evencount);
            }
    }
}

//Print the Number Whcich are divisible by both 3 & 5 Range 1 to 100
class codechallange5{
    public static void main(String[] args) {
        int divcount = 0;
        int Ndivcount = 0;
        for(int i=1; i<=100; i++)
        {
            if(i%3 == 0 && i%5==0)
                {
                    System.out.println("The both Number are divisal by " +i);
                    divcount = divcount +1;
                }

                else
                {
                    System.out.println("The both Number are Not divisal By " +i);
                     Ndivcount = Ndivcount +1;
                    
                }
        System.out.println("The Divisal count " +divcount);
        System.out.println("The Not Divisal count " +Ndivcount);
        }
    }
}

class codechallange6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // STEP 1 Get input for size for size of array 
        
        System.out.println("Enter the size of the array: ");
        System.out.println("Do You Want Middle Number Declare Size in ODD Number ");
        int size = scan.nextInt();

        // STEP 2 Create an array of that size
        int[] array = new int[size];

        // STEP 3 Get input for each elemnet int the array in for loop
        for(int i=0 ; i<size; i++)
            {
                System.out.println("Enter Number " + (i+1)+ " :");
                array[i] = scan.nextInt();
            }
        
        // STEP 4 Print the all array for refernce using for loop
        System.out.println("\n");
        for(int i=0; i<size; i++)
            {
                System.out.println("Array of " +i + ": " + array[i]);
            }
            System.out.println("\n");

        // STEP 5 Find the Middle Element 
        int midnum = array.length/2;
        int numOMID = array[midnum];
        System.out.println("The Middle Number is " +numOMID ) ;
     

    }
}

class codechallange7 {
    void evenorodd(int num)
        {
            if (num %2 == 0) 
                {
                    System.out.println("Even Number");
                }
            else
                {
                    System.out.println("ODD Number");
                }
        }
    
    public static void main(String[] args) {

        // Create the Input Scanner
        Scanner scan = new Scanner(System.in);

        // input Var name : 
        System.out.println("Enter The NUmber : ");
        int number  = scan.nextInt();

        // Create the objet for Class
        codechallange7 obj1 = new codechallange7();

        // Connect the Objet with void Fuction & input Variable
        obj1.evenorodd(number);
    }
}

class codechallange8{

    String passorfail(int score)
        {
            if (score >=35) 
                {
                    return "Pass";
                }
            else
                {
                    return "Fail";
                }
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter total Mark");
        int totmark = scan.nextInt();

        codechallange8 obj1 = new codechallange8();

        // Create the Specific Variable for the connection with object & Fuction & Input Variable
        String result =  obj1.passorfail(totmark);

        System.out.println(result);


    }
}

// Coding Chalange 8
    class vehicle {
        String brand;
        int year;
    
        void startengine() { }
    }
    
    class car extends vehicle {
        String fuletype;
    
        @Override
        void startengine() {
            System.out.println("Car engine Starts...");
        }
    
        void drive() {
            System.out.println("Car is driving >.>.>.");
        }
    }
    
    class truck extends vehicle {
        int loadcapcity;
    
        @Override
        void startengine() {
            System.out.println("Truck Engine Starts.....");
        }
    
        void hual() {
            System.out.println("Truck is hauling >.>.>.");
        }
    }
    
     class e {
        public static void main(String[] args) {

            car c1 = new car();
            c1.brand = "BMW M3";
            c1.fuletype = "Petrol";
            c1.year = 2025;

            System.out.println(c1.brand);
            System.out.println(c1.year);
            c1.startengine();
            c1.drive();  
            
            System.out.println("=========================");

            truck t1 = new truck();

            t1.brand = "leyland";
            t1.year = 2020;
            t1.loadcapcity = 200-000;

            System.out.println(t1.brand);
            System.out.println(t1.loadcapcity);
            System.out.println(t1.year);
            t1.startengine();
            t1.hual();
        }
    }
    

// coding challange 10



class Person {
    public String name;
    protected int age;
    private String SocialSeurityNumber;
    String address;

    Person(String name, int age, String ssn, String address) {
        this.name = name;
        this.age = age;
        this.SocialSeurityNumber = ssn;
        this.address = address;
    }

    // Getter for private variable
    public String getSSN() {
        return SocialSeurityNumber;
    }
}

class employee extends Person {

    employee(String name, int age, String ssn, String address) {
        super(name, age, ssn, address);
        System.out.println("Hello Employee");
    }

    // Method to Display 
    void display() {
        System.out.println("Name    : " + name);     // public
        System.out.println("Age     : " + age);      // protected
        System.out.println("Address : " + address);  // default access
        System.out.println("SSN     : " + getSSN()); // private → via getter
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take inputs for all attributes
        System.out.print("Enter Emp Name : ");
        String na = scan.nextLine();

        System.out.print("Enter Emp Age : ");
        int ag = scan.nextInt();
        scan.nextLine(); // consume leftover newline

        System.out.print("Enter Emp SSN : ");
        String ssn = scan.nextLine();

        System.out.print("Enter Emp Address : ");
        String ad = scan.nextLine();

        // Create object with user input
        employee e1 = new employee(na, ag, ssn, ad);

        // Display data
        e1.display();
    }
}

