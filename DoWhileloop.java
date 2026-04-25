

// Get input for variable a input should be grater than 10 
// if input is not grater than 10 ask the user to be enter until typing right input 

import java.util.Scanner;;
class DoWhileloop {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int count = 0;
            do{
                System.out.println("Enter the Number > 10: ");
                count = scan.nextInt();
            }while(count<10);
        }
}
