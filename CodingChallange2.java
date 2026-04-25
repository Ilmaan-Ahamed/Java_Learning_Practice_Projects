import java.net.Socket;
import java.util.Scanner;


class Person{
    public    String name;
    protected int    age;
    private   String SocialSeurityNumber;
    String           address;

    Person(String name, int age, String ssn, String  address)
        {
            this.name = name;
            this.age  = age;
            this.SocialSeurityNumber = ssn;
            this.address = address;
            
        }
    
    public String getSSN()
        {
            return SocialSeurityNumber;
        }
}

class employee extends Person{

    employee(String name, int age, String ssn, String  address)
        {
            super(name, age, ssn, address);
            System.out.println("===========================");
            System.out.println("Employee Details");
        }

    // Method to Display 
    void display()
        {
            System.out.println();
            System.out.println("Name    : " +name);
            System.out.println("Age     : " +age);
            System.out.println("Address : " +address );
            System.out.println("SSN     : "+getSSN());
            System.out.println();
            System.out.println("===========================");
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take Input for all attribues;
        System.out.println("Enter Emp Name : ");
        String na = scan.nextLine();

        System.out.println("Enter Emp Age : ");
        int ag = scan.nextInt();

        System.out.println("Enter Emp SSN : ");
        String ssn = scan.nextLine();

        System.out.println("Enter Emp Address : ");
        String ad = scan.nextLine();

        // Create object with user input
        employee e1 = new employee(na, ag, ssn, ad);

        // Display Data
        e1.display();
        
    }
}