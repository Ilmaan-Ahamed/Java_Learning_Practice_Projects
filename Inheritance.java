// Single inheritance
class Anial{
    void eat()
    {
        System.out.println("The animal can eat");
    }
            }

class Do extends Anial{
    void bark()
    {
        System.out.println("Dog Barking");
    }
                        }

public class Inheritance {
    public static void main(String[] args) {
        Do d2 = new Do();
        d2.bark();
        d2.eat();
    }
}

// Multilevel Inheritance 

class A{int one = 1;}
class b extends A {int two = 2;}
class c extends b {int three = 3;}

public static void main(String[] args)
    c obj1 = new c();
    System.out.println(obj1.three);
    System.out.println(obj1.two);
    System.out.println(obj1.one);
