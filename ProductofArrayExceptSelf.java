import java.util.*;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int flag = 1;
        for (int i = 0; i < nums.length; i++) {
            flag *= nums[i];
            res[i] = flag;
        }
        flag = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            res[i] = res[i - 1] * flag;
            flag = flag * nums[i];
        }
        res[0] = flag;
        return res;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int res[] = productExceptSelf(nums);
            for (int i = 0; i < n; i++)
                System.out.print(res[i] + " ");
        }
    }
}
