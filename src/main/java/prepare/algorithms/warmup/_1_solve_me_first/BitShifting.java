package prepare.algorithms.warmup._1_solve_me_first;

class BitShifting extends AbstractSolution {

	int solveMeFirst(int a, int b) {
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}

		return a;
	}

}
