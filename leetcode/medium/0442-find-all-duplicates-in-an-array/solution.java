class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
            if(map.get(num) >= 2){
                list.add(num);
            }    
        }
        return list;
    }
}