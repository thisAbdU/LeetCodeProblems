class Solution {
    public boolean isPalindrome(String s) {
      String cleanedString = convertToLowerCaseRemoveNonAlphaNumeric(s);

        int start = 0;
        int end = cleanedString.length() -1;

        while (start < end) {
            if (cleanedString.charAt(start) != cleanedString.charAt(end)) {
                return false;
            }
            
            start++;
            end--;

        }return true;
    }

    public String convertToLowerCaseRemoveNonAlphaNumeric(String string){
        String word = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return word;
    }
}