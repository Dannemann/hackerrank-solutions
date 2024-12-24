package prepare.datastructures.arrays._6_array_manipulation;

import java.util.List;

public class BruteForceByPosition extends AbstractSolution {

    long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] array = new int[n];
        long biggest = 0;

        for (List<Integer> q : queries) {
            Integer b = q.get(1);
            Integer k = q.get(2);

            for (int i = q.get(0) - 1; i < b; i++)
                biggest = Math.max(array[i] += k, biggest);
        }

        return biggest;
    }

}
