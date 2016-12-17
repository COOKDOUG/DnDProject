package CharacterCreation;

import Dice.dice;
import Dice.*;
import java.util.Scanner;

public class Character {

	private int strength;
	private int dexterity;
	private int intellect;
	private int wisdom;
	private int constitution;
	private int charisma;
	
	private String charClass;
	private String charClassAbbr;
	
	private int hitPoints;
	
	public Character (){
		strength 		= getStats();
		System.out.println(strength+" strength");
		dexterity 		= getStats();
		System.out.println(dexterity+" dexterity");
		intellect 		= getStats();
		System.out.println(intellect+" intellect");
		wisdom 			= getStats();
		System.out.println(wisdom+" wisdom");
		constitution 	= getStats();
		System.out.println(constitution+" constitution");
		charisma 		= getStats();
		System.out.println(charisma+" charisma");
		
		charClass		= getCharClass();
		System.out.println(charClass+" charClass");
		
		hitPoints		= getHP(charClassAbbr);
		System.out.println(hitPoints+" hitPoints");
	}
	
	private int getStats(){
		dice six = new d6();
		int min = 6;
		int statValue = 0;
		for (int i = 0; i < 4 ; i++){
			int value = six.roll();
			if (value < min){
				min = value;
			}
			statValue += value;
		}
		statValue -= min - 2;
		return Math.max(statValue, 8);
	}
	
	private String getCharClass(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter (f)ighter, (c)leric, (m)age, (n)ecromancer, (a)dventurer, (p)aladin, (r)anger, r(o)gue");
		charClassAbbr = s.nextLine().toLowerCase();
		s.close();
		switch(charClassAbbr){
		case "c":
			return "Cleric";
		case "f":
			return "Fighter";
		case "m":
			return "Mage";
		case "n":
			return "Necromancer";
		case "o":
			return "Rogue";
		case "p":
			return "Paladin";
		case "r":
			return "Ranger";
		default:
			return "Adventurer";
		}
	
	}
	
	private int getHP(String s){
		switch(s){
			case "c":
				dice c8 = new d8();
				return c8.roll();
			case "f":
				dice f12 = new d12();
				return f12.roll();
			case "m":
				dice m4 = new d4();
				return m4.roll();
			case "n":
				dice n4 = new d4();
				return n4.roll();
			case "o":
				dice o6 = new d6();
				return o6.roll();
			case "p":
				dice p20 = new d20();
				return p20.roll();
			case "r":
				dice r8 = new d8();
				return r8.roll();
			default:
				dice a10 = new d10();
				return a10.roll();
		}
	}
}
