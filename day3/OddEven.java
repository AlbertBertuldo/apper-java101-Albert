public class OddEven {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        int oddCount = 0;
        oddCount = numOfOdd(nums, oddCount);
        int evenCount = nums.length - oddCount;

        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }
    public static int numOfOdd(int[] nums, int oddCount){

        for (int num : nums) {
            if ((num & 1) == 1) {
                oddCount++;
            }
        }
        return oddCount;
    }
}
