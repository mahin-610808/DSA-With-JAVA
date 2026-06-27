package Stack;



import java.util.Stack;

public class infixToPostfix {

    // তোমার infix code থেকে নেওয়া same prec() method
    static int prec(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    public static void main(String[] args) {

        String str = "9-(5+3)*4";
        Stack<Character> op = new Stack<>();
        StringBuilder output = new StringBuilder(); // Postfix result

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // ১. সংখ্যা হলে সরাসরি output-এ
            if (ch >= '0' && ch <= '9') {
                output.append(ch);
                System.out.println("Output: " + ch + " -> " + output);

                // ২. '(' হলে stack-এ push
            } else if (ch == '(') {
                op.push(ch);
                System.out.println("Push '(' -> stack: " + op);

                // ৩. ')' হলে '(' পর্যন্ত pop করো
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    output.append(op.pop());
                    System.out.println("Pop to output -> " + output);
                }
                op.pop(); // '(' টা remove করো, output-এ দিও না
                System.out.println("Remove '(' -> stack: " + op);

                // ৪. Operator হলে priority check করে push
            } else {
                while (!op.isEmpty() && op.peek() != '('
                        && prec(op.peek()) >= prec(ch)) {
                    output.append(op.pop());
                    System.out.println("Pop higher priority -> " + output);
                }
                op.push(ch);
                System.out.println("Push '" + ch + "' -> stack: " + op);
            }
        }

        // ৫. বাকি সব operator output-এ দাও
        while (!op.isEmpty()) {
            output.append(op.pop());
        }

        System.out.println("\nPostfix Result: " + output);
    }
}