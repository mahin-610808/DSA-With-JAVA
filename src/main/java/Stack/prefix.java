package Stack;

import java.util.Stack;

public class prefix {

    public static void main(String[] args) {

        String str = "+5*(32)";  // Infix: 5 + 3*2 = 11

        Stack<Integer> val = new Stack<>();

        // Dan theke bame poro
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == ')') continue;

            // Sonkha hole push koro
            if (ch >= '0' && ch <= '9') {
                val.push(ch - '0');
                System.out.println("Push: " + (ch - '0') + " -> stack: " + val);

                // Operator hole 2ta pop kore calculate koro
            } else {
                int v1 = val.pop();
                int v2 = val.pop();
                System.out.print("Calculate: " + v1 + " " + ch + " " + v2 + " = ");

                if (ch == '+') val.push(v1 + v2);
                if (ch == '-') val.push(v1 - v2);
                if (ch == '*') val.push(v1 * v2);
                if (ch == '/') val.push(v1 / v2);

                System.out.println(val.peek() + " -> stack: " + val);
            }
        }

        System.out.println("\nFinal Answer: " + val.peek());
    }
}