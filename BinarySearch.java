public class BinarySearch {
    public static int binarySearch( int [] a , int key) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n - 1;
        while(iLeft <= iRight) {
            int iMid = (iLeft + iRight) / 2;
            if(key == a[iMid]){
                return a[iMid];
            }
            else if(key > a[iMid]) {
                iLeft = iMid + 1;
            }
            else {
                iRight = iMid - 1;
            }
        }
        return -1;
    }

    public static int recursionBSearch(int [] a ,int key , int iLeft,int iRight) {
        int iMid = (iLeft + iRight) / 2;
        if(iLeft > iRight) {
            return -1;
        }
        else if(key == a[iMid]) {
            return iMid;
        }
        else if(key > a[iMid]) {
            return recursionBSearch(a,key,iMid + 1 , iRight);
        }
        else {
            return recursionBSearch(a, key,iLeft,iMid - 1);
        }
    }
    public static int recursionBSearch(int [] a ,int key) {
        int n = a.length;
        return recursionBSearch(a,key,0,n-1);
    }
  
    public static void main (String[] args) {
        int [] a = {1,4,9,12,19,25,31,46,50,57,72};
        System.out.println(binarySearch(a,31));
    }
}
