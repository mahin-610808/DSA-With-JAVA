package BasicProblem;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={3,5,2,8};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){

           sum+=arr[i];

        }
         System.out.println("Sum of Array:"+sum);
    }
}
