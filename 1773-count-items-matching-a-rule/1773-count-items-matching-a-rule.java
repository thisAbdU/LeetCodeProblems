class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int searchIndex = 0;
        int count = 0; 
        if ("color".equals(ruleKey)) {
            searchIndex = 1;
        } else if ("name".equals(ruleKey)) {
            searchIndex = 2;
        }
        for (int i = 0; i < items.size(); i++) {
             if (items.get(i).get(searchIndex).equals(ruleValue))  {
                count++;
            }
        }
        return count; 
    }
}