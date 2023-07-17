import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();

        for (int i : nums) {
            if (res.containsKey(i)) {
                int count = res.get(i);
                res.put(i, count + 1);
            } else {
                res.put(i, 1);
            }
        }
        List<Integer> valueList = new ArrayList<>();
        for (int i : res.keySet()) {
            valueList.add(i);
        }
        Collections.sort(valueList, (a, b) -> res.get(b) - res.get(a));
        int[] resarr = new int[Math.min(k, valueList.size())];
        for (int i = 0; i < resarr.length; i++) {
            resarr[i] = valueList.get(i);
        }
        return resarr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int[] topKFrequent = topKFrequent(nums, k);
            for (int i = 0; i < topKFrequent.length; i++) {
                System.out.print(topKFrequent[i] + " ");
            }
        }
    }
}