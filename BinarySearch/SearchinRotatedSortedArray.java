package BinarySearch;

import java.util.Scanner;

public class SearchinRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        if (nums[mid] == target) {
            return mid;
        }
        while (low < high) {
            if (nums[low] <= nums[mid] || nums[low] >= nums[mid]) {
                if (target == nums[low]) {
                    return low;
                }
                low++;
            }
            if (nums[high] <= nums[mid] || nums[high] >= nums[mid]) {
                if (target == nums[high]) {
                    return high;
                }
                high--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int result = search(nums, t);
            System.out.println("Element found at index :" + result);
        }
    }
}
