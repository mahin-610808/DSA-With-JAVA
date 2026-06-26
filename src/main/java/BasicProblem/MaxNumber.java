package BasicProblem;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr ={3,4,10,1,10,5,5};
        int n= arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max Element Of Array:"+max);
    }
}
