package OOP;
import java.util.*;
//customeArrayList
//CustomArrayList using Generics

// public class OOP6 {
public class OOP6<T> {

// private int[] data;
private Object[] data;
private static int DEFAULT_SIZE=10;
private int size=0;


public OOP6(){
    // this.data=new int[DEFAULT_SIZE];
    this.data=new Object[DEFAULT_SIZE];
}

public void add(/*int num*/ T num ){
    if (isFull()){
        resize();
    }
    data[size++]=num;
}

private void resize(){
    // int[] temp=new int[data.length*2];
    Object[] temp=new Object[data.length*2];

    //copy the current items in the new array
    for (int i=0;i<data.length;i++){
        temp[i]=data[i];
    }
    data=temp;

}

private boolean isFull(){
    return size==data.length;
}

public T remove(){
    T removed=(T)(data[--size]);
    return removed;
}
public T get(int index){
    return (T)(data[index]);
}
public int size(){
    return size;
}
public void  set(int index,T value){
    data[index]=value;
}

@Override
public String toString(){
    return "CustomArrayList{"+
    "data="+Arrays.toString(data)+
    ", size="+ size + '}';
}

public static void main(String[] args) {
    // OOP6 list = new OOP6();
    // list.add(3);
    // list.add(5);
    // list.add(8);

    // System.out.println(list);

    OOP6<Integer> list=new OOP6<>();
    for (int i=0;i<14;i++){
        list.add(2*i);
    }

    System.out.println(list);
}
}


//Wildacard Notes of Kunal code 
//comparator code from kunal  material
//lambda function
