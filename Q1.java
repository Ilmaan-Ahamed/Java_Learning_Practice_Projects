package CodingChalange;

class Person{
    public String name;
    protected int age;
    private String SocialSecurityNumber;  // SSN Number is only Avalible in  Person Class
    String address;


    Person(String name,int age,String ssn, String address)
    {
        this.name = name;
        this.age  = age;
        this.SocialSecurityNumber = ssn;
        this.address = address;
    }

    void SoSeNu()
    {
        this.SocialSecurityNumber = "Q1w2E4";
        System.out.println(SocialSecurityNumber);
    }

    // To Print the SSN Number Create  main fuc to Person class 
    public static void main(String[] args) {
        Person p1 = new Person("Kavin", 25, "", "kalmunai");

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.print(p1.SocialSecurityNumber);
        System.out.println(p1.address);
    }
}




class Employee extends Person{
        Employee(String name,int age,String ssn, String address)
        {
            super(name, age, ssn, address);
            System.out.println("Hello Employee");
        }
}

public class Q1 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ahamed", 23,"W3m4i9" , "Sammanthuri");

        System.out.println(e1.name);
        System.out.println(e1.age);
        //System.out.println(e1.SocialSecurityNumber); // This is not visible for Extends Class only visble Parent class(Person)
        System.out.println(e1.address);


    }
}
