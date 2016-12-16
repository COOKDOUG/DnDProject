package Dice;

public class d20 implements dice {

	@Override
	public int roll() {
		int randomNumber = (int) (Math.random() * 20);
		return Math.max(randomNumber, 1);
	}

}
