//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TwoToTen {
	private String binary;

	public TwoToTen() {
		
	}

	public TwoToTen(String binary) {
		setBinary(binary);
	}

	public void setBinary(String binary) {
		this.binary = binary;
	}

	public long getBaseTen() {
		long number = 0;
		boolean[] bin = new boolean[binary.length()];
		for (int i = binary.length() - 1; i > -1; i--) {
			bin[i] = binary.charAt(i) == '1';
		}
		int pos = 1;
		for (byte i = (byte) (bin.length - 1); i > -1; i--) {
			if (bin[i])
				number += pos;
			pos *= 2;
		}
		return number;
	}

	public String toString() {
		return binary + " == " + getBaseTen();
	}
}