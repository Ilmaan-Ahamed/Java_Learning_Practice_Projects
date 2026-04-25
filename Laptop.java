public class Laptop {            // The Class name called by Laptop 
    String name = "";            //    Template
    String proc = "";            //      for
    String ram  = "";            //     Object
    String price = "";           //

    public static void main(String[] args) {
        Laptop lap1 = new Laptop();             // New object Create here the name called lap1 

        lap1.name = "ASUS";
        lap1.proc = "i7";
        lap1.ram  = "8";
        lap1.price = "200 000";

        System.out.println(lap1.name + lap1.proc + lap1.price);
    }
}
