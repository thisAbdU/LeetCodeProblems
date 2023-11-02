import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int x = s1.length();
        int y = s2.length();
        if (y < x) return false;
        if (x == 0) return true;

        int[] s1Char = new int[26];
        int[] s2Char = new int[26];

        for (int i = 0; i < x; i++) {
            s1Char[s1.charAt(i) - 'a']++;
            s2Char[s2.charAt(i) - 'a']++;
        }

        for (int i = x; i < y; i++) {
            if (Arrays.equals(s1Char, s2Char)) {
                return true;
            }
            s2Char[s2.charAt(i - x) - 'a']--;
            s2Char[s2.charAt(i) - 'a']++;
        }

        return Arrays.equals(s1Char, s2Char);
    }
}
