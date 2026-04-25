// Create a class functionq2 this class should have 2 variable apple_price = 20 & apple_count = 5 
//create a fucntion a total anount of the multiple count and price 

public class functionQ2 {
    int apple_price = 20;
    int apple_count = 5;

    void total_money()
    {
        System.out.println("Total amount " + apple_count * apple_price);
    }
    public static void main(String[] args) {
        functionQ2 obj1 = new functionQ2();
        obj1.total_money();
    }
}
