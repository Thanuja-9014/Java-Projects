package balaji;
import java.util.*;

public class LongestSubStringPractice {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // ✅ Main method to test the code
    public static void main(String[] args) {
        LongestSubStringPractice ls = new LongestSubStringPractice();
        String input = "abcabcgdddddbb";

        int result = ls.lengthOfLongestSubstring(input);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }
}
