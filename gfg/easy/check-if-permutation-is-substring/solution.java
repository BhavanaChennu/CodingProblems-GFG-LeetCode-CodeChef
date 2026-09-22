class Solution {
    boolean search(String txt, String pat) {
        // Write your code here
        int n1 = pat.length();
        int n2 = txt.length();
        
        int count1[] = new int[26];
        int count2[] = new int[26];
        
        if (n1 > n2) return false;
        
        for(int i = 0 ; i < n1; i++){
            count1[pat.charAt(i) - 'a']++;
            count2[txt.charAt(i) - 'a']++;
        }
        for(int i = 0; i < n2 - n1; i++){
            if(Arrays.equals(count1 , count2)){
                return true;
            }
            count2[txt.charAt(i + n1) - 'a']++;
            count2[txt.charAt(i) - 'a']--;
        }
        return Arrays.equals(count1, count2);
    }
}