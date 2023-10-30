class Solution {
    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }

        StringBuilder wordFreq = new StringBuilder();
        int start = 0;
        int end = 1;

        while (end <= chars.length) {
            if (end == chars.length || chars[start] != chars[end]) {
                wordFreq.append(chars[start]);
                if (end - start > 1) {
                    wordFreq.append(end - start);
                }

                start = end;
            }

            end++;
        }

        char[] compressed = wordFreq.toString().toCharArray();
        System.arraycopy(compressed, 0, chars, 0, Math.min(compressed.length, chars.length));

        return Math.min(compressed.length, chars.length);
    }
}
