class Solution {
    public String longestCommonPrefix(String[] strs) {
        /* 1 
        
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

        */

        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}