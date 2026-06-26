package Stack;
import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(35);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println("Stack size:"+st.size());
    }
}
