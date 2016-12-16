package Dice;

public class d4 implements dice {

	@Override
	public int roll() {
		int randomNumber = (int) (Math.random() * 4);
		return Math.max(randomNumber, 1);
	}

}
