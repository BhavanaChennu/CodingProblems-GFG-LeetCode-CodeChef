class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i]) == 2)
                list.add(arr[i]);
        }
        return list;
    }
}