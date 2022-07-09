import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSorterTest extends AbstractNumberSorterTest<Integer> {
    @Override
    protected Integer[] givenSortedInput(Integer[] unsortedInput) {
        List<Integer> copy = Arrays.asList(unsortedInput);
        return  copy.stream().sorted().toArray(Integer[]::new);
    }


    @Override
    protected Integer[] givenUnsortedInput() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            result.add(r.nextInt(Integer.MAX_VALUE));
        }
        return result.toArray(new Integer[listLength]);
    }
}
