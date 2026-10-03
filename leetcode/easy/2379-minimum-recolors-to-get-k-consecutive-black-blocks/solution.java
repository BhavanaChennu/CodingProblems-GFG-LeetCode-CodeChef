class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minop = 0 , tempWhite = 0;
        for(int i = 0; i < k; i++){
            char ch = blocks.charAt(i);
            if(ch == 'W'){
                tempWhite++;
            }
        }
        minop = tempWhite;
        for(int i = k; i < blocks.length(); i++){
            if( blocks.charAt(i - k) == 'W')
                tempWhite--;
            if( blocks.charAt(i) == 'W')
                tempWhite++;
            minop = Math.min(minop , tempWhite);        
        }
        return minop;
    }
}