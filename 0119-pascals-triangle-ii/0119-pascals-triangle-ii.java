import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            // Calculate the current row based on the previous row
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }

            newRow.add(1); // Last element is always 1

            // Update the current row as the new row
            row = newRow;
        }

        return row;
    }
}
