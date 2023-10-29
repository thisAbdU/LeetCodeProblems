class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int count = 0;
        
        while (i <= j) {  // Change while condition to handle the last person
            int sum = people[i] + people[j]; 
            if (sum <= limit) {
                i++;
            }
            j--;
            count++;
        }
        return count;
    }
}
