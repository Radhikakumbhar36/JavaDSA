public class AgnosticBS {
    public static void main(String[] args) {
        //int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr={99,80,75,22,11,10,5,2,-3};
        int target=22;
        int ans=agnosticBs(arr, target);
        System.out.println(ans);
    }
    static int agnosticBs(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        //find whether the array us sorted ascending ior descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            //fimd the middle element
            //int mid=(start+end)/2;
            //might be that the  (start+end )might be exceed  the range if iun tin java

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
           
        }
        return -1;
    }
    }
    

