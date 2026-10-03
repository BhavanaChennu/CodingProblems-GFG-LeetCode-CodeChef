class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0 , right = 0 , maxlen = 0;
        int[] letters = new int[26];
        while(right < s.length()){
            int rightIndex = s.charAt(right) - 'a';
            if(letters[rightIndex] < 2){
                letters[rightIndex]++;
                maxlen = Math.max(maxlen , right - left + 1);
                right++;
            }
            else{
                int leftIndex = s.charAt(left) - 'a';
                letters[leftIndex]--;
                left++;
            }
        }
        return maxlen;
    }
}