
// Get input for variable income if income is income > 7000 ScholarShip is avaliable Else Not Eligible

import java.util.Scanner;

class c2q2{
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        int income   = scan.nextInt();
        
        if(income >=  7000)
        {
            System.out.print("Scholarship in Avaliable");
        }
        else{
            System.out.print("Not Eligible");
        }
    }
}