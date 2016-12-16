package Dice;

public class d12 implements dice {

	@Override
	public int roll() {
		int randomNumber = (int) (Math.random() * 12);
		return Math.max(randomNumber, 1);
	}

}
