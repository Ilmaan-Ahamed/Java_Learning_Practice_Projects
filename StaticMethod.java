package Static_Keyword;

class Student{
    int mark = 10;
    static String teacher = "Kaveen";

    static void display()
    {
        System.out.println("Hello Sir");
    } 
}

public class StaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.mark = 77;
        s2.mark = 89;

        Student.teacher = "Luke";          // The Teacher is update so update variable is print. Not old one. Becasue this staic 
        System.out.println(s1.teacher);    // Luck print 
        Student.display();
        System.out.println(s1.mark);      // the Mark was updated for the mark --- S1 variable
        System.out.println(s2.mark);      // the Mark was updated for the mark --- S2 variable

    }
}
