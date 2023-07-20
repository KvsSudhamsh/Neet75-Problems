package TwoPointers;

import java.util.Scanner;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int pro = 0;
        int res = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            if (height[i] < height[j]) {
                pro = (j - i) * height[i];
                if (pro > res) {
                    res = pro;
                }
                i++;
            } else {
                pro = (j - i) * height[j];
                if (pro > res) {
                    res = pro;
                }
                j--;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }
            int res = maxArea(height);
            System.out.println("Max area of the container with most water:" + res);
        }
    }
}
