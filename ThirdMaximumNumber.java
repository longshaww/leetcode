public class ThirdMaximumNumber {
    
    public static void printArr(long[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d",a[i]);
        }
    }
    public static void insert(long[] a , int x) {
        int i = 0;
        while (i < a.length) {
            if(x == a[i]) {
                return;
            }
            else if (x > a[i]) {
                break;
            }
            else {
                i++;
            }
        }
        if(i < a.length) {
            for(int j = a.length - 2; j >= i ; j--) {
                a[j+1] = a[j];
            }
            a[i] = x;
            printArr(a);
        }
    }
    public static int thirdMaximumNumber (int [] a) {
        long[] maxArr = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        for (int i = 0 ; i < a.length ; i++) {
            insert(maxArr,a[i]);
        }
        if(maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        }
        return (int) maxArr[0];
    }
    public static void main(String[] args) {
        int[] a= {2,2,3,1};
        System.out.println(thirdMaximumNumber(a));
    }
}
