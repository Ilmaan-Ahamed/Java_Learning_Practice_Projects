import java.util.Scanner;

class c2q1{
    public static void main(String args[])
    {
        // Get input for Variable Mark if mark > 35 print pass else print fail
        Scanner scan = new Scanner(System.in);
        int mark     = scan.nextInt();

        if(mark>34)
        {
            System.out.print("PASS");
        }
        else{
            System.out.print("FAIL");
        }

    }
}