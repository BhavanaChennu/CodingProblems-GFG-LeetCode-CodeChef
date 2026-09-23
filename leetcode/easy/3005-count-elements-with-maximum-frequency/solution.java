class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxfreq = 0, totalmax = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0)+1);
            maxfreq = Math.max(maxfreq , map.get(num));
        }
        for(int i = 0 ; i < nums.length; i++){
            if( maxfreq == map.get(nums[i])){
                totalmax +=1;
            }
        }
        return totalmax;
    }
}