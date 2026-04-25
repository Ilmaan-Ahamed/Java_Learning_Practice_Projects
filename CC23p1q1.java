// Get input for variable a and b and print the number from a to b 

import java.util.Scanner;

class CC23p1q1 {
    public static void main(String[] args) {
        
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter Frist Number :");
            int a = num.nextInt();

            System.out.println("Enter Last Number :");
            int b = num.nextInt();

            for(int i=a; i<=b ; i=i+1)
            {
                System.out.println(i);
            }
        }
    }
}
