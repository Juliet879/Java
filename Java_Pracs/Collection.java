import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Collection {

    public static void main(String a[]) {
        // Collection has List(ArrayList, LinkedList etc), Queue(Deque), Set(Hashset,
        // HashTree)
        // List

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(45);
        myList.add(30);
        myList.add(29);
        myList.add(35);
        myList.add(42);
        myList.add(45);

        Stream<Integer> s1 = myList.stream();

        s1.forEach(n -> System.out.println(n * 2));

        myList.forEach(n -> System.out.println(n));

        // System.out.println(myList.indexOf(45));
        // System.out.println(myList.lastIndexOf(42));
        // System.out.println(myList.set(2, 500));
        // System.out.println(myList);

        // Set - has Hashset and TreeSet, Stores unique elements but return an unsorted
        // collection if you want sorted use TreeSet
        Set<Integer> mySet = new HashSet<Integer>();
        mySet.add(24);
        mySet.add(40);
        mySet.add(45);
        mySet.add(790);
        mySet.add(343);
        mySet.add(24);

        // System.out.println(mySet.contains(23));
        // System.out.println(mySet);

        // Map - Uses the Collection API (Principle) and store data in Key-Value pairs
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Annab", 234);
        myMap.put("Benta", 544);
        myMap.put("Syns", 454);
        myMap.put("Cient", 908);
        myMap.put("Mally", 657);

        // System.out.println(myMap.values()); // returns a collection of the values

        for (String key : myMap.keySet()) {
            // System.out.println(myMap.get(key));
        }

        // Comparator vs Comparable
        // example1 - Integer Comparator
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(35);
        nums.add(54);
        nums.add(67);
        nums.add(79);
        nums.add(23);

        Collections.sort(nums, com);
        // System.out.println(nums);

        // example2 - String Compator
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(87, "Sarah"));
        students.add(new Student(54, "Alison"));
        students.add(new Student(32, "Jeanin"));
        students.add(new Student(21, "Mandy"));
        students.add(new Student(78, "Vinal"));

        Collections.sort(students);
        for (Student stud : students) {
            // System.out.println(stud);
        }
    }
}

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
