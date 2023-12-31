class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> output_arr = new ArrayList<>();
        
       if(s == null || s.length() == 0) return null;
        
        int[] last_indices = new int[26];
        for(int i = 0; i < s.length(); i++){
            last_indices[s.charAt(i) - 'a'] = i;
        }
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++){
            end = Math.max(end, last_indices[s.charAt(i) - 'a']);
            if(end == i){
                output_arr.add(end - start + 1);
                start = end + 1;
            }
        }
        return output_arr;
    }
}