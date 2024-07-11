import java.util.*;

public class ArrayAccenture {
    public static void main(String[] args) {
        
       
        Scanner sc=new Scanner(System.in);
        int[] input={5,3,8,6};
        // for(int i=0;i<input.length;i++){
        //     input[i]=sc.nextInt();
        // }

        ArrayList<Integer> result = diffArray(input);
        System.out.println(result);

        // Closing the Scanner
        sc.close();

        
        

    }
    public static ArrayList<Integer> diffArray(int[] input ){
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<input.length-1;i++){
           int diff=input[i+1]-input[i];
           output.add(diff);

        }
        return output ;
       
       
        

    }
    
}
