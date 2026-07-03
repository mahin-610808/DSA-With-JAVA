package BasicProblem;

import java.util.Arrays;

public class TwoSumPointer {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        int  j=numbers.length-1;
        int i=0;
           while(i<j){
               int sum=numbers[i]+numbers[j];
               if(sum==target){
                   System.out.println("Index 1: " + (i + 1));
                   System.out.println("Index 2: " + (j + 1));
                   break;
               }else if(sum>target){
                   j--;
               }else{
                   i++;
               }
        }

    }
}
