import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner in=new Scanner(System.in);
        list.add(1);
        list.add(2);
        list.add(247);
        System.out.println(list);

        list.contains(645);
        list.set(0,99);
        list.remove(2);
     
        //input
        for(int i=0;i<list.size();i++){
            list.add(in.nextInt());

        }

        //output
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }
    }
}

class MultiAL{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

        Scanner in=new Scanner(System.in);
        //Initialisation
        for(int i=0;i<list.size();i++){
            list.add(new ArrayList<>());
        }

        //input
        for(int i=0;i<list.size();i++){
        
            for(int j=0;j<list.get(i).size();j++){
                list.get(i).add(in.nextInt());
            }
        
        }
        System.out.println(list);
    
    }
}