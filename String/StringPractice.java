package String;

public class StringPractice {
    public static void main(String[] args) {

        String str="madam";
        System.out.println(isPalinrome(str));
        
    }

    static boolean isPalinrome(String str){
        if(str==null ||str.length()==0)
            return true;
        for(int i=0;i<str.length()/2;i++){
            int start=str.charAt(i);
            int end=str.charAt(str.length()-1-i);

            if(start!=end){
                return false;
            }
            
            
        }

        return true;
    }
    
}
