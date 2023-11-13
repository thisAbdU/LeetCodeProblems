import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> wordMap = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray); // Sort the characters of the word

            String sortedWord = new String(charArray);

            if (!wordMap.containsKey(sortedWord)) {
                wordMap.put(sortedWord, new ArrayList<>());
            }

            wordMap.get(sortedWord).add(word);
        }

        return new ArrayList<>(wordMap.values());
    }
}
