class Solution {
    public int compress(char[] chars) {
        int i=0,j=0;
        while(i<chars.length)
        {
            char current=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==current)
            {
                i++;
                count++;
            }
            chars[j++]=current;
            if(count>1)
            {
                String str=String.valueOf(count);
                for(char c:str.toCharArray())
                {
                    chars[j++]=c;
                }
            }
        }
        return j;
    }
}