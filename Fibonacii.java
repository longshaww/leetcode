public class Fibonacii {

    public static int Fibo(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        int t = Fibo(n-1) + Fibo(n-2);
        return t;
    }
    public static void main (String[] args){
        System.out.println(Fibo(8));
        System.out.println(Fibo(9));
    }
}