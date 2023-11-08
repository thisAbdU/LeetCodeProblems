class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruit = 0;
        int i = 0;
        int j = 0;
        Map<Integer, Integer> fruitCount = new HashMap<>();

        while (j < fruits.length) {
            fruitCount.put(fruits[j], fruitCount.getOrDefault(fruits[j], 0) + 1);

            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[i], fruitCount.get(fruits[i]) - 1);
                if (fruitCount.get(fruits[i]) == 0) {
                    fruitCount.remove(fruits[i]);
                }
                i++;
            }

            maxFruit = Math.max(maxFruit, j - i + 1);
            j++;
        }

        return maxFruit;
    }
}
