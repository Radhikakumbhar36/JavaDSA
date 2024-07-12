package Sorting;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
