import java.util.Scanner;


class q1{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int age      = scan.nextInt();
        scan.nextLine();
        String name  = scan.nextLine();

        System.out.println("My age is "+age);
        System.out.println("My name is "+name);
        
    }
}

class q2{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String Na = input.nextLine();

        System.out.println("Enter your Score:");
        Double Sco = input.nextDouble();

        input.nextLine(); // Corrected method call
        System.out.println("Enter your Department:");
        String Dp = input.nextLine();
    }




    
}