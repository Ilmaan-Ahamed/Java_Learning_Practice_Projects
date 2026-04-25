//      INHERRITANCE CODING CHALLENGE 1
//                  Ex 01 

// step 1  Create a class named animal 
//         Add a filed called name of type string 
//         Add a filed called age of type int 
//         Add a method called makesound() that print "Animal makes a sound"


class Animal {
    String name;
    int age;

    void makesound() {
        System.out.println("Animal makes a Sound");
    }
}


// Step 2   Create  a Subclass named Dog that inherits form Animal 
//          Add a filed called bread of type String
//          Override the makesSOund() method to print "Dog Bark"
//          Add a method called fetch() that to print "Dog is Fetching"

class Dog extends Animal{
    String bread;

    @Override
    void makesound(){
        System.out.println("Dog Barks");
    }

    void fetch(){
        System.out.println("Dog is Fecthing");
    }
}
public class CCINHEREx1 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Simba";
        cat.age = 4;



        Dog d1 = new Dog();
        d1.name  = "Kalli";
        d1.bread = "Kow Kow";
        d1.age   = 6;


        System.out.println(cat.name);
        System.out.println(cat.age);
        cat.makesound();
        
        System.out.println();

        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.bread);
        d1.makesound();
    }
}

