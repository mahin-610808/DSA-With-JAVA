package BasicProblem;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] number = {60, 20, 30, 40, 50};
       Arrays.sort(number);
      int target =50;
     int left=0;
     int right=number.length-1;
    while(left<=right) {
        int mid = (left + right) / 2;
        if (number[mid] == target) {
            System.out.println("found"+mid);
            break;

        } else if (number[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    }
}
