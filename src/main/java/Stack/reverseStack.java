package Stack;
import java.util.Scanner;
import java.util.Stack;
public class reverseStack {
    public static void displayrec(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
       // System.out.print(top+" "); ei line reverse kore print kore
        displayrec(st);
        System.out.print(top+" "); // ei line same vabe print kore
        st.push(top);

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
        System.out.println(st);
        displayrec(st);
    }
}
