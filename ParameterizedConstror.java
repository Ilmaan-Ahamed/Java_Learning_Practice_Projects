// METHOD 1
class Student {
    int marks;
    String name;

    Student()
    {
        System.out.println("Emty Constructor");
    }

    Student(int a)
    {
        System.out.println(a);
        System.out.println("Hello");
    }
}
public class ParameterizedConstror {  
    public static void main(String[] args) {

        // OBJ FOR METHOD 1
        Student obj1 = new Student(10);
        Student obj2 = new Student();

    }
}
// Method 2
class Studn(int a , String b){
    mark = a;
    name = b;
}

public class InnerParameterizedConstror {
    public static void main(String[] args) {
        Studn OBJ1 = new Studn(32,"Ahamed");
        Studn OBJ2 = new Studn(87, "Mark");
    
        System.out.println(OBJ1.mark);
        System.out.println(OBJ2.name);
    }
    
    
}
