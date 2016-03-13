package test;


import ctci.Permutations;
import junit.framework.TestCase;

public class TestArrayProblems extends TestCase {

	public TestArrayProblems(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPermutations()
	{
		assertEquals(false, Permutations.permutation("KRUTI", "DOLL"));
		assertEquals(false, Permutations.permutation("", "DOLL"));
		assertEquals(false, Permutations.permutation(null, "DOLL"));
		assertEquals(true, Permutations.permutation("OLLD", "DOLL"));
		
	}
}
