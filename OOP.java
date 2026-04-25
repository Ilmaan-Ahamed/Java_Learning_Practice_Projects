// Inheritance 

// 1. Single lnheritance 

import java.security.Principal;
import java.util.Scanner;

class animal{

    void eat()
        {
            System.out.println("This Animal Can Eat...");
        }
    }
    
class Dog extends animal{
    void sound()
        {
            System.out.println("Boww Boww Boww...");
        }
    
public static void main(String[] args) {
    
    Dog d1 = new Dog(); 
    d1.eat();
    d1.sound();
}
}


// 2. Multilevel Inheritance 

class a {
    int one = 1;
        }

class b extends a {
    int two = 2;
        }

class c extends b {
    int three = 3;
        
public static void main(String[] args) {
     c obj1 = new c();

     System.out.println(obj1.one);
     System.out.println(obj1.two);
     System.out.println(obj1.three);

    }
}

// 3. Hieracihal Inheritance

class school{
        void sports()
            {
                System.out.println("Congarts you been Selected to Football Team");
                System.out.println();
            }
        
        void sports_Sir()
            {
                System.out.println("Dear Sir! You Been Appoined to sports Coach congarts");
            }
    }

class student extends school{
        
        void classA()
            {
                System.out.println("10 Students are selecte to Criket ");
                System.out.println();
            }
        
        void classB()
            {
                System.out.println("10 Students are selecte to Football");
                System.out.println();
            }
        
        
        public static void main(String[] args) {
            student s1 = new student();
            s1.classA();
            s1.classB();
            s1.sports();
        }
}

class teacher extends school{

    void principal()
        {
            System.out.println("Congrats sir! you're appointed to Principal ");
        }
    
    public static void main(String[] args) {
        
        teacher t1 = new teacher();

        t1.sports_Sir();
        t1.principal();
    }
}