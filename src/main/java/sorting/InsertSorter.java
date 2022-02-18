package sorting;

public class InsertSorter implements Sorter {
    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] copiedInput = input.clone();

        int n = copiedInput.length;
        for (int j = 1; j < n; j++) {
            int key = copiedInput[j];
            int i = j-1;
            while ( (i > -1) && ( copiedInput [i] > key ) ) {
                copiedInput [i+1] = copiedInput [i];
                i--;
            }
            copiedInput[i+1] = key;
        }
        return copiedInput;
    }

    @Override
    public String getName() {
        return "insert";
    }
}
