public class NumberSorter {

    public <T extends Number & Comparable<T>> T[] sort(T[] input) {
        int n = input.length;
        T temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                T t = input[j - 1];
                T t1 = input[j];
                if (t.compareTo(t1) > 0) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }

            }
        }
        return input;
    }
}
