public class FunctionsWithParameters {
    void getsoap(int money) // Creating Parameter Variable into the fuction\
    {
        System.out.println(money);
        System.out.println("Soap Purchased");
    }
    
    void chocolate(int money)
    {
        System.out.println(money);
        System.out.println("Chocolate Purchased");
    }
    public static void main(String[] args) {
        FunctionsWithParameters obj1 = new FunctionsWithParameters();
        obj1.getsoap(20);
        obj1.chocolate(10);
    }
}
