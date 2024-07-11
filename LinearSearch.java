import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        // int[] nums={23,45,1,2,8,19,-3,-11,28};
        // int target=19;
        // int ans =linearSearch(nums, target);
        // System.out.println(ans);     
        
        //ssearch char in string
     String name="Kunal";
     char target='u';
     System.out.println(search(name,target));

     System.out.println(Arrays.toString(name.toCharArray()));



    }

    // static int linearSearch(int[] arr,int target){
    //     if(arr.length==0){
    //         return -1;
    //     }

    //     //for the return the element
    //     for(int element:arr){    //enhanced for loop
    //         if(element==target){
    //             return element;
    //         }
    //     }

    //     //run the loop
    //     for(int i=0;i<arr.length;i++){
    //         int element =arr[i];
    //         if(element==target){
    //             return i;
    //         }
    //     }
    //     //this line will execute if none of the return statement above have executes
    //     //hence the target not found 
    //     return -1;
    // }


    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
        if(ch==target){
            return true;

        }
    }
    return false;
    }

    
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
        if(target==str.charAt(i)){
            return true;

        }
    }
    return false;
    }

}
    

