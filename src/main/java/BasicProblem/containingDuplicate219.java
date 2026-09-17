package BasicProblem;

import java.util.HashSet;
// just logic for leetcode
public class containingDuplicate219 {
    public static void main(String[] args) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}