package Stack;

import java.util.Scanner;
import java.util.Stack;

public class insertElement {
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
        System.out.println("Enter the index number:");
        int indx=sc.nextInt();
        System.out.println("Enter the element which is insert:");
        int x=sc.nextInt();

        //new stack create
        Stack<Integer> rt=new Stack<>();
        while(st.size()>indx){ //ekhane indx na likhe jdi 0 ditam tahole bottome insert hoito
            rt.push(st.pop());
        }
        System.out.println(rt);
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
