package Final_Keyword;

class A{
    final void display()      // This fuction was fixed not be changed
    {
        System.out.println("Class A");
    }
}

class B extends A{
    //void display()   // Can't be Over Ride the fuction
    {
        System.out.println("Class is runing");
    }
}


public class finalMethod {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
