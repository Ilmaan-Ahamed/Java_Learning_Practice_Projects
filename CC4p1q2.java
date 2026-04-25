// Create a class called School with main funtion 
// Create a function called passorfail whather school return the string  Pass / Fail
// Inside main function get int input from user for total mark
// Pass that input to the passorfail fuction & let the fuction decide whether student is pass or fail

import java.util.Scanner;
public class CC4p1q2 {
    String passorfail(int score)
    {
        if(score < 35 )
        {
            return "Fail";
        }
        else{
            return "Pass";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number ");
        int total_mark = scan.nextInt();
        
        CC4p1q2 obj = new CC4p1q2();

        String result = obj.passorfail(total_mark);
        System.out.println(result);
    }
}
