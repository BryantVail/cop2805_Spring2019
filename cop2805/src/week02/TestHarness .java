package week02;

import test.AbstractTestHarness;


public class TestHarness extends AbstractTestHarness
{

	public static void main(String[] args)
	{
		new TestHarness().runTests();

	}

	protected void runTests()
	{
		try
		{
			boolean javadocTest = executeTest(JUnitJavadocValidation.class);
			boolean iteratorTest = executeTest(JUnitIteratorTest.class);
			boolean result = javadocTest && iteratorTest;

			trace(result ? "Tests Passed" : "Tests Failed");
		}
		catch(Exception ex)
		{
			trace(ex.getMessage());
		}
	}
}
