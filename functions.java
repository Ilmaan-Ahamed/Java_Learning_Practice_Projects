public class functions {
    void greating()
    {
        System.out.println("WellCome");
        dummy();
    }
    void dummy()
    {
        System.out.println("Iam Dummy");
    }

    public static void main(String[] args) {
        {
            functions obj1 = new functions();
            obj1.greating();
        }
    }
}
