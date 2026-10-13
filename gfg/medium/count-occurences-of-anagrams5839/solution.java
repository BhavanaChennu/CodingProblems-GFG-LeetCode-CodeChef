class Solution {

    int search(String pat, String txt) {
        // code here
        int n = txt.length();
        int m = pat.length();
        
        if (m > n) return 0;
        
        int[] patFreq = new int[26];
        int[] txtFreq = new int[26];
        
        for (int i = 0; i < m; i++) {
            patFreq[pat.charAt(i) - 'a']++;
            txtFreq[txt.charAt(i) - 'a']++;
        }
        int count = 0;
        if (Arrays.equals(patFreq, txtFreq)) {
            count++;
        }
        for (int i = m; i < n; i++) {
            txtFreq[txt.charAt(i) - 'a']++;
            txtFreq[txt.charAt(i - m) - 'a']--;
            if (Arrays.equals(patFreq, txtFreq)) {
                count++;
            }
        }
        return count;
    }
}