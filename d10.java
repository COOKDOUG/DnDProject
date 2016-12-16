package Dice;

public class d10 implements dice {

	@Override
	public int roll() {
		int randomNumber = (int) (Math.random() * 10);
		return Math.max(randomNumber, 1);
	}

}
