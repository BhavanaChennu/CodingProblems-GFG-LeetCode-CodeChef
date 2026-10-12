import java.util.HashSet;

class Solution {
    public boolean subArrayExists(int[] arr) {
        HashSet<Integer> prefixSums = new HashSet<>();
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;

            if (currentSum == 0 || prefixSums.contains(currentSum)) {
                return true;
            }
            prefixSums.add(currentSum);
        }

        return false;
    }
}