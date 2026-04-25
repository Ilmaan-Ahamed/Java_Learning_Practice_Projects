
// Get input for number and check wahter it is divisible by both 3 and 5 or 
//not if yest than print the number is divisible by 3 and 5 print the number

// Steps 
// 1 - create a variable called num
// 2 - find out wheter num is divisble by 3 or not
// 3 - find out wheter num is divisble by 5 or not
// 4 - Divisible by 3 && Divisible by 5

import java.util.Scanner;

class c2q3{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number     = scan.nextInt();

        if(number % 3 == 0  &&  number % 5 == 0 )
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}