import java.util.Scanner;

public class MethodOverLoad {
    
    void sum(int a , int b)
    {
        System.out.println(a+b);
    }

    void sum(int a, int b , int c)
    {
        System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
        
        MethodOverLoad obj = new MethodOverLoad();
        obj.sum(34, 98);
        obj.sum(14, 45, 34);
    }
}
