// Get input for two integer number and number is greater using ternary Operator

import java.util.Scanner;

class TernaryOP2 {
    public static void main(String[] args) {

        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter Number 1 :");
            int num1 = num.nextInt();

            System.out.println("Enter Number 2 :");
            int num2 = num.nextInt();
            
            String result = num1>num2?"Number 1  is bigger than Number 2":"Number 2 is bigger than Number 1";

            System.out.print(result);
        }

    }    
}
