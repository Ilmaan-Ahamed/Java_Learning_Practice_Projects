import java.lang.System;
import java.util.Scanner;

// GET INPUT IN INTEGER INT

class input{
   public static void main(String args[])
    {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
       int b = number.nextInt();
        int f = a + b;
        System.out.print(f);
    }
}

// GET Input in STRING STR

class inputstr{
    public static void main(String args[])
    {
        Scanner name = new Scanner(System.in);
        String bird = name.nextLine();
        System.out.print(bird);
    }
}
