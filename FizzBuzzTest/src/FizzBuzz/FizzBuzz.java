package FizzBuzz;


public class FizzBuzz {

	static String word;
	private static FizzBuzz testFizzBuzz;
	
	public static void main(String[] args) {

		testFizzBuzz = new FizzBuzz();
		for (int i = 1; i < 100; i++) {
			testFizzBuzz.printFizzBuzz(i);

		}
		System.out.println("ISTO");


	}

	public String printFizzBuzz(int givenNumber) {
		word = "";

		if (givenNumber % 3 == 0) {
			word += "fizz";
		}

		if (givenNumber % 5 == 0) {
			word += "buzz";
		}

		if (word == "") {
			System.out.println(givenNumber);
			return word;
		} else {
			System.out.println(word);
			return word;
		}

	}

}

//for (int i = 1; i < 100; i++) {
//	word = "";
//
//	if (i % 3 == 0) {
//		word += "fizz";
//	}
//
//	if (i % 5 == 0) {
//		word += "buzz";
//	}
//
//	if (word == "") {
//		System.out.println(i);
//	} else {
//		System.out.println(word + " -----------------   " + i);
//	}
//
//}