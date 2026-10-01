class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>(); 
        for(int i = 0; i < k; i++){
            if(arr[i] < 0){
                queue.add(i);
            }
        }
        if(queue.isEmpty()){
            list.add(0);
        }else{
            list.add(arr[queue.peek()]);
        }
        
        for (int i = k; i < arr.length; i++) {
            int left = i - k + 1; 
            while (!queue.isEmpty() && queue.peek() < left) {
                queue.poll();
            }
            if (arr[i] < 0) {
                queue.add(i);
            }
            if (queue.isEmpty()) {
                list.add(0);
            } else {
                list.add(arr[queue.peek()]);
            }
        }
        return list;
    }
}