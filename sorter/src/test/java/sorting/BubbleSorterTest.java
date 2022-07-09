package sorting;

public class BubbleSorterTest extends AbstractSorterTest{

    @Override
    protected Sorter getSorter() {
        return new InsertSorter();
    }
}
