import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] a ,int L,int R) {
        //DKD
        if(L>= R) return;
        //B1 Chọn khóa
        int key = a[(L+R) / 2];
        //B2 Phân bố lại mảng theo khóa
        int k = parition(a, L, R, key);
        //B3 Chia đổi mảng => Lặp lại
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }
    // Return pivot value;
    static int parition(int[] a,int L , int R,int key) {
        int iL = L;
        int iR = R;
        while(iL <= iR) {
            // Với iL , đi tìm phần tử >= key để đổi chỗ
            while(a[iL] < key) iL++;
            // Với iR , đi tìm phần tử <= key để đổi chỗ
            while(a[iR] > key) iR--;
            // Đổi chỗ 2 phần tử đang đứng ko đúng vị trí
            if(iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;iR--;
            }
        }
        return iL;
    }
    public static void main (String [] args) {
        int [] a = {6,7,8,5,4,1,2,3};
        quickSort(a, 0, a.length -1);
        System.out.println(Arrays.toString(a));
    }
}
