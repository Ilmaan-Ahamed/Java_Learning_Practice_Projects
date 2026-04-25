// Get input for the 5 number using array and forloop

import java.util.Scanner;
class CC3p2q1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        
        System.out.println("Input Marks");
        //Get 5 input
        for(int i=0; i<=4; i=i+1)
        {
            marks[i] = scan.nextInt();
        }

        System.out.println("Print Marks");
        // Print input's
        for(int i=0; i<=4; i=i+1)
        {
            System.out.println(marks[i]);
        }
    }
}
