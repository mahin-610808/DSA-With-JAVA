import java.util.Arrays;

public class nextGreater {

    public int[] nextGreaterE(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int pos = -1;


            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    pos = j;
                    break;
                }
            }


            ans[i] = -1; // default -1
            for (int k = pos + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    ans[i] = nums2[k];
                    break;
                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        nextGreater sol = new nextGreater();

        // Example 1
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result1 = sol.nextGreaterE(nums1, nums2);
        System.out.println("Example 1 Output: " + Arrays.toString(result1));


        // Example 2
        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};
        int[] result2 = sol.nextGreaterE(nums3, nums4);
        System.out.println("Example 2 Output: " + Arrays.toString(result2));

    }
}