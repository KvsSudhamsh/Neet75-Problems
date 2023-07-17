import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int[] twosum = twoSum(nums, target);
            for (int i = 0; i < 2; i++) {
                System.out.print(twosum[i] + " ");
            }
        }
    }
}
