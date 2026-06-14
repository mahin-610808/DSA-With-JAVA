package BasicProblem;

public class SecondMaxNumber {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,10};
        int n= arr.length;
        int max=arr[0];
        int secMax=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                secMax=max;
                max=arr[i];
            }
        }
        System.out.println("Second Max Number Of Array secMax:"+secMax);
    }
}
