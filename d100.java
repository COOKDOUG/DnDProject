package Dice;

public class d100 implements dice {

	@Override
	public int roll() {
		int randomNumber = (int) (Math.random() * 100);
		return Math.max(randomNumber, 1);
	}

}
