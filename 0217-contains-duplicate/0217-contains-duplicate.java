class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> unique = new HashSet<>();

      for (int i: nums) {
        unique.add(i);
      }
      if (nums.length - unique.size() != 0) {
        return true;
      }else{
        return false;
      }  
    }
}