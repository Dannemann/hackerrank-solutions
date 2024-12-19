package prepare.datastructures.arrays._4_left_rotation;

import java.util.List;

class ListAddRemove extends AbstractSolution {

    List<Integer> rotateLeft(int d, List<Integer> arr) {
        for (int i = 0; i < d; i++)
            arr.add(arr.remove(0));

        return arr;
    }

}
