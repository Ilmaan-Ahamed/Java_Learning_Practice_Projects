// - Create a class called "Find" with main function
// - Create a function called evenoradd with int prameter called int num
// - Inside main function get integer input from user 
// - Pass that function to the evenoradd funciton and let the fucntion decide whather the number is even or odd


import java.util.Scanner; 

public class CC4p1q1 {
    void evenoradd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Number ");
        int number  = scan.nextInt();

        CC4p1q1 obj1 = new CC4p1q1();
        obj1.evenoradd(number);
    }
}

