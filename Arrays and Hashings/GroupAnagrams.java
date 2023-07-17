import java.util.*;

class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedword = new String(ch);

            if (!anagrams.containsKey(sortedword)) {
                anagrams.put(sortedword, new ArrayList<>());
            }
            anagrams.get(sortedword).add(word);
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] strs = new String[n];
            for (int i = 0; i < n; i++) {
                strs[i] = sc.nextLine();
            }
            List<List<String>> result = groupAnagrams(strs);

            for (List<String> res : result) {
                System.out.println(res);
            }
        }
    }
}