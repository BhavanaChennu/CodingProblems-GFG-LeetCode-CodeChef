class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i] ,0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= arr.length; i++){
            if(!map.containsKey(i)){
                list.add(0);
            }else{
                list.add(map.get(i));
            }
        }
        return list;
    }
}
