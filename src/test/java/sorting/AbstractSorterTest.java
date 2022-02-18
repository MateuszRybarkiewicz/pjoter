package sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public abstract class AbstractSorterTest {
    private static Random r = new Random();
    
    @Test
    public void givenInputItIsSorted(){
        Integer [] input = generateInput(100);
        Sorter sorter = getSorter();
        Integer[] result = sorter.sort(input);
        Arrays.sort(input);
        for(int i =0;i< input.length;i++){
            assertEquals(input[i], result[i]);
        }
    }

    private Integer[] generateInput(int length) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<length;i++){
            result.add(r.nextInt(Integer.MAX_VALUE));
        }
        return result.toArray(new Integer[length]);
    }
    protected abstract Sorter getSorter();
}
