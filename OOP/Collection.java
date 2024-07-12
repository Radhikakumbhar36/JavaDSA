package OOP;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>(null);
        name.add("Durgesh");
        name.add("Rakesh");
        name.add("radha");
        System.out.println(name);
        System.out.println(name.get(0));
        System.out.println(name.get(1));



        //un type safe
        // LinkedList list=new LinkedList();
        // list.add("Durgesh");
        // list.add(101);
        // list.add(635.456);
        // list.add(true);
        // System.out.println(list);

        name.remove("radha");

        // System.out.println(name);

        System.out.println("SIZE:"+name.size());

        //check item is there or not 
        //type ka equals methid call karata hain checking karane ke liye 
        System.out.println("Durgesh is there or not:"+name.contains("Durgesh"));

        //check for empty
        System.out.println(name.isEmpty());

        name.set(1,"Ram");//changing that element

        name.add(1,"ram");//add ata a particulae positiom
        
        //remove all the element
        //name.clear();

        Vector<String> vector=new Vector<>();
        vector.addAll(name);
        System.out.println("vector"+vector);

        System.out.println(".............................");

        HashSet<Double> nms=new HashSet<>();
        //only unique element present not any indexing is there and order is not preseved
        nms.add(10.0);
        nms.add(20.0);
        nms.add(30.0);
        nms.add(243.564);
        nms.add(30.0);
        System.out.println(nms);

        TreeSet<Double> tset =new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);


        //Traverse 
        //for each loop
        for(String str:name){
            System.out.println(str +"\t"+str.length());
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());

        }

        System.out.println("...........Iterator..............");

        //traversing through iterator
        Iterator<String> it=name.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("..........ListIterator...........");

        //backword iterator of collection LISTITERATION
        ListIterator<String> StringIterator=name.listIterator(name.size()); //name.size() for backeord traversing
        while(StringIterator.hasPrevious()){
            System.out.println(StringIterator.previous());
        }

        System.out.println("......For Each Method.........");
        //for each method
        name.forEach(e->
        {
            System.out.println(e);
        });

        System.out.println("Sorting of Elements");
        TreeSet<String> set=new TreeSet<>();
        set.addAll(name);
        set.forEach(e->{
            System.out.println(e);
        });

        //comparable or comparator


        HashMap<String,Integer> courses=new HashMap<>();

        courses.put("Core Java", 40000);
        courses.put("Basic Python",3500);
        courses.put("Android",4500);
        courses.put("Java", 40000);
        System.out.println(courses);

        courses.forEach((e1,e2)->{
            System.out.println(e1+" "+e2);

        });

        // course.forEach((key,value))->{
        //     System.out.println(key);
        //     System.out.println(value);

        // }
    }
    
}
