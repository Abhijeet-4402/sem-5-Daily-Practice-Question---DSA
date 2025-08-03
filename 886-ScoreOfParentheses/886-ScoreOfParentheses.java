// Last updated: 4/8/2025, 12:03:45 am
import java.util.Stack;

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int sum = 0; // Make sum local

        for(char c : s.toCharArray()) {
            if(!st.isEmpty() && c == ')' && st.peek() == '(') {
                st.pop();
                st.push('1'); // () = 1
            } else if(c == ')') {
                int val = solve(st);
                st.push((char)(val + '0')); // push result as char digit
            } else {
                st.push(c);
            }
        }

        while(!st.isEmpty()) {
            sum += st.pop() - '0';
        }

        return sum;
    }

    public int solve(Stack<Character> st) {
        int tempSum = 0;
        while(!st.isEmpty() && st.peek() != '(') {
            tempSum += st.pop() - '0'; // get numeric value
        }
        st.pop(); // remove '('
        return 2 * tempSum;
    }
}
