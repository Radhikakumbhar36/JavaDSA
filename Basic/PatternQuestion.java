package Basic;

public class PatternQuestion{
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(4);
        // pattern5(4);
        //pattern28(4);
        // pattern30(4);
        pattern17(4);
        pattern31(4);
        pattern32(4);
    }
    
    static void pattern1(int n){
        for(int row=1;row<=n;row++)
        {
            //for every row , run the col
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
                //when one row is printed ,we need to add newline
                 System.out.println();
            
            
        }

        System.out.println();
        
    }
    static void pattern2(int n){
        for(int row=1;row<=n;row++)
        {
            //for every row , run the col
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
                //when one row is printed ,we need to add newline
                 System.out.println();
            
            
        }
        System.out.println();
        
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++)
        {
            //for every row , run the col
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
                //when one row is printed ,we need to add newline
                 System.out.println();
            
            
        }
        
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++)
        {
            //for every row , run the col
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
                //when one row is printed ,we need to add newline
                 System.out.println();
            
            
        }
        
    }

    static void pattern5(int n){
        for(int row=1;row<=2*n;row++)
        {
           int totalColsInRow=row>n?2*n-row-1:row;
            for(int col=1;col<=totalColsInRow;col++){
                System.out.print("* ");
            }
                //when one row is printed ,we need to add newline
                 System.out.println();
            
            
        }
        
    }

    static void pattern28(int n){
        for(int row=0;row<=2*n;row++)
        {
           int totalColsInRow=row>n?2*n-row:row;
           int noOfSpaces=n-totalColsInRow;
            for(int s=0;s<noOfSpaces;s++){ 
                System.out.print(" ");
            }
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
                //when one row is printed ,we need to add newline
                 System.out.println();
            
            
        }
        
    }
    static void pattern30(int n){
        for(int row=1;row<=n;row++)
        {
            for(int space=0;space< n-row;space++){
                System.out.print(" ");

            }

            for(int col=row;col>=1;col--){
                System.out.print(col);

            }

            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
           
        
    }
}

static void pattern17(int n){
    for(int row=1;row<=2*n;row++)
    {
       int c=row>n?2*n-row:row;
      
        for(int s=0;s<n-c;s++){ 
            System.out.print(" ");
        }
        for(int col=c;col>=1;col--){
            System.out.print(col + " ");
        }
        for(int col=2;col<=c;col++){
            System.out.print(col + " ");
        }
            //when one row is printed ,we need to add newline
             System.out.println();
        
        
    }
    
}

    static void pattern31(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");

            }
            System.out.println();

        }
    }

    static void pattern32(int n){
        System.out.println();
        int original=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=original-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");

            }
            System.out.println();

        }
    }
}