package prepare.algorithms.warmup._1_solve_me_first;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	@Test
	public void testSolution() {
		List<AbstractSolution> solutions = List.of(
			new BitShifting()
		);

		for (AbstractSolution s : solutions) {
			assertEquals(5, s.solveMeFirst(2, 3));
			assertEquals(1100, s.solveMeFirst(100, 1000));
		}
	}

}
