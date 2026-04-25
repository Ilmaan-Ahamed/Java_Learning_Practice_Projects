class Batch{
    Batch(String name)
    {
        System.out.println(name);
    }

    void makesound()
    {
        System.out.println("SLTC Manavan");
    }

    int Class = 11;
}

class Department extends Batch{
    Department()
    {
        super("Ilmaan");
        System.out.println("IT SE");
        super.makesound();
        System.out.println(super.Class);
    }
}

public class superkeyword {
    public static void main(String[] args) {
        Department d1 = new Department();

    }
}
