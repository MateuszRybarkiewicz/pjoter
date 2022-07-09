import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleSorterTest extends AbstractNumberSorterTest<Double> {
    @Override
    protected Double[] givenSortedInput(Double[] unsortedInput) {
        List<Double> copy = Arrays.asList(unsortedInput);
        return  copy.stream().sorted().toArray(Double[]::new);
    }


    @Override
    protected Double[] givenUnsortedInput() {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            result.add(r.nextDouble());
        }
        return result.toArray(new Double[listLength]);
    }
}
