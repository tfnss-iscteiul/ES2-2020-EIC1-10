package test_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import FizzBuzz.*;

class FizzBuzzJUnit {

	static String word;
	private static FizzBuzz fizzbuzz;;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fizzbuzz = new FizzBuzz();

	}

	@Test
	void testNotNull() {
		assertNotNull(fizzbuzz.printFizzBuzz(3));
	}

	@Test
	void emptyTest() {
		word = "";
		assertEquals(word, fizzbuzz.printFizzBuzz(1));

	}

	@Test
	void fizzTest() {
		word = "fizz";
		assertEquals(word, fizzbuzz.printFizzBuzz(84));

	}

	@Test
	void buzzTest() {
		word = "buzz";
		assertEquals(word, fizzbuzz.printFizzBuzz(100));

	}

	@Test
	void fizzbuzzTest() {
		word = "fizzbuzz";
		assertEquals(word, fizzbuzz.printFizzBuzz(90));

	}
	
	@Test
	void mainTest() {
		String test []= {"Test Main Method"};
		FizzBuzz.main(test);

	}

}
