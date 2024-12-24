package prepare.datastructures.arrays._6_array_manipulation;

import java.util.List;
import java.util.TreeMap;

public class SortedPrefixSum extends AbstractSolution {

    long arrayManipulation(int n, List<List<Integer>> queries) {
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();

        for (List<Integer> q : queries) {
            int a = q.get(0) - 1;
            Integer b = q.get(1);
            Integer k = q.get(2);
            Integer aVal = sortedMap.get(a);
            Integer bVal = sortedMap.get(b);

            sortedMap.put(a, aVal == null ? k : aVal + k);
            sortedMap.put(b, bVal == null ? -k : bVal - k);
        }

        long biggest = 0;
        long sum = 0;

        for (Integer i : sortedMap.values())
            biggest = Math.max(biggest, sum += i);

        return biggest;
    }

}
