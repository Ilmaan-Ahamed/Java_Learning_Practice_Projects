import java.net.Socket;
import java.util.Scanner;

class laptop{
    String name = " ";
    String Proc = " ";
    String Ram = "0";
    String Price ="0" ;
    
    void mouse()
        {
            String mou1 = "Motion";
                System.out.println("Your Mouse is : "+mou1);

            String mou2 = "Vega"; 
                 System.out.println("Your Mouse is : "+mou2);

            String mou3 = "Zebrood";     
            System.out.println("Your Mouse is : "+mou3);
        }


    public static void main(String[]args){
        laptop lap1 = new laptop();
        lap1.name ="ASUS";
        lap1.Proc ="i7 ";
        lap1.Ram  ="8";
        lap1.Price="200,000";
        lap1.mouse();
        
        System.out.println(lap1.name);
        System.out.println(lap1.Proc);
        System.out.println(lap1.Ram);
        System.out.println(lap1.Price);
    }
}

class mobile{
        // For iphone
        void iphone()
            {
                System.out.println("Here your i-phone");
            }

        // For Samsung
        void Samsung()
            {
                System.out.println("Here your Samsung");
            }
        
        // For Redmi
        void Redmi()
            {
                System.out.println("Here your Redmi");
            }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        mobile m = new mobile();
        System.out.println("Which Mobile Do you want {Samsung, Iphone, Redmi}");
        String  choice = scan.nextLine().toLowerCase();

        switch (choice) {
            case "iphone":
                m.iphone();
                break;

            case "samsung":
                m.Samsung();
                break;
                
            case "redmi":
                m.Redmi();
                break;
        
            default:
                System.out.println("Sorry, we don't have that model.");
            
        }


    scan.close();
    }
}

class addition {
    
    int a = 0;
    int b = 0;

    void sum()
        {
            System.out.println("The Sum of "+a +" " +b  );
            System.out.println( a + b);
        }
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        addition a1 = new addition();
        
        System.out.println("Enter Value a: ");
        a1.a=scan.nextInt();

        System.out.println("Enter Value b: ");
        a1.b=scan.nextInt();

        a1.sum();
        
    }
}


// Fuction with Parameters 
class FunObjParKeyword{

    void getsoap(int money) // Creating Parameter Variable
        {
            if (money >= 150) 
                {
                    System.out.println(money);
                    System.out.println("Soap Purchased");
                    System.out.println("=======================");
                    System.out.println("The Balance is : ");
                    System.out.println(money - 150);
                } 
            else 
                {
                    System.out.println(money);
                    System.out.println("Your money is Not Enough for Soap Price  ");
                    System.out.println("=======================");
                }
           
        }
    
    void chololate(int money)
        {
            if (money >= 50) 
            {
                System.out.println(money);
                System.out.println("Choloate  Purchased");
                System.out.println("=======================");
            } 
        else 
            {
                System.out.println(money);
                System.out.println("Your money is Not Enough Chololate Price ");
                System.out.println("=======================");
            }
        }

    public static void main(String[] args) 
        {
           
           Scanner scan = new Scanner(System.in);
           
           FunObjParKeyword per1 = new FunObjParKeyword();

           System.out.println("Enter Customer Money in LKR : ");
            
           int a = scan.nextInt();
           per1.getsoap(a);

           int b = scan.nextInt();
           per1.chololate(b);

           
        }
}


class FunPara2{
    
    void sum(int num1 , int num2)
        {
            System.out.println("The Sum of Num 1 & Num2");
            System.out.println(num1 + num2);
            System.out.println("=======================");
        }

    void sub(int num1 , int num2)
        {
            System.out.println("The Sub of Num 1 & Num 2");
            System.out.println(num1 - num2);
            System.out.println("=======================");
        }
    
    void multi(int num1 , int num2)
        {
            System.out.println("The multiply of Num 1 & Num 2");
            System.out.println(num1 * num2);
            System.out.println("=======================");
        }

    void div(int num1 , int num2)
        {
            System.out.println("The Divisal of Num 1 & Num 2");
            System.out.println(num1 - num2);
            System.out.println("=======================");
        }


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        FunPara2 Unum = new FunPara2();

        System.out.println("Enter you 2 number For Calculation");

        int a = scan.nextInt();
        int b = scan.nextInt();
        Unum.sum(a, b);
        Unum.sub(a, b);
        Unum.div(a, b);
        Unum.multi(a, b);
    }

}

class ReturnKey1{
    int getsoap(int money)
        {
            int Soapprice = 18;
            int rem        = 20 -18;
            return rem;
        }
    
    public static void main(String[] args) {
        
        ReturnKey1 obj1 = new ReturnKey1();
        
        int remainder = obj1.getsoap(20);
        System.out.println(remainder);
    }
}

class ReturnKey2 {
    int sum (int a, int b)
        {
            int c = a+b;
            return c;
        }
    public static void main(String[] args) {
        
        ReturnKey2 obj1 = new ReturnKey2();
        int sum = obj1.sum(20, 80);
        System.out.println(sum);
    }
}

class ReturnKey3{
    String name()
        {
            return "Ilmaan ahamed";
        }
    
    public static void main(String[] args) {
        
        ReturnKey3 obj1 = new ReturnKey3();
        String na = obj1.name();
        System.out.println(na);
    }
}

class methodoverloading{

    void sum (int a, int b)
        {
            System.out.println("This is 2 Variable input");
            System.out.println( a+b);
        }
    
    void sum (int a, int b, int c)
        {
            System.out.println("This is 3 Variable input");
            System.out.println(a+b+c);
        }

    public static void main(String[] args) {
        
        methodoverloading obj = new methodoverloading();

        obj.sum(10, 10);
        obj.sum(10, 10, 10);

    }
}

// Constructors 

class Student{

    int marks= 99;
    String name ;

    Student() // Creating Constroctor
        {
            System.out.println("Hello Bai ~");
        }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.marks);
        System.out.println(s1.name);
        System.out.println(s2.marks);
        System.out.println(s2.name);
    }
}

// Parameterized Constructor

class parcons1{

    int marks;
    String name;

    parcons1()
        {
            System.out.println("Emty Constroctor");
        }
    
    parcons1(int a)
        {
            System.out.println(a);
            System.out.println("hello");
        }
    
    public static void main(String[] args) {
        parcons1 s1 = new parcons1(10);
        parcons1 s2 = new parcons1(23);
        System.out.println();

        parcons1 s3 = new parcons1();
    }
}

class parcons2{

    int marks ;
    String name;

    parcons2()
        {
            System.out.println("empty constructor");
        }
    
    parcons2(int a, String b)
        {
            this.marks = a;  // Use this fucn to Connect the obj
            this.name =b;
        }
    
    public static void main(String[] args) {
        
        parcons2 s1 = new parcons2(87, "ilmaan");
        parcons2 s2 = new parcons2(57, "Watson");

        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println();

        System.out.println(s2.name);
        System.out.println(s2.marks);

    }
}

// This keyword 

class teacher{

    String myname = null;

    teacher()
        {
            System.out.println("Hello");
        }
    
    void setname(String name)
        {
            this.myname = name;
        }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        teacher t1 = new teacher();  

        t1.setname("hitrik");
        System.out.println(t1.myname);


    }
}