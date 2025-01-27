import java.util.HashSet;

public class LengthofLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0;
        int maxlength = 0;
        HashSet<Character> seen = new HashSet<>();
        for (int end = 0; end < n; end++) {
            while (seen.contains(s.charAt(end))) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxlength = Math.max(maxlength, end - start + 1);
        }
        return maxlength;
    }
}

class Main {
    public static void main(String[] args) {
        LengthofLongestSubstring los = new LengthofLongestSubstring();
        int result = los.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}