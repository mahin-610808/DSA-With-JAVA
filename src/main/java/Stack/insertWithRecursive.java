package Stack;

import java.util.Scanner;
import java.util.Stack;

public class insertWithRecursive {
    public static void displayrec(Stack<Integer> st,int x){

        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        displayrec(st,x);
        System.out.print(top+" ");
        st.push(top);
        System.out.println(" ");
    }
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
        System.out.println("Insert the number:");
        int x=sc.nextInt();
        displayrec(st,x);
        System.out.println(st);
    }
}
