class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> altitudes = new ArrayList<>();
        altitudes.add(0);
        for(int i = 0; i < gain.length; i++){
            altitudes.add(altitudes.get(i) + gain[i]);
        }
        return Collections.max(altitudes);
    }
}