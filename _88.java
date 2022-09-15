public class _88 {

   public static void merge(int[] arr1, int m, int[] arr2, int n) {
        for (int i: arr2){
            insertElementToArray(i,arr1,m);
            m++;
        }   
    }    
    
    private static void insertElementToArray(int x, int[] arr, int m) {
        boolean isFounded = false;
        for (int k =0 ; k < m; k++) {
            if(arr[k] > x) {
                isFounded = true;
                for (int i = m - 1 ; i >= k ; i--){
                    arr[i + 1]= arr [i];
                }
                arr[k] = x;
                break;
            }
        }
        if(!isFounded){
            arr[m] = x;
        }
    }

     public static void TwoPointerMerge(int[] n1, int m, int[] n2, int n) {
       int i = m - 1;
       int j = n - 1;
       int k = (m+n) - 1;
       while(k >= 0) {
            if(j < 0) {
                n1[k] = n1[i];
                i--;
            }
            else if ( i < 0) {
                n1[k] = n2[j];
                j--;
            }
            else if(n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            }else {
                n1[k] = n2[j];
                j--;
            }
            k--;
       }
    }    
    
    public static void main(String[] args){
        int [] n1 = {2,3,4,5,0,0,0};
        int [] n2 = {0,3,6};

        TwoPointerMerge(n1,4,n2,3);
        System.out.println("Done");
    }
}
