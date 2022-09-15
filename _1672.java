public class _1672 {
    public static int maximumWealth(int[][] a) {

        int[] totalAssets = new int[a.length];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int total = 0;
            for(int j = 0 ; j < a[0].length ;j++) {
                total += a[i][j];
            }
            totalAssets[i] = total;
        }
        for (int i = 0; i < totalAssets.length; i++) {
            if(totalAssets[i] > max){
                max = totalAssets[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] [] a = {{1,2,3},{3,2,1}};
        maximumWealth(a);
    }
}