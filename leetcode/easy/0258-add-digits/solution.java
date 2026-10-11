class Solution {
    public int addDigits(int num) {
        while( num >= 10){
            int total = 0;
            while( num > 0){
              int r = num % 10;
              total += r;
              num /= 10;
            }
            num = total;
        }
        return num;
    }
}