package BasicProblem;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int i,j;
        for( i=0,j=n-1;i<j;i++,j--){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
