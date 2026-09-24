package BasicProblem;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);

            int length = right - left + 1;

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int answer = lengthOfLongestSubstring(s);

        System.out.println("Longest substring length: " + answer);
    }
}