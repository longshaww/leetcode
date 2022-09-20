public class MergeSort {
    
    public static int[] merge(int [] a1,int a2[] ){
       int n = a1.length + a2.length;
       int[] result = new int[n];
       int i = 0, i1 = 0, i2 = 0;
       while(i < n) {
        if(i1 < a1.length && i2 < a2.length) { // a1 và a2 != rỗng
            if(a1[i1] <= a2[i2]) { // a1 nhỏ hơn
                result[i] = a1[i1];
                i++;i1++;
            }
            else { //a2 nhỏ hơn
                result[i] = a2[i2];
                i++; i2++;
            }
        }else {
            if(i1 < a1.length) { // a1 != rỗng
                result[i] = a1[i1];
                i++;i1++;
            }
            else {
                result[i] = a2[i2];
                i++; i2++;
            }
        }
       }
       return result;
    }

    public static int[] mergeSort(int a[],int L,int R) {
       // Các điều kiện dừng
        if(L > R ) return new int[0];
        if(L == R) {
            int[] singleEl = {a[L]};
            return singleEl;
        }
        // Chia ra 
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a,L,k);
        int[] a2 = mergeSort(a, k+1, R);
        int[] result = merge(a1,a2);
        return result;
    }
    public static int[] sortArray(int[] a) {
        return mergeSort(a,0,a.length - 1);
    }
    public static void main (String [] args) {
        int [] a = {1,5,3,2,8,7,6,4};
        System.out.println(sortArray(a));
    }
}
