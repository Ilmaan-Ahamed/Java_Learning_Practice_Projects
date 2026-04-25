// Create an integer array , get input for 5 number and print their sum or total 

import java.util.Scanner;

class ArrayQ1 {
    public static void main(String[] args) {
        int[] Score = new int[5];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Score 1");
        Score[0] = scan.nextInt();

        System.out.println("Enter Score 2");
        Score[1] = scan.nextInt();

        System.out.println("Enter Score 3");
        Score[2] = scan.nextInt();

        System.out.println("Enter Score 4");
        Score[3] = scan.nextInt();

        System.out.println("Enter Score 5");
        Score[4] = scan.nextInt();

        System.out.println();

        System.out.println("Total Score :-");
        System.out.println(+Score[0]+Score[1]+Score[2]+Score[3]+Score[4]);
    }

}
