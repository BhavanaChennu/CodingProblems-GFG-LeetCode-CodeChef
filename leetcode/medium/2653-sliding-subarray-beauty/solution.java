class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int[] freq = new int[101]; 

        for (int i = 0; i < n; i++) {
            freq[nums[i] + 50]++;

            if (i >= k) {
                freq[nums[i - k] + 50]--;
            }
            if (i >= k - 1) {
                int count = 0;
                for (int val = -50; val < 0; val++) {
                    count += freq[val + 50];
                    if (count >= x) {
                        res[i - k + 1] = val;
                        break;
                    }
                }
            }
        }
        return res;
    }
}