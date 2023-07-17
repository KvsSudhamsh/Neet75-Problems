import java.util.*;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
        }
        int result = 0;
        for (int i : nums) {
            if (res.contains(i - 1))
                continue;
            int count = 0;
            while (res.remove(i++))
                count++;
            if (count > result)
                result = count;
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int res = longestConsecutive(nums);
            System.out.println(res);
        }
    }
}
