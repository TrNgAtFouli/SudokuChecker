import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.

	// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
	String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);

	}

	@Test
	public void testStringContainsNumberZero() {
		String s = "123456789912345678891234567789123456678912345567891234456789123345678912234567890";
		int a = v.verify(s);
		assertEquals("incorrect string", a, -1);
	}

	@Test
	public void testStringContainsNegativeNumber_minus1() {
		String s = "-123456789912345678891234567789123456678912345567891234456789123345678912234567893";
		int a = v.verify(s);
		assertEquals("incorrect string", a, -1);
	}


	@Test
	public void testStringContainsNumberAppearTwice() {
		String s = "113456789912345678891234567789123456678912345567891234456789123345678912234567893";
		int a = v.verify(s);
		assertEquals("incorrect string", a, -2);
	}


	@Test
	public void testStringContainsNumberBeyondNine_InputNumber10() {
		String s = "113456789912345678891234567789123456678912345567891234456789123345678912234567810";
		int a = v.verify(s);
		assertEquals("incorrect string", a, -1);
	}

}
