package prepare.datastructures.arrays._3_dynamic_array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = Arrays.asList(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(null, s.dynamicArray(0, null));
        }
    }

}
