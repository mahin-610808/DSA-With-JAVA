package BasicProblem;

public class validPalindrome {
    public static void main(String[] args) {
        char[] s = {'p','o','p'};
        int left=0;
        int right=s.length-1;
        boolean isPalindrome=true;
        while(left<right){
            if(s[left]!=s[right]){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
