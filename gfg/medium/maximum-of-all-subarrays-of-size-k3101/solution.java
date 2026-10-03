import java.util.*;

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && arr[queue.peekLast()] <= arr[i]) {
                queue.pollLast();
            }
            queue.offerLast(i);
        }

        for (int i = k; i < arr.length; i++) {
            list.add(arr[queue.peekFirst()]);

            while (!queue.isEmpty() && queue.peekFirst() <= i - k) {
                queue.pollFirst();
            }

            while (!queue.isEmpty() && arr[queue.peekLast()] <= arr[i]) {
                queue.pollLast();
            }

            queue.offerLast(i);
        }

        if (!queue.isEmpty()) {
            list.add(arr[queue.peekFirst()]);
        }

        return list;
    }
}