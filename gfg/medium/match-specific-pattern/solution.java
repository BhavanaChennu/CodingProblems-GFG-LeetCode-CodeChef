import java.util.ArrayList;
class Solution {
    public ArrayList<String> matchingStrings(ArrayList<String> d, String pat) {
        ArrayList<String> result = new ArrayList<>();
        for (int k = 0; k < d.size(); k++) {
            String str = d.get(k);
            if (isMatch(str, pat)) {
                result.add(str);
            }
        }
        return result;
    }
    public static boolean isMatch(String str, String pat) {
        if (str.length() != pat.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (pat.charAt(i) != pat.charAt(j)) {
                        return false;
                    }
                } else {
                    if (pat.charAt(i) == pat.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}