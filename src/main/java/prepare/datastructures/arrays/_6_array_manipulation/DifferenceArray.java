package prepare.datastructures.arrays._6_array_manipulation;

import java.util.List;

public class DifferenceArray extends AbstractSolution {

    long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] array = new int[n + 1];

        for (List<Integer> q : queries) {
            Integer k = q.get(2);

            array[q.get(0) - 1] += k;
            array[q.get(1)] -= k;
        }

        long biggest = 0;
        long marker = array[0];

        for (int i = 1, l = array.length; i < l; i++) {
            long sum = array[i] + marker;

            if (sum != marker)
                biggest = Math.max(biggest, marker = sum);
        }

        return biggest;
    }

}
