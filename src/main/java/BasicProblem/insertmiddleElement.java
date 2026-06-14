package BasicProblem;

import java.util.Arrays;

public class insertmiddleElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
       int[] res=new int[arr.length+1];
        int middle=arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(i<middle){
                res[i]=arr[i];
            } else if (i==middle) {
                res[i]=99;
                res[i+1]=arr[i];
            } else{
                res[i+1]=arr[i];

            }

        }
        System.out.println(Arrays.toString(res));
    }
}
