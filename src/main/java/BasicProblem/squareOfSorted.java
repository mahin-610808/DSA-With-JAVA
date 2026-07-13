package BasicProblem;

import java.util.Arrays;

public class squareOfSorted {

    public static void main(String[] args) {

                int[] nums={-4,2,1,0,3,5};
                int left = 0;
                int right = nums.length - 1;

                int[] ans = new int[nums.length];

                int k = nums.length - 1;

                while (left <= right) {

                    if (Math.abs(nums[left]) > Math.abs(nums[right])) {

                        ans[k] = nums[left] * nums[left];
                        left++;

                    } else {

                        ans[k] = nums[right] * nums[right];
                        right--;
                    }

                    k--;
                }

        System.out.println(Arrays.toString(ans));
            }
        }


