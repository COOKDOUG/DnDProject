package Dice;

public class d6 implements dice {

	@Override
	public int roll() {
		int randomNumber = (int) (Math.random() * 6);
		return Math.max(randomNumber, 1);
	}

}
