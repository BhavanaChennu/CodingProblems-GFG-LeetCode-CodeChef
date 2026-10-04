class Solution {
    public int pivotIndex(int[] nums) {
        int prefix = 0 , total =0;

        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }

        for(int pivot = 0; pivot < nums.length; pivot++){
            int suffix = total - prefix - nums[pivot];
            if(prefix == suffix){
                return pivot;
            }
            prefix += nums[pivot];
        }
        return -1;
    }
}