// Inheritance is where a class reuses or extends properties and methods of the parent class 
// this() is used to call another constructor within the same class.
// Use super() to initialize the parent class before the child class.

class Inheritance {
    public static void main(String a[]) {
        // VeryAdvCalc calc = new VeryAdvCalc();
        // System.out.println(calc.add(12, 16));
        // System.out.println(calc.multi(19, 4));
        // System.out.println(calc.power(8, 2));

        AdvCalc calc1 = new AdvCalc();
        System.out.println(calc1.add(4, 3));

    }
}

class Calculator {
    public Calculator() {
        System.out.println("In Calc, parent class");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}

class AdvCalc extends Calculator {
    public AdvCalc() {
        super(); // initialize parent constructor before child
        System.out.println("In AdvCalce, child class");
    }

    // overriding -> same method, same name, same parameters but different body
    public int add(int num1, int num2) {
        return num1 + num2 + 3;
    }

    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }
}

class VeryAdvCalc extends AdvCalc {
    public double power(int num1, int num2) {
        return Math.pow(num1, num2);
    }
}
