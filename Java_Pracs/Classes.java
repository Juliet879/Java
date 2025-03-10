public class Classes {
    public static void main(String a[]) {

        Bike mountainBike = new Bike();
        mountainBike.drive();

        // instantiating inner classes
        A obj = new A();
        obj.age = 45;

        A.B obj2 = obj.new B();
        obj2.reply();

        // Abstract and Anonymous inner class
        // Since Person is an abstract class and an object cannot be instanciated
        // directly we can define the class anonymously inside the {}
        Person person1 = new Person() {

            @Override
            public void walk() {
                // System.out.println("Walking Fast");
            }
        };

        // Enum Classes
        for (Laptop lap : Laptop.values()) {
            // System.out.println(lap + " : " + lap.getPrice());
        }

        // Lambda functions
        X obj4 = (i, j) -> i + j;
        System.out.println(obj4.add(4, 19));
    }
}

// Abstract - (template for related classes) Used for sharing code among related
// classes and abstract class cannot be instantiated
// e.g abstract class Animal with method makeSound(), that each subclass (like
// Dog or Cat) must implement in its own way.
abstract class Animal {
    abstract public void makeSound();

    public void eat() {
        System.out.println("Eating food");
    }
}

class Cow extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Mooow...");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark...");
    }
}

// Interface - (rulebook) Used for defining behaviours that unrelated classes
// can implement
// e.g drive() method in an interface can be implemented by class Car, Bike

interface Drivable {
    void drive();
}

class Car implements Drivable {

    @Override
    public void drive() {
        System.out.println("Vrooooom......");
    }
}

class Bike implements Drivable {

    @Override
    public void drive() {
        System.out.println("Weeeeewww.....");
    }

}

// Inner Classes - Class within a class
class A {
    int age;

    public void greet() {
        System.out.println("Hey you child");
    }

    public class B {

        public void reply() {
            System.out.println("Yes you parent");
        }

    }
}

// Abstract and Anonymous inner class
abstract class Person {
    abstract public void walk();
}

// Enum Classes
enum Laptop {
    MacBook(2500), ThinkPad(1800), Surface(2300), HP(1200), Dell;

    private int price;

    private Laptop() {
        this.price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

// Functional interface also SAM(Single Abstract Method) takes only one method
@FunctionalInterface
interface X {
    int add(int i, int j);
}
