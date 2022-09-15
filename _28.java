public class _28 {
    public static int removeElement(int[] a, int val) {
       int n = a.length;
        for(int i = 0 ; i < n ;) {
            if(a[i] == val) {
                for(int j = i; j <= n-2 ; j++) {
                    a[j] = a[j+1];
                }
                n--;
            }else { // Không phải xóa
                i++;
            }
        }
       return n;
    }     

    public static int TwoPointerRemoveElement(int[] a, int val) { 
       int k = 0;
        for (int i = 0; i < a.length; i++) { 
            if(a[i] != val) {
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        System.out.println(TwoPointerRemoveElement(a,2));
        System.out.println("Done");
    }
}
