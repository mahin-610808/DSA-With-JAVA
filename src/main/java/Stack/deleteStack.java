package Stack;

import java.util.Scanner;
import java.util.Stack;

public class deleteStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("Enter the number of element:");
        n=sc.nextInt();
        System.out.println("Enter the element:");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        System.out.println("Select the index number which is delete:");
        int indx=sc.nextInt();


        //new stack create
        Stack<Integer> rt=new Stack<>();
        while(st.size()>indx+1){
           rt.push(st.pop());
        }
          st.pop();

        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
