class Sol {
    int getCount(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (i == 0 || curr != s.charAt(i - 1)) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
            }
        }

        int count = 0;
        for (int val : map.values()) {
            if (val == k) {
                count++;
            }
        }

        return count;
    }
}