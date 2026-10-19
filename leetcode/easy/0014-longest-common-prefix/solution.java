class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        int i = 0, j = strs.length - 1;
        int m = 0, n = strs[i].length() - 1;

        while (m <= n) {
            if (strs[i].charAt(m) == strs[j].charAt(m)) {
                m++;
            } else {
                break;
            }
        }

        return strs[i].substring(0, m);
    }
}