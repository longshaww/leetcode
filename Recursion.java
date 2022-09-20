public class Recursion {

    public static int Fibo(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        int t = Fibo(n-1) + Fibo(n-2);
        return t;
    }

    public static int GiaiThua(int n) { 
        if ( n == 0 ) 
        {
            return 1;
        }
        int t = n * GiaiThua(n - 1);
        return t;
    }

    public static void printElement (int [] a , int index) 
    {
        if ( index < 0 || index >= a.length) {
            return;
        }
        System.out.println(a[index]);
        printElement(a,index + 1);
        // In ngược mảng
        // System.out.println(a[index]);
    }

    static int [] F = new int [1000];
    public static int Fibo2(int n ) {
        if(F[n] != 0){
            return F[n];
        }
        if(n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1 ;
        }
        F[n] = Fibo2(n-1) + Fibo2(n-2);
        return F[n];
    }
    private static int currentMax = -1;
    public static void findMax1 (int [] a , int i) {
        if(i < a.length) {
            if(a[i] > currentMax) {
                currentMax = a[i];
            }
            findMax1(a, i + 1);
        }
    }
        public static int findMax2 (int [] a , int i, int previousMax) {
            if(i < a.length) {
                int curMax = Math.max(previousMax,a[i]);
                return findMax2(a,i+1,curMax);
            }
            return previousMax;
        }    
    public static void main (String[] args){
        int [] a = {1,2,3,4,5,6,7,8,9};
        printElement(a,0);
    }
}