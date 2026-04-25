package CodingChalange;

abstract class Vehicle{
    final void StartEngine()
    {
        System.out.println("Engine Started...");
    }

    static String getVehicleType()
    {
        return"Generic Vehicle";
    }
    
    abstract void drive();
}

class car extends Vehicle{

    @Override
    void drive(){
        System.out.println("Drive a Car");
    }
}

class bike extends Vehicle{

    @Override
    void drive(){
        System.out.println("Drive a Bike");
    }
}


public class Q5 {
    public static void main(String[] args) {
        
        car c1 = new car();
        c1.drive();
        System.out.println(Vehicle.getVehicleType());
        c1.StartEngine();

        System.out.println("---------------------------");

        bike b1 = new bike();
        b1.drive();
        b1.StartEngine();
        System.out.println(Vehicle.getVehicleType());
    }
}
