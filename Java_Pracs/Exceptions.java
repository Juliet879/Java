public class Exceptions {
    public static void main(String a[]) throws InterruptedException {
        int num = 18;
        int num2 = 0;

        // Creating an instance to catch an Exception
        try {
            int result = num / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Caught something");
        }
        System.out.println("Welcome back");

        // Runnable vs Thread - when using Thread a class cannot EXTEND aanother class
        // in an instance
        // where you have a child class that needs to EXTEND a parent so we IMPLEMENT
        // Runnable since its an inteface

        Counter count = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join(); // Used to make one thread wait for the completion of another thread
        t2.join();

        System.out.println(count.counter);

    }
}

class Counter {
    int counter;

    public synchronized void increment() {
        // the synchronized means that in an instance where two threads have these
        // method running, oly only thread will execute it the method at a time, kinda
        // locks
        counter++;
    }
}