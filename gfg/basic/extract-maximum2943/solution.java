class Solution {
    static int extractMaximum(String s) {
        // code here
        int max = Integer.MIN_VALUE , current = 0;
        boolean isNumber = false;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                current = current * 10 + Character.getNumericValue(s.charAt(i));
                isNumber = true;
            }
            else{
                if(isNumber){
                    max = Math.max(max , current);
                    current = 0;
                    isNumber = false;
                }
            }
        }
         if(isNumber){
                    max = Math.max(max , current);
            }
            
            return max == Integer.MIN_VALUE ? -1 : max;
    }
}
