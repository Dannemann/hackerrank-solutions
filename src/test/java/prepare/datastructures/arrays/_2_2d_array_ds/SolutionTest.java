package prepare.datastructures.arrays._2_2d_array_ds;

import org.junit.Test;

import java.util.ArrayList;
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
            assertEquals(19, s.hourglassSum(input1()));
            assertEquals(13, s.hourglassSum(input2()));
            assertEquals(28, s.hourglassSum(input3()));
        }
    }

    List<List<Integer>> input1() {
        List<List<Integer>> x = new ArrayList<>();
        x.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        x.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        x.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        x.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        x.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        x.add(Arrays.asList(0, 0, 1, 2, 4, 0));
        return x;
    }

    List<List<Integer>> input2() {
        List<List<Integer>> x = new ArrayList<>();
        x.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        x.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        x.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        x.add(Arrays.asList(0, 9, 2, -4, -4, 0));
        x.add(Arrays.asList(0, 0, 0, -2, 0, 0));
        x.add(Arrays.asList(0, 0, -1, -2, -4, 0));
        return x;
    }

    List<List<Integer>> input3() {
        List<List<Integer>> x = new ArrayList<>();
        x.add(Arrays.asList(-9, -9, -9, 1, 1, 1));
        x.add(Arrays.asList(0, -9, 0, 4, 3, 2));
        x.add(Arrays.asList(-9, -9, -9, 1, 2, 3));
        x.add(Arrays.asList(0, 0, 8, 6, 6, 0));
        x.add(Arrays.asList(0, 0, 0, -2, 0, 0));
        x.add(Arrays.asList(0, 0, 1, 2, 4, 0));
        return x;
    }

}
