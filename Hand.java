package poo;

import java.util.ArrayList;

public class Hand {

	public ArrayList<Cards> hand1;
	public ArrayList<Cards> hand2;
	
	public Hand() {
		
		hand1 = new ArrayList<>();
		for (int i = 0; i <= 30; i++) {
			hand1.add(new Taticas("t", 0, "t"));
		}
		hand2 = new ArrayList<>();
		for (int i = 0; i <= 30; i++) {
			hand2.add(new Taticas("t", 0, "t"));
		}
	
	}
}
