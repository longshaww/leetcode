public class _1920 {
    public static int[] buildArray(int[] nums) {
        int [] tempArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[nums[i]];
            tempArr[i] = temp;
        }   
        return tempArr;
    }
    public static void main (String[] args) {
        int [] a = {5,0,1,2,3,4};
        buildArray(a);
        System.out.println("Done");
    }
}
