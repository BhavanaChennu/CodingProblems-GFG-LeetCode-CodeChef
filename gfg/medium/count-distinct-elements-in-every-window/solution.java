class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0 , right = k , count = 0;
        for(int i = 0; i < k; i++){
           map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        list.add( map.size());
        while(right < arr.length){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            if(map.get(arr[left] )> 1){
                map.put(arr[left], map.get(arr[left]) - 1);
            }else if(map.get(arr[left] )== 1){
                map.remove(arr[left]);
            }
            list.add( map.size());
            right++; left++;
            
        }
        return list;
    }
}