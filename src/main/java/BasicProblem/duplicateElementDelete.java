package BasicProblem;

import java.util.LinkedHashSet;
public class duplicateElementDelete {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,3,5};
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
