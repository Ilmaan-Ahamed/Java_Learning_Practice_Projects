import java.util.Scanner;

class comOP{
    public static void main(String args[])
    {
        // Check Wheter Number 1 & 2 Equal Or  Not 
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if(number1==number2)
        {
            System.out.print("Both Number are Equal");
        }
        else{
            System.out.print("Both Number are Not Equal");
        }
        
    }
}