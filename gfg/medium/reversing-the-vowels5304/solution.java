class Solution {
    public String modify(String s) {
        // code here
        Set<Character> vowels = new HashSet<>(Arrays.asList('A' , 'E' ,'I' , 'O','U','a','e','i','o','u'));
        char[] ch = s.toCharArray();
        int left = 0 , right = s.length()-1;
        while( left < right){
            if(!vowels.contains(ch[left])) left++;
            else if(!vowels.contains(ch[right])) right--;
            else{
                if(vowels.contains(ch[left]) && vowels.contains(ch[right])){
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left ++;
                    right--;
                }
            }
        }
        return String.valueOf(ch);
    }
}