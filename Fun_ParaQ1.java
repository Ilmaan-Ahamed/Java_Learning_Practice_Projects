// Create a function called Sum , Send two number from main functions & Add these Numbers using Functions and Print I.
// Like wise Create Functions like Sub , Multy , Div 

import java.util.Scanner;;
public class Fun_ParaQ1 {
    void sum(int num1, int num2)
    {
        System.out.println("The Sum is " +(num1 + num2));
    }

    void sub(int num1 , int num2)
    {
        System.out.println("The Subtraction  is " +(num1 - num2));
    }

    void Multy(int num1 , int num2)
    {
        System.out.println("The Multiplication is " +(num1 * num2));
    }

    void div(float num1 , float num2)
    {
        System.out.println("The Division is "+(num1/num2));
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter The Number 1");
        int Obj1 = scan.nextInt();

        System.out.println("Enter The Number 2");
        int Obj2 = scan.nextInt();

        Fun_ParaQ1 Calulate = new Fun_ParaQ1();
        Calulate.sum(Obj1, Obj2);
        Calulate.sub(Obj1, Obj2);
        Calulate.Multy(Obj1, Obj2);
        Calulate.div(Obj1, Obj2);
    }
}
