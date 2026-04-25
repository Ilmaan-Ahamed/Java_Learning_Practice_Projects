class A implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hey Hello..");
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Okey Bye..");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread a1 = new Thread(new A());
        Thread b1 = new Thread(new B());

        b1.setPriority(10);
        a1.setPriority(5);

        a1.start();
        b1.start();
    }
}
