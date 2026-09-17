package BasicProblem;

import static java.lang.Math.min;

public class minimumSubArraySum {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int left=0;
        int right;
        int sum=0;
        int target=7;
        int answer = Integer.MAX_VALUE;

            for( right=0;right<nums.length;right++){
                sum+=nums[right];
                while(sum>=target){
                    int   currentLength = right - left + 1;
                    answer = min(answer, currentLength);
                    sum -=nums[left];
                    left++;
                }
            }

        System.out.println(answer);
    }
}
