import java.util.*;
class Solution {
    static int largestPrimeFactor(int n) {
        int i = 2;
        int largest = -1;

        while (i <= n) {
            if (n % i == 0) {
                largest = i;
                n = n / i;
            } else {
                i++;
            }
        }
        return largest;
    }
}