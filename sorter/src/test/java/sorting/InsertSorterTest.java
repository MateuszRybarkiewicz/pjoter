package sorting;

public class InsertSorterTest extends AbstractSorterTest{

    @Override
    protected Sorter getSorter() {
        return new InsertSorter();
    }
}
