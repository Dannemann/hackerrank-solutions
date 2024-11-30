package prepare.datastructures.arrays._1_arrays_ds;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Fav_OneForLoopOnly(),
                new WhileSwap(),
                new IntRangeCollectionsSwap(),
                new ForLoop(),
                new IntStreamRange(),
                new AddingBackwards()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(List.of(2, 3, 4, 1), s.reverseArray(Arrays.asList(1, 4, 3, 2)));
            // Custom:
            assertEquals(List.of(3, 2, 1), s.reverseArray(Arrays.asList(1, 2, 3)));
            assertEquals(List.of(4, 66, 122, 556, 234), s.reverseArray(Arrays.asList(234, 556, 122, 66, 4)));
        }
    }

}
