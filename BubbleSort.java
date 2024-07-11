import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={64,34,25,12,22,11,90};
        bubble(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubble(int[] arr){
        //run the step n-1 times
        for(int i=0;i<arr.length;i++){
            //for each step,max item will come at the last respective index
            for(int j=0;j<arr.length-i-1;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
        }

    }
    
}
}
}
    
