package prepare.datastructures.arrays._6_array_manipulation;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;
import static utils.ListUtils.integerList;

public class SolutionTest {

    @Test
    public void testSolution() {
        List<AbstractSolution> solutions = List.of(
//                new BubbleByPosition(), // Too slow.
                new SortedPrefixSum(),
                new DifferenceArray()
        );

        for (AbstractSolution s : solutions) {
            assertEquals(200, s.arrayManipulation(5, input0()));
            assertEquals(7515267971L, s.arrayManipulation(4000, input6()));
            assertEquals(2490686975L, s.arrayManipulation(10000000, input13()));
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

    List<List<Integer>> input6() {
        return readInput("input06.txt", 30000);
    }

    List<List<Integer>> input13() {
        return readInput("input13.txt", 100000);
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

    private static List<List<Integer>> readInput(String inputFile, int initialCapacity) {
        List<List<Integer>> r = new ArrayList<>(initialCapacity);
        File input = new File(SolutionTest.class.getResource(inputFile).getFile());
        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] items = line.split(" ");
                r.add(integerList(parseInt(items[0]), parseInt(items[1]), parseInt(items[2])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

}
