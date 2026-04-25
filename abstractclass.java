
abstract class vehicle{
    abstract void speed();
    void brand()
    {
        System.out.println("XYZ BRAND");
    }
}

class Bike extends vehicle{
    void speed()
    {
        System.out.println("56.km/h");
    }
}

class Car extends vehicle{
    
    @Override
    void speed(){}
}


public class abstractclass {
    public static void main(String[] args) {
        Car c1 = new Car();
 
        c1.brand();
    }
}
