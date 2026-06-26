package Stack;

import java.util.Stack;

public class infix {

    static int prec(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    static void applyOp(Stack<Integer> val, Stack<Character> op) {
        int v2 = val.pop();
        int v1 = val.pop();
        char oper = op.pop();
        switch (oper) {
            case '+': val.push(v1 + v2); break;
            case '-': val.push(v1 - v2); break;
            case '*': val.push(v1 * v2); break;
            case '/': val.push(v1 / v2); break;
        }
    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                val.push(ch - '0');

            } else if (ch == '(') {
                op.push(ch);

            } else if (ch == ')') {
                while (op.peek() != '(') {
                    applyOp(val, op);
                }
                op.pop(); // '(' remove koro

            } else { // +, -, *, /
                // op stack-e jetar priority beshi ba soman, age calculate koro
                while (!op.isEmpty() && op.peek() != '('
                        && prec(op.peek()) >= prec(ch)) {
                    applyOp(val, op);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            applyOp(val, op);
        }

        System.out.println(val.peek()); // Output: 7
    }
}