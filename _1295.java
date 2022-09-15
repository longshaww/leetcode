public class _1295 {

    public static int CountNumberOfIndex(int num){

        int count = 0 ;
        while (num != 0){
            num = num/10 ;
            count ++;
        }  
        return count;
    }

    public static int ParseString(int num) {
        return Integer.toString(num).length();
    }

    public static int FindNumberWithEvenDigits(int[] nums){
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if (CountNumberOfIndex(nums[i])%2 == 0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,22,3,4};
        System.out.println(FindNumberWithEvenDigits(nums));
    }
}