public class BasicMath {
    
    public static void main(String[] args) {
        //Even or odd
        int n = 67;
        System.out.println(isOdd(n));
        
        //Find unique from array
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));

        // nth magic number
        System.out.println("nth magic number is:");
        int p = 6;
        int magicNumber = 0;
        int base = 5;
        
        while (p > 0) {
            int last = p & 1;
            p = p >> 1;
            magicNumber += last * base;
            base = base * 5;
        }
        System.out.println(magicNumber);

        // no.of digits
        System.out.println("No of digits is:");
        int no = 10;
        int b = 2;
        int answer = (int)(Math.log(no) / Math.log(b)) + 1;
        System.out.println(answer);
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    
    private static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
