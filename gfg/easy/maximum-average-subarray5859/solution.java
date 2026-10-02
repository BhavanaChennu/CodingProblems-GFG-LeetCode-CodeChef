class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int maxSum = sum;
        int maxIndex = 0;
        for (int i = k; i < arr.size(); i++) {
            sum += arr.get(i) - arr.get(i - k);
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i - k + 1;
            }
        }
        return maxIndex;
    }
}