package packone.pac;

import packtwo.principal;

public class Student extends principal{
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.displaySalary();
        System.out.println("-----------");


        Student s1 = new Student();
        System.out.println("The Principal Salary is :" +s1.MSalary);
    }
}
