class Solution {
    public int[] prefixAvg(int[] arr) {
        // code here
        int sum = 0;
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            int length = i + 1;
            int avg = sum / length;
            ans[i] = avg;
        }
        return ans;
    }
}