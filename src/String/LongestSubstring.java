package String;

import java.util.HashSet;

public class LongestSubstring {
    private static int longestUnique(String str) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxCount = 0;

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.println(longestUnique(str));
    }
}

/*
    Time : O(n)
    Space : O(n)
    Approach : Sliding Window
 */