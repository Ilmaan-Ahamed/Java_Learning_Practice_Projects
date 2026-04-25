import java.io.NotActiveException;
import java.util.InputMismatchException;
import java.util.Scanner;

interface A {
    void disp();
}
     class LambdaExp{
        public static void main(String[] args) {
            
            A obj = new A() {
                
                public void disp()
                    {
                        System.out.println("This Function is Work Perfecly");
                    }
                            };

                obj.disp();

                    }
    }

// Exception Handling 
// 1. Input Mismatch Exception 
class ExpHadling1{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int a  = scan.nextInt();
            } 
        catch (InputMismatchException a) {
            System.out.println(a);
                        }
    }
}

// 2. Arithmetic Exception
class ExpHadling2{
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Input Number : ");
            int Y = 10/2;
            } 
        catch (ArithmeticException Y) {
            System.out.println(Y);
                        }
    }
}

// Write a program that take two integers as input and Perform Division
// Arithmetic Exception for Division By "10/0" Zero.
// Input Mismatch Exception if the user input a Non - integer value 

class ExpQ2{
    public static void main(String[] args) {
        
        Scanner val = new Scanner(System.in);

        System.out.println("Enter Num 1 : ");
        int a = val.nextInt();

        System.out.println("Enter Num 2 : ");
        int b = val.nextInt();

        System.out.println();
        int c = 0;

        try {
            
            c = a/b;
            System.out.println(" Divison of Num 1 / Num 2 :  " +c);
            } 
        catch (ArithmeticException e){
                System.out.println("Arithmetic Exception  error, Plese Chcek your input ");
                }

        catch (InputMismatchException e){
            System.out.println("Arithmetic Exception  error, Plese Chcek your input ");
        }
    }
}


// Custom Exception Handling 

class NotValidExp extends Exception{
    
    public NotValidExp(String s)
        {
            super(s);
        }
}

class CosExpHand{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter Age : ");
            int age = scan.nextInt();

            if (age < 18) 
                {
                    throw new NotValidExp("Your age Should Be above 18 ");      
                }
            else    
                {
                    System.out.println(" Your age higher than 18");
                }

             } 
        catch (NotValidExp e) 
            {
                System.out.println(e);
            }

        catch (Exception e)
            {
                System.out.println(e);
            }
    }
}