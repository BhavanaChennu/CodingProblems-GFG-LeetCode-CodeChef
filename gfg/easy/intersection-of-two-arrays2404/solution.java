class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
        for(int num : a){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        for(int num : b){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        for(int i = 0 ; i < a.length; i++){
            if(map.get(a[i]) > 1){
                count++; 
            }
        }
        return count;
    }
}