class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum = 0;
        int left = 0 , right = k-1 ;
        for(int i = left ; i <= right; i++){
            sum = sum + arr[i];
        }
        int maxSum = sum;
        while(right < arr.length - 1 ){
            sum = sum - arr[left];
            left++ ; right++;
            sum = sum + arr[right];
            maxSum = Math.max(maxSum , sum);
        }
        
        return maxSum;
    }
}