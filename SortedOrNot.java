public class SortedOrNot{
    public boolean arraySortedOrNot(int[] arr){
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]){
                return false;
            }
            i++;

        }return true;
    }
}