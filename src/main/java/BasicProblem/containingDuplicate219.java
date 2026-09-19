package BasicProblem;

import java.util.HashSet;

public class containingDuplicate219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
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

    public static void main(String[] args) {
        containingDuplicate219  sol = new containingDuplicate219 ();

        System.out.println(sol.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));      // true
        System.out.println(sol.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));      // true
        System.out.println(sol.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));  // false
    }
}