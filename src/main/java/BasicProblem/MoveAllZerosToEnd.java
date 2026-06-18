package BasicProblem;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,0,13};
        int n=arr.length;
          int j=0;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println("Final Array:"+Arrays.toString(arr));
    }
}
