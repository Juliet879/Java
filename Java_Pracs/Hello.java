class Hello {
    public static void main(String a[]) {
        int num1 = 10;
        int num2 = 9;

        // ternary operator
        int result = num1 < num2 ? num1 : num2;

        String alarm = "";

        // CONTROL FLOWS - while (repetition/looping), switch(jave) & when(kotlin)
        // mostly used in kotlin for conditional branching
        // Use while for looping or repeating a block of code until a condition is no
        // longer true.
        // Use when for conditional branching, where you want to execute one of many
        // possible blocks of code based on the value of an expression.

        // Java Switch ( conditional branching)

        String day = "Sunday";
        alarm = switch (day) {
            case "Monday", "Tuesday", "Wednesday":
                yield "5:30";
            case "Sunday", "Saturday":
                yield "7:30";
            default:
                yield "Enter valid day";
        };

        // Java while loop

        for (int i = 1; i <= 7; i++) {
            // System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                // System.out.println(" " + (j + 8) + " - " + (j + 9));
            }
        }

        // classes practice
        Calculator calc = new Calculator();
        // System.out.println(calc.add(21, 15));

        // Arrays
        int nums[] = { 45, 23, 1, 43, 2, 5, 56 };
        System.out.println(nums[3]);

        // 2D ARRAY OR MULTI-DIMENSIONAL ARRAYS (arrays within an array)
        int multiNums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                multiNums[i][j] = (int) (Math.random() * 10);
                // System.out.print(multiNums[i][j] + " ");
            }
            // System.out.println();
        }

        for (int n[] : multiNums) {
            for (int m : n) {
                // System.out.print(m + " ");
            }
            // System.out.println();
        }

        // JAGGED ARRAYS (for internal arrays it's not a must to specify the size of the
        // array)
        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[4];

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 10);
                // System.out.print(jaggedArray[i][j] + " ");
            }
            // System.out.println();
        }

        // ARRAY OF OBJECTS
        Student s1 = new Student();
        s1.admNo = 001;
        s1.name = "Javan";
        s1.marks = 87;

        Student s2 = new Student();
        s2.admNo = 002;
        s2.name = "Englie";
        s2.marks = 68;

        Student s3 = new Student();
        s3.admNo = 003;
        s3.name = "Phiona";
        s3.marks = 54;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            // System.out.println(students[i].name + " Admission number " +
            // students[i].admNo + " scored " +students[i].marks + "%");
        }

        // ENHANCED FOR LOOP(kinda acts like foreach loop)
        for (Student student : students) {
            // System.out.println(student.name + " Admission number " + student.admNo + "
            // scored " + student.marks + "%");
        }

        // JAVA STRINGS (Strings by default are immutable but if you want to use mutable
        // string you can use StingBuffer or StringBuilder to create a mutable string
        // object)
        String name = "Amigos";
        String name2 = "Amigos";
        // System.out.println("Hello" + name);
        // System.out.println(name.hashCode());
        // System.out.println(name2.hashCode());
        name = "Choruet";
        // System.out.println(name.hashCode());

        StringBuffer str = new StringBuffer("Angellina");
        StringBuffer str2 = new StringBuffer("Angellina");
        // System.out.println(str.hashCode());
        // System.out.println(str2.hashCode());

        // STATIC KEYWORD (means the member could be (variable, methods or innerClass)
        // belong to the class itself rather than the instance of the class)
        // Static variable
        Mobile mob1 = new Mobile();
        mob1.brand = "Samsung";
        mob1.price = 1700;
        Mobile.name = "SmartPhone";

        Mobile mob2 = new Mobile();
        mob2.brand = "Google Pixel";
        mob2.price = 1300;
        Mobile.name = "SmartPhone";

        mob1.show();
        mob2.show();

    }
}

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " costs " + price + " and its a " + name);
    }
}

class Student {
    int admNo;
    String name;
    int marks;
}

// Compile Time Polymorphism also OVERLOADING - Methods share same name but with
// different types, arguments, return types

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, int num2) {
        return num1 + num2;
    }

    public String add(String num1, int num2) {
        return "num1 + num2";
    }
}

// Runtime polymorphism (Overriding) - achieved by method overriding(child class
// has same name, parameter and return type as parent class but body is
// different)
