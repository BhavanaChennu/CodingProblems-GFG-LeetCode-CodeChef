class Solution {
    public static int firstDigit(int n) {
        // code here
        int first = 0;
        while(n > 0){
            int r = n % 10;
            first = r;
            n = n/10;
        }
        return first;
    }
}