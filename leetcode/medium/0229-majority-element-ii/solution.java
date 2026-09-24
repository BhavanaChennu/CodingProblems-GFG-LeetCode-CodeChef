class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = map.getOrDefault(nums[i], 0)+1;
            map.put(nums[i] , count);
            if(count == (n / 3) + 1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}