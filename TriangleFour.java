public class TriangleFive {

	private char letter;
	private int amount;
	
	public TriangleFive() {
		if (getRandomBoolean())
			setLetter(getRandomChar('A', 'Z'));
		else
			setLetter(getRandomChar('a', 'z'));
		setAmount(getRandomInteger(1, 5));
	}
	
	public TriangleFive(char letter, int amount) {
		setLetter(letter);
		setAmount(amount);
	}
	
	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		String to = "";
		char letter = this.letter;
		int amount = this.amount;
		for (int times = 0; times < amount; times++) {
			for (int i = 0; i < amount; i++) {
				for (int a = amount; a > i; a--) {
					to += (char) (letter + i);
				}
				to += " ";
			}
			amount--;
			to += "\n";
		}
		return to;
	}
}