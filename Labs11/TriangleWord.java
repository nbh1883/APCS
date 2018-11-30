//Name -

//Date -

//Class - 

//Lab  -



import static java.lang.System.*;



class TriangleWord {

	private String word;



	public TriangleWord() {

		word = "";



	}



	public TriangleWord(String w) {

		word = w;



	}



	public void setWord(String w) {

		word = w;



	}



	public static String createTriangle(String input) {

		String inp = input;

		StringBuffer sb = new StringBuffer(inp);

		String output = "";

		int count = 0;

		int count2 = 1;

		if (inp.length() == 1)

			return inp;

		if (inp.length() % 2 == 1)

			for (int q = 0; q < (inp.length() / 2); q++) {

				output += " ";

			}

		else

			for (int q = 0; q < (inp.length() / 2) - 1; q++)

				output += "  ";

		for (int p = 0; p < inp.length(); p++) {

			for (int i = 0; i < (inp.length() / 2) - 1; i++) {

				output += "  ";



			}

			if (count < inp.length() - 1) {

				output += " " + inp.charAt(count) + "\n";

				count++;

			}

			for (int k = 1; k < count; k++) {

				output += "";

			}

			if (count2 < inp.length() - 1) {

				output += " " + inp.charAt(count2);

				count2++;

			}

		}

		output += sb.reverse() + inp.substring(1);



		return output;



	}

}