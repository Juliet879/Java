public class Classes {
    public static void main(String a[]) {

        Bike mountainBike = new Bike();
        mountainBike.drive();

        // instantiating inner classes

        A obj = new A();
        obj.age = 45;

        A.B obj2 = obj.new B();
        obj2.reply();

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