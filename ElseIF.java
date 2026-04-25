//  I can get video game if i score > 35 
//  I can get i phone  if i score   > 60
//  I can get Macbook pro if i score    > 90

import java.util.Scanner;

class ElseIF{
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);
        int score    = Scan.nextInt();

        System.out.println("Enter your Score "+score);
        
        if( score >= 90 )
        {
            System.out.print("You Got MacBook Pro");
        }
        else if( score >= 60 )
        {
            System.out.print("You Got I Phone");
        }
        else if( score >= 35 )
        {
            System.out.print("You Got Video Game");
        }
        else {
            System.out.print("Keep Trying");
        }

        
    }
}