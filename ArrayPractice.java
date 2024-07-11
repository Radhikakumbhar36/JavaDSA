
import java.util.*;


public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        max(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println((maxrRange(arr, 1, 3)));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int maxrRange(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
    }
}
}
