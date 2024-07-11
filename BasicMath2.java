import java.util.ArrayList;

public class BasicMath2 {
    public static void main(String[] args) {
        // int n=40;
        // for(int i=0;i<=n;i++){
        //     System.out.println(i+" "+isprime(i));
        // }

        // //for array
        // boolean[] primes=new boolean[n+1];
        // System.out.println(primes[0]);
        // sieve(n,primes);

        // //Binary search sqrt
        // int p=3;
        // System.out.printf("%3f",sqrt(n,p));

        // //By Newton raphson method sqrtN
        // System.out.println(sqrtN(40));

        //factorial of no with complexity O(n)
        fact1(20);
        fact2(20);
        fact3(20);//for sorted order

    }

    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if (n%c==0){
                return false;

            }
            c++;

        }     return true;
}

    static void sieve(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;

                }

            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
       
    }

    static double sqrt(int n,int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }

            if(m*m>n){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }

            root-=incr;
            incr/=10;
        }

        
        return root;
    }


    static double sqrtN(double n){
        double x=n;
        double root;
        while(true)
        {
             root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;

        }
        return root;
    }

    //o(n)
    static void fact1(int n){
        System.out.println();
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    //o(sqrt(n))
    static void fact2(int n){
        System.out.println();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+ " ");
                }else{
                    System.out.print(i+" "+n/i+" ");

                }
                
            }
        }
    }
    //for sorted order printing 

    static void fact3(int n){
        System.out.println();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+ " ");
                }else{
                    System.out.print(i+" ");

                }
                
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");

        }
    }


    
}
