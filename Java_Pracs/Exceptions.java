public class Exceptions {
    public static void main(String a[]) {
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

        Runnable obj1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i <= 5; i++)
                System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}