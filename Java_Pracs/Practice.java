class Practice {
    public static void main(String a[]) {
        Person p1 = new Person();
        p1.name = "Annabel";
        p1.age = 24;
        Person.specie = "JHHJH";
        Person.showPerson(p1);

    }
}

// STATIC BLOCK - Class loads first(only once) then the objects are instantiated

class Person {
    String name;
    int age;
    static String specie;

    public Person() {
        name = "Dancun";
        age = 42;
        System.out.println("Constructor block");
    }

    static {
        specie = "Human";
        System.out.println("Static block showing " + specie);
    }

    static void showPerson(Person p) {
        System.out.println(" HappyBirthday " + p.name + " for turning " + p.age + " years old. You are a " + specie);
    }
}
