package chapter6;

public class CardCompany2 {
 
	public static CardCompany getInstance() {
		if (instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
}
