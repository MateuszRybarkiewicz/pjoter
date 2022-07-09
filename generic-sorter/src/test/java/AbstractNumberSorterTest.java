import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public abstract class AbstractNumberSorterTest<T extends Number & Comparable<T>> {

    private NumberSorter sorter = new NumberSorter();
    protected int listLength = 100;
    protected Random r = new Random();

    @Test
    public void givenInputItIsSorted() {
        T[] unsortedInput = givenUnsortedInput();
        T[] sortedInput = givenSortedInput(unsortedInput);
        sorter.sort(unsortedInput);

        assertArrayEquals(unsortedInput, sortedInput);
    }

    protected abstract T[] givenSortedInput(T[] unsortedInput);

    protected abstract T[] givenUnsortedInput();
}
