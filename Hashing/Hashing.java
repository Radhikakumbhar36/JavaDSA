package Hashing;

import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        // String name="Rahul"; //gives no. as per operation
        // System.out.println(name.hashCode());
        // Integer a=4235678;  //int cannot be used so use wrapple class
        // System.out.println(a.hashCode()); //gives same no.

        HashMap<String,Integer> mpp=new HashMap<>();
        //To store it in sorted order make the HashMap as TreeMap
        mpp.put("Radhika", 99);
        mpp.put("Kunal", 100);
        System.out.println(mpp);

        System.out.println(mpp.containsKey("Radhika"));
        System.out.println(mpp.get("Kunal"));
        System.out.println(mpp.getOrDefault("Mom", 77));

        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);
        System.out.println(set);
    }
}
