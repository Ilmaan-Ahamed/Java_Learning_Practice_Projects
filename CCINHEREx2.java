//   Ex 2
// Steps  1   Create a Super Class named vehicle with field barand and year and methods startEngine().
//        2   Create a subclass named car that inherits form vechile.
//        3   Add filed called fule type of type String to the car class. 
//        4   over ride the stat engine () in the car class print "Car engine starts".
//        5   add  a method called drive() to the car class that print "Car  is driving".
//        6   Create a truck subclass that also inherits from the vechile class.
//        7   Add a field called load cappasity type int to the truck class.
//        8   Override the start engine() method in truck class to print "Truck engine Starts".
//        9   Add a method called haul() to the truck class prints "Truck is hauling"

class Vehicle{
    String brand;
    int year;

    void StartEngine()
    {

    }
}

class car extends Vehicle{
    String fuletype;

    
    void StartEngine(){
         System.out.println("Car Engine Starts");
    }

    void drive(){
        System.out.println("Car is Driving");
    }
}

class Truck extends Vehicle{
    int load_Capacity;

    
    void StartEngine(){
        System.out.println("Truck Engine Starts");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}


public class CCINHEREx2 {
    public static void main(String[] args) {

        // For Car
        car c1      = new car();
        c1.brand    = "Audi";
        c1.fuletype = "Petrol";
        c1.year     = 2023;

        System.out.println("--- Car Details ---");

        System.out.println(c1.brand);
        System.out.println(c1.fuletype);
        System.out.println(c1.year);
        c1.StartEngine();
        c1.drive();
        
        System.out.println();

        // For Truck 
        Truck t1         = new Truck();
        t1.brand         = "Leyland";
        t1.year          = 2020;
        t1.load_Capacity = 20_000;

        System.out.println("--- Truck Deatils ---");
        System.out.println(t1.brand);
        System.out.println(t1.year);
        t1.StartEngine();
        t1.haul();
        
    }
}