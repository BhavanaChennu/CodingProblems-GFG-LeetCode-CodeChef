class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            stack.push(S.charAt(i));
        }
       StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
           reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}