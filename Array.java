import java.util.Scanner;
import java.util.*;
public class Array{
    public static void main(String[] args) {
//Syntax
//datatype[] var_name=new datatype[size]
int[] rnos = new int[5];
//or 
int[] rnos2={25,34,46,56,34};

Scanner in=new Scanner(System.in);

int[] ros; // declaration
ros=new int[5];//Initialisation


//array of primitives
    int[] arr=new int[5];
    arr[0]=1;
    arr[1]=23;
    arr[3]=4;

    //input using the for loop
    for (int i=0;i< arr.length;i++){
        arr[i]=in.nextInt();

    }

    //Array class has toString method which converts array in string, and print that string 
    System.out.println(Arrays.toString(arr)); //[1,2,3,4,5]

    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]+ " ");
    }
     
    //for each loop 
    for(int num: arr){  //for every element in array , print the element 
        System.out.println(num + " ");//here num represents elements of the array 
    }

    //System.out.println(arr[5]);//index out of bound error 



    //array of objects

    String[]  str=new String[4];
    for (int i=0;i< str.length;i++){
        str[i]=in.next();
    }
    str[1]="Kunal";

    System.out.println(Arrays.toString(str));

    //modifing array element
    //arr[0]=99;

    //using function (pass by value)

    // int[] nums= {3,4,5,6,7};
    // System.out.println(Arrays.toString(nums));
    // change(nums);
    // System.out.println(Arrays.toString(nums));

    // static void change(int[] arr){
    //     arr[0]=98;
    // }
}

}
class Array2D{
    public static void main(String[] arg){
    Scanner in=new Scanner(System.in);

    int[][] arr2=new int[3][];
    
    int[][] arr={
        {1,2,3},
        {4,5,6}, //{4,5}
        {7,8,9} //{6,7,8,9}
    };

    //input     // arr.length gives row length
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){

            arr[row][col]=in.nextInt();
        }
    }

    //output
    for(int row=0;row<arr.length;row++){
        for(int col=0;col<arr[row].length;col++){

            System.out.println(arr[row][col]+ " ");
        }
    }
    System.out.println();
}

// //to String method

//     for(int row=0;row<arr.length;row++){
//         System.out.println(Arrays.toString(arr[row]));
//     }

//for each or enhanced for loop
// for(int[] a: arr){
//     System.out.println(Arrays.toString(a));
// }
}



