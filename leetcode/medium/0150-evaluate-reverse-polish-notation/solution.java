import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for (String s : tokens) { 
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int val2 = st.pop();
                int val1 = st.pop();
                int result = 0;
                
                switch (s) {
                    case "+":
                        result = val1 + val2;
                        break;
                    case "-":
                        result = val1 - val2;
                        break;
                    case "*":
                        result = val1 * val2;
                        break;
                    case "/":
                        result = val1 / val2; 
                        break;
                }
                st.push(result);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}