package Stack;

import java.util.Scanner;
import java.util.*;

public class bracketBalanceP {
    public static Boolean isBalance(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
           char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else { // closing bracket
                    if(st.isEmpty()) return false;

                    if(ch == ')') {
                        if(st.peek() != '(') return false;
                        st.pop();
                    }
                    else if(ch == '}') {
                        if(st.peek() != '{') return false;
                        st.pop();
                    }
                    else if(ch == ']') {
                        if(st.peek() != '[') return false;
                        st.pop();
                    }
                }

        }
        if(st.size()>0)return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Brackets:");
        String str=sc.nextLine();
        System.out.println(isBalance(str));
    }
}
