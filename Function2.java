//pass by value
//doesnot change the value for string and primitive data type
//for array the changing the value via function

import java.util.Arrays;

public class Function2 {
    public static void main(String[] args) {
        int a =10;
        int b=20;

        swap(a,b);

        System.out.println(a+" "+b);    //not swapping of value 

        String name="Kunal Kushwaha";
        changeName(name);
        System.out.println(name);   //not changing the name 
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int a, int b) //a and b would be diff like num1 and num2
    {
        int temp=a;
        a=b;
        b=temp;
        //this change will only be valid in this function scope only.

    }

    static void changeName(String name){ //this name should be other like naam 
        name="Rahul Rana";   //creating a new object
    }
    static void change(int[] nums)
    {
        nums[0]=99;
       //if you make the change to the object via this ref var then it will change to the original object 
    }
    
}
