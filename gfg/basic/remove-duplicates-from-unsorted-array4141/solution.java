class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> a = new ArrayList<>(set);
        
        return a;
    }
}