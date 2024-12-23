package prepare.datastructures.arrays._6_array_manipulation;

import java.util.List;

public class Bubble extends AbstractSolution {

    long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] array = new long[n];
        long biggest = Long.MIN_VALUE;

        for (List<Integer> q : queries) {
            int b = q.get(1);
            int k = q.get(2);

            for (int i = q.get(0) - 1; i < b; i++)
                biggest = Math.max(array[i] += k, biggest);
        }

        return biggest;
    }

}
