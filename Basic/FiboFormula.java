package Basic;
public class FiboFormula {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }

    static int fiboFormula(int n){
        //just for demo use long instead
        return(int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));

    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    
}
