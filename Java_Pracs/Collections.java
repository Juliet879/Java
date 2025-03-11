import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

    public static void main(String a[]) {
        // Collection has List(ArrayList, LinkedList etc), Queue(Deque), Set(Hashset,
        // HashTree)
        // List

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(45);
        myList.add(309);
        myList.add(295);
        myList.add(35);
        myList.add(42);
        myList.add(45);

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

        System.out.println(myMap.values()); // returns a collection of the values

        for (String key : myMap.keySet()) {
            System.out.println(myMap.get(key));
        }

        // Comparator vs Comparable
        List<Integer> nums = new ArrayList<>();
        nums.add(35);
        nums.add(54);
        nums.add(67);
        nums.add(79);
        nums.add(23);

        System.out.println(nums);

    }
}
