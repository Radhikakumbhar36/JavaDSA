package Basic;
public class Recursion {
    public static void main(String[] args) {
        // print(1);
        // System.out.println(fibo(6));
        int[] arr={1,2,34,5,6};
        int target=6;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
    //if you are calling a function again and again , you can treat it as a seperate call in the stack
    //this is the tail recursion
    //this is the last fuction call
        print(n+1);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    //Binary search using reecursion

    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;

        }

        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, s, m-1);

        }
        return search(arr, target, m+1, e);

    }
}
