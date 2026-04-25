public class Constructor {
    int marks;
    String name;

    Constructor() // Creating constructor
    {
        System.out.println("Hello Bai");
    }

    public static void main(String[] args) {
        
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor();

        System.out.println(obj1.marks);
        System.out.println(obj2.name);
    }
}
