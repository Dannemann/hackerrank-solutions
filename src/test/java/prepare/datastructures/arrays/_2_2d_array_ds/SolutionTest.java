package prepare.datastructures.arrays._2_2d_array_ds;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(19, s.hourglassSum(input0()));
            assertEquals(13, s.hourglassSum(input1()));
            assertEquals(28, s.hourglassSum(input8()));
        }
    }

    List<List<Integer>> input0() {
        List<List<Integer>> r = new ArrayList<>(6);
        r.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        r.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        r.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        r.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        r.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        r.add(Arrays.asList(0, 0, 1, 2, 4, 0));
        return r;
    }

    List<List<Integer>> input1() {
        List<List<Integer>> r = new ArrayList<>(6);
        r.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        r.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        r.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        r.add(Arrays.asList(0, 9, 2, -4, -4, 0));
        r.add(Arrays.asList(0, 0, 0, -2, 0, 0));
        r.add(Arrays.asList(0, 0, -1, -2, -4, 0));
        return r;
    }

    List<List<Integer>> input8() {
        List<List<Integer>> r = new ArrayList<>(6);
        r.add(Arrays.asList(-9, -9, -9, 1, 1, 1));
        r.add(Arrays.asList(0, -9, 0, 4, 3, 2));
        r.add(Arrays.asList(-9, -9, -9, 1, 2, 3));
        r.add(Arrays.asList(0, 0, 8, 6, 6, 0));
        r.add(Arrays.asList(0, 0, 0, -2, 0, 0));
        r.add(Arrays.asList(0, 0, 1, 2, 4, 0));
        return r;
    }

}
