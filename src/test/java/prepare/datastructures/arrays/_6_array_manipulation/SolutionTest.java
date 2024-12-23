package prepare.datastructures.arrays._6_array_manipulation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utils.ListUtils.integerList;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new Solution()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(200, s.arrayManipulation(5, input0()));
            assertEquals(10, s.arrayManipulation(10, input14()));
            assertEquals(31, s.arrayManipulation(10, input15()));
        }
    }

    List<List<Integer>> input0() {
        List<List<Integer>> r = new ArrayList<>(3);
        r.add(integerList(1, 2, 100));
        r.add(integerList(2, 5, 100));
        r.add(integerList(3, 4, 100));
        return r;
    }

    List<List<Integer>> input14() {
        List<List<Integer>> r = new ArrayList<>(3);
        r.add(integerList(1, 5, 3));
        r.add(integerList(4, 8, 7));
        r.add(integerList(6, 9, 1));
        return r;
    }

    List<List<Integer>> input15() {
        List<List<Integer>> r = new ArrayList<>(4);
        r.add(integerList(2, 6, 8));
        r.add(integerList(3, 5, 7));
        r.add(integerList(1, 8, 1));
        r.add(integerList(5, 9, 15));
        return r;
    }

}
