import java.util.ArrayList;

class Solution {
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> result = new ArrayList<>();
        int pairs = n / 2; 
        backtrack(result, new StringBuilder(), 0, 0, pairs);
        return result;
    }

    private void backtrack(ArrayList<String> result, StringBuilder current, int open, int close, int pairs) {
        
        if (current.length() == pairs * 2) {
            result.add(current.toString());
            return;
        }

        if (open < pairs) {
            current.append('(');
            backtrack(result, current, open + 1, close, pairs);
            current.deleteCharAt(current.length() - 1); 
        }

        if (close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, pairs);
            current.deleteCharAt(current.length() - 1); 
        }
    }
}