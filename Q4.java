package CodingChalange;

abstract class Animal {
    String name;

    Animal(String name)
    {
        this.name = name;
    }

    abstract void makeSound();
}

class Dog extends Animal{
    
    Dog(String name)
    {
        super(name);
    }

    void makeSound(){
        System.out.println("BOW BOW BOW....");
    }
}

class Cat extends Animal{
    Cat(String name)
    {
        super(name);
    }

    void makeSound()
    {
        System.out.println("Meouwww Meouwww.....");
    }
}

public class Q4 {

    public static void main(String[] args) {
        Dog d1 = new Dog("Booby");
        d1.makeSound();
        System.out.println(d1.name);
        System.out.println("--------------");

        
        Cat c1 = new Cat("Simba");
        c1.makeSound();
        System.out.println(c1.name);
    }
}