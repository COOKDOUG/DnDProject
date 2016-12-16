package Dice;

public class d8 implements dice {

	@Override
	public int roll() {
		int randomNumber = (int) (Math.random() * 8);
		return Math.max(randomNumber, 1);
	}

}
