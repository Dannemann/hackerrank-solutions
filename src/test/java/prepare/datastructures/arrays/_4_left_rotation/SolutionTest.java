package prepare.datastructures.arrays._4_left_rotation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new AddAllSublists(),
                new SystemArrayCopy(),
                new TwoForLoops()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(List.of(5, 1, 2, 3, 4), s.rotateLeft(4, input0()));
            // Custom:
            assertEquals(List.of(10, 20, 30, 40, 50), s.rotateLeft(5, customInput0()));
            assertEquals(List.of(20, 30, 40, 50, 10), s.rotateLeft(1, customInput0()));
        }
    }

    List<Integer> input0() {
        List<Integer> r = new ArrayList<>(5);
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);
        return r;
    }

    List<Integer> customInput0() {
        List<Integer> r = new ArrayList<>(5);
        r.add(10);
        r.add(20);
        r.add(30);
        r.add(40);
        r.add(50);
        return r;
    }

}
