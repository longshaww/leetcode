public class _387 {
    public static int firstUniqChar(String s) {
       char[] arr = s.toCharArray();
        int[] counts = new int[123];
        for (int i = 0; i < arr.length; i++) {
            int index = (int) arr[i];
            counts[index]++;
        }

        for (int i = 0 ; i < arr.length; i++) {
            int index = (int) arr[i];
            if(counts[index] == 1) {
                return i;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}
