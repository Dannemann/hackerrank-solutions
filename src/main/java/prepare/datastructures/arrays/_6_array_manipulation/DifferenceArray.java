package prepare.datastructures.arrays._6_array_manipulation;

import java.util.List;

public class DifferenceArray extends AbstractSolution {

    long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] array = new long[n];

        for (List<Integer> q : queries) {
            int b = q.get(1);
            int k = q.get(2);

            array[q.get(0) - 1] += k;

            if (b < n)
                array[b] -= k;
        }

        long biggest = Long.MIN_VALUE;
        long marker = array[0];

        for (int i = 1, l = array.length; i < l; i++) {
            long sum = array[i] + marker;

            if (sum != marker)
                biggest = Math.max(biggest, marker = sum);
        }

        return biggest;
    }

}
