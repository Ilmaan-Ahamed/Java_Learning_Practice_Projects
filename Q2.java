package CodingChalange;

 class Counter{
    static int count = 0;
    static int instanceNumber = 0;
    
    Counter()
    {
        count = count + 1;
        instanceNumber = instanceNumber + 1;
    }

    void disp()
    {
        System.out.println("Instance Numbr: "+instanceNumber);
        System.out.println("Staic Count: "+count);
    }
}



public class Q2 {
    public static void main(String[] args) {
        
        Counter c1 = new Counter();
        c1.disp();

        Counter c2 = new Counter();
        c2.disp();

        Counter c3 = new Counter();
        c3.disp();
    }
    
}