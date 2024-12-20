package prepare.datastructures.arrays._5_sparse_arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
                new ManualHashMap()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(List.of(2, 1, 0), s.matchingStrings(input10_1(), input10_2()));
            assertEquals(List.of(1, 0, 1), s.matchingStrings(input11_1(), input11_2()));
            assertEquals(List.of(1, 3, 4, 3, 2), s.matchingStrings(input12_1(), input12_2()));
        }
    }

    List<String> input10_1() {
        List<String> r = new ArrayList<>(4);
        r.add("aba");
        r.add("baba");
        r.add("aba");
        r.add("xzxb");
        return r;
    }

    List<String> input10_2() {
        List<String> r = new ArrayList<>(3);
        r.add("aba");
        r.add("xzxb");
        r.add("ab");
        return r;
    }

    List<String> input11_1() {
        List<String> r = new ArrayList<>(3);
        r.add("def");
        r.add("de");
        r.add("fgh");
        return r;
    }

    List<String> input11_2() {
        List<String> r = new ArrayList<>(3);
        r.add("de");
        r.add("lmn");
        r.add("fgh");
        return r;
    }

    List<String> input12_1() {
        List<String> r = new ArrayList<>(13);
        r.add("abcde");
        r.add("sdaklfj");
        r.add("asdjf");
        r.add("na");
        r.add("basdn");
        r.add("sdaklfj");
        r.add("asdjf");
        r.add("na");
        r.add("asdjf");
        r.add("na");
        r.add("basdn");
        r.add("sdaklfj");
        r.add("asdjf");
        return r;
    }

    List<String> input12_2() {
        List<String> r = new ArrayList<>(5);
        r.add("abcde");
        r.add("sdaklfj");
        r.add("asdjf");
        r.add("na");
        r.add("basdn");
        return r;
    }

}
