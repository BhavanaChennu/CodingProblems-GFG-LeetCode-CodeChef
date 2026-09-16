class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int count = map.getOrDefault(arr[i] , 0)+1;
            map.put(arr[i] , count);
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }
}