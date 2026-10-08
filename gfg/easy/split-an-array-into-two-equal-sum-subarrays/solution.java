class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int total = 0;
        for (int i = 0; i < arr.length; i++)
                total += arr[i];

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
                leftSum += arr[i];

        int rightSum = total - leftSum;

        if (leftSum == rightSum)
                return true;
            }

        return false;
    }
}