class Solution {
    public String largestMerge(String word1, String word2) {
        int word1Pos = 0;
        int word2Pos = 0;
        StringBuilder mergedBuilder = new StringBuilder();

        while (word1Pos < word1.length() && word2Pos < word2.length()) {
            if (word1.substring(word1Pos).compareTo(word2.substring(word2Pos)) > 0) {
                mergedBuilder.append(word1.charAt(word1Pos));
                word1Pos++;
            } else {
                mergedBuilder.append(word2.charAt(word2Pos));
                word2Pos++;
            }
        }

        while (word1Pos < word1.length()) {
            mergedBuilder.append(word1.charAt(word1Pos));
            word1Pos++;
        }

        while (word2Pos < word2.length()) {
            mergedBuilder.append(word2.charAt(word2Pos));
            word2Pos++;
        }

        return mergedBuilder.toString();
    }
}
