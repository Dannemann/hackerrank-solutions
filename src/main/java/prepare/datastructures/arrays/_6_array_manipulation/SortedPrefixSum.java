package prepare.datastructures.arrays._6_array_manipulation;

import java.util.Arrays;
import java.util.List;

public class SortedPrefixSum extends AbstractSolution {

    static class SortedQuery implements Comparable<SortedQuery> {
        int index;
        int val;

        public SortedQuery(int index, int val) {
            this.index = index;
            this.val = val;
        }

        public int compareTo(SortedQuery o) {
            return index - o.index;
        }
    }

    long arrayManipulation(int n, List<List<Integer>> queries) {
        int len = queries.size();
        SortedQuery[] sortedQueries = new SortedQuery[len * 2];

        for (int i = 0; i < len; i++) {
            List<Integer> q = queries.get(i);
            Integer a = q.get(0);
            Integer b = q.get(1);
            Integer k = q.get(2);

            sortedQueries[i * 2] = new SortedQuery(a - 1, k);
            sortedQueries[i * 2 + 1] = new SortedQuery(b, -k);
        }

        Arrays.sort(sortedQueries);

        long biggest = 0;
        long sum = 0;
        int prevIndex = 0;

        for (SortedQuery sq : sortedQueries) {
            if (sq.index > n)
                break;

            if (sq.index == prevIndex)
                 sum += sq.val;
            else {
                biggest = Math.max(biggest, sum);
                sum += sq.val;
                prevIndex = sq.index;
            }
        }

        return biggest;
    }

}
