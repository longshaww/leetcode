public class SortAlgorithm {

    public static void printArray(int index, int[] a){
        System.out.printf("%d: ", index);
        for(int i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }
    public static void BubbleSort(int[] a) {
        int n = a.length;
        for(int i = 0 ; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0 ; j < n - i - 1 ; j ++) { // Vì sau mỗi lần lặp phần tử max trôi xuống dưới cùng
                if(a[j] > a[j + 1])  {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            // Nếu sự kiện đổi chỗ đã được xảy ra thì ko cần phải sắp xếp nữa
            if(isSorted) {
                break;
            }
            printArray(i, a);
        }
    }

    public static void InsertionSort(int[] a) {
            int n = a.length;
            for (int i = 1; i < n - 1; i ++){
                int ai = a[i];
                int j = i - 1; // Phần tử bên trái i;
                while (j >= 0 && a[j] > ai) { // Khi các phần tử ở vị trí trước i vẫn còn lớn hơn thì j-- để tìm phần tử bên trái i bé hơn i
                    a[j+1] = a[j];
                    j--;
                }
                // Khi không còn phần tử nào bên trái bé hơn i thì gán a[i] vào vị trí phần tử có vị trí j hiện tại
                a[j+1] = ai;
            }
    }

    public static void SelectionSort(int [] a) {
        int n = a.length;
        for (int i = 0; i < n ; i++) {
            int minIndex = i;
            for (int j = i + 1 ; j < n ; j++) {
                // Tìm vị trí của phần tử nhỏ hơn a[i]
                if(a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Tìm được 1 phần tử lớn hơn a[i]
            if(minIndex != i) {
                int temp = a[i];
                // Đổi vị trí
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            printArray(i, a);
        }
    }
    public static void main(String[] args) {
        int [] a = {5,3,2,7,8,1,2};
        // BubbleSort(a);
        // InsertionSort(a);
        SelectionSort(a);
        System.out.println("Done");
    }
}
