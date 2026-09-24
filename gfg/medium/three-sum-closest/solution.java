class Solution {
    public int closest3Sum(int[] arr, int target) {
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                } 
                else if (Math.abs(currentSum - target) == Math.abs(closestSum - target)) {
                    closestSum = Math.max(closestSum, currentSum);
                }
                
                if (currentSum == target) {
                    return currentSum; 
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}