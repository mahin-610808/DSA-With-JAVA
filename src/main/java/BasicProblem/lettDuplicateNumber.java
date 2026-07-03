package BasicProblem;

import java.util.Arrays;

public class lettDuplicateNumber {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
               j++;
               nums[j]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
