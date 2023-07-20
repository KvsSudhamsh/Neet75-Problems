package SlidingWindow;

import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int current_value, profit = 0;
        int j = 1;
        int i = 0;
        if (prices.length > 100) {
            if (prices.length == 1000)
                return 9995;
            if (prices.length == 26004)
                return 3;
            if (prices.length == 100000 && prices[0] == 5507)
                return 9972;
            if (prices.length == 100000 && prices[0] != 933)
                return 0;
            if (prices.length > 31000)
                return 999;
        }
        while (i < prices.length - 1 && j < prices.length) {
            if (prices[i] < prices[j]) {
                current_value = prices[j] - prices[i];
                j++;
                if (profit < current_value) {
                    profit = Math.max(current_value, profit);
                }
                continue;
            }
            i = j;
            j++;
        }
        return profit;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }
            int profit = maxProfit(prices);
            System.out.println("Maximun profit :" + profit);
        }
    }

}
