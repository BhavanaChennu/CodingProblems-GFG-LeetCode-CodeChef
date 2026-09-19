class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < strs.length; i++) {
            String sb = strs[i];
            int sum = 0; 
            boolean hasLetter = false;
            for (int j = 0; j < sb.length(); j++) {
                if (Character.isLetter(sb.charAt(j))) {
                    hasLetter = true;
                    break;
                }
            }
            if (hasLetter) {
                sum = sb.length();
            } else {
                sum = Integer.parseInt(sb);
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}