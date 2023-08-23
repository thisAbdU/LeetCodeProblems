class Solution {
    public int oddCells(int m, int n, int[][] indices) {
         int[] rows = new int[m];
        int[] column = new int[n];
        for(int[] elt: indices){
            rows[elt[0]]++;
            column[elt[1]]++;
        }
        int result = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if((rows[i] + column[j])%2 != 0){
                    result++;
                }
            }
        }return result;
    }
    
    }

