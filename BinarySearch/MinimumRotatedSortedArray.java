package BinarySearch;

import java.util.Scanner;

public class MinimumRotatedSortedArray {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        int res = Integer.MAX_VALUE;
        if (nums.length == 1) {
            return nums[0];
        }
        while (low < high) {
            if (nums[low] <= nums[mid] || nums[low] >= nums[mid]) {
                res = Math.min(res, Math.min(nums[low], nums[mid]));
                low++;
            }
            if (nums[high] <= nums[mid] || nums[high] >= nums[mid]) {
                res = Math.min(res, Math.min(nums[high], nums[mid]));
                high--;
            }
        }
        return res;
    }

    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            int[] nums= new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int result=findMin(nums);
            System.out.println("Minimum number in Rotated Sorted Array :"+ result);
        }
    }
}
